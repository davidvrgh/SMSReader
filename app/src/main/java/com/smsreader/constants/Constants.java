package com.smsreader.constants;

import android.net.Uri;

/**
 * Created by davidvarghese on 1/27/18.
 */

public class Constants {

    public static final String QUERY_PARAM = "CARD ENDING";
    public static final String TABLE_SMS_LIST = "sms_list";
    public static final String QUERY_CREATE_TABLE_SMS_LIST = "create table " + TABLE_SMS_LIST + "(" + SMSListColumns.COLUMN_ID + " integer primary key autoincrement, "
            + SMSListColumns.COLUMN_SMS_ID + " integer, " + SMSListColumns.COLUMN_ADDRESS + " text, " + SMSListColumns.COLUMN_BODY + " text, "
            + SMSListColumns.COLUMN_RECIEVED_DATE + " text )";
    public static final String QUERY_DROP_TABLE_SMS_LIST = "DROP TABLE IF EXISTS " + TABLE_SMS_LIST;
    public static final String AUTHORITY = "com.smsreader.provider";
    public static final String PATH_SMS_LIST = TABLE_SMS_LIST;
    public static final Uri CONTENT_URI_SMS_LIST = Uri.parse("content://" + AUTHORITY + "/" + PATH_SMS_LIST);
    public static final int CODE_SMS_LIST = 11;

    public static class SMSListColumns {
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_SMS_ID = "sms_id";
        public static final String COLUMN_ADDRESS = "address";
        public static final String COLUMN_BODY = "body";
        public static final String COLUMN_RECIEVED_DATE = "date";
    }

}
