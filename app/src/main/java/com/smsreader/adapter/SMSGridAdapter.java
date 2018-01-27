package com.smsreader.adapter;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import com.smsreader.R;
import com.smsreader.constants.Constants;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by davidvarghese on 1/27/18.
 */

public class SMSGridAdapter extends CursorAdapter {

    public static final String TAG = SMSGridAdapter.class.getSimpleName();

    private Context mContext;
    private SimpleDateFormat mSimpleDateFormat;

    public SMSGridAdapter(Context context) {
        super(context, null, false);
        mContext = context;
        mSimpleDateFormat = new SimpleDateFormat("dd-MMM-YYYY HH:mm aa");
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(mContext).inflate(R.layout.gridview_item, null, false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        TextView senderName = view.findViewById(R.id.txt_sender_id);
        TextView recievedTime = view.findViewById(R.id.txt_receved_time);
        senderName.setText(cursor.getString(cursor.getColumnIndex(Constants.SMSListColumns.COLUMN_ADDRESS)));
        recievedTime.setText(getDate(cursor.getLong(cursor.getColumnIndex(Constants.SMSListColumns.COLUMN_RECIEVED_DATE))));
    }

    private String getDate(long time) {
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(time);
        String date = mSimpleDateFormat.format(cal.getTime()).toString();
        return date;
    }
}
