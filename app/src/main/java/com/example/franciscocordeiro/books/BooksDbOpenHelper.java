package com.example.franciscocordeiro.books;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BooksDbOpenHelper extends SQLiteOpenHelper {

    private static final int VERSION = 1;
    private static final String DATABASE_NAME = "Books.db";
    private static final SQLiteDatabase.CursorFactory FACTORY = null;

    public BooksDbOpenHelper(Context context) {
        super(context, DATABASE_NAME, FACTORY, VERSION);
    }

    public void onCreate(SQLiteDatabase db) {

    }


    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
