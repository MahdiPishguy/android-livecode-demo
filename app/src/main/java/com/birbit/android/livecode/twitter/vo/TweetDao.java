package com.birbit.android.livecode.twitter.vo;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.DaoConfig;
import de.greenrobot.dao.Property;

import com.birbit.android.livecode.twitter.vo.Tweet;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/**
 * DAO for table TWEET.
*/
public class TweetDao extends AbstractDao<Tweet, Void> {

    public static final String TABLENAME = "TWEET";

    /**
     * Properties of entity Tweet.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id =new Property(0, String.class , "id", false, "id_str");
        public final static Property Retweeted =new Property(1, Boolean.class , "retweeted", false, "RETWEETED");
        public final static Property Text =new Property(2, String.class , "text", false, "TEXT");
        public final static Property CreatedAt =new Property(3, java.util.Date.class , "createdAt", false, "CREATED_AT");
        public final static Property UserId =new Property(4, String.class , "userId", false, "USER_ID");
        public final static Property Favorited =new Property(5, Boolean.class , "favorited", false, "FAVORITED");
    };


    public TweetDao(DaoConfig config) {
        super(config);
    }

    public TweetDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'TWEET' (" + //
                "'id_str' TEXT," + // 0: id
                "'RETWEETED' INTEGER," + // 1: retweeted
                "'TEXT' TEXT," + // 2: text
                "'CREATED_AT' INTEGER," + // 3: createdAt
                "'USER_ID' TEXT," + // 4: userId
                "'FAVORITED' INTEGER);"); // 5: favorited
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'TWEET'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Tweet entity) {
        stmt.clearBindings();
        entity.onBeforeSave();
 
        String id = entity.getId();
        if (id != null) {
            stmt.bindString(1, id);

        }
 
        Boolean retweeted = entity.getRetweeted();
        if (retweeted != null) {
            stmt.bindLong(2, retweeted ? 1l: 0l);

        }
 
        String text = entity.getText();
        if (text != null) {
            stmt.bindString(3, text);

        }
 
        java.util.Date createdAt = entity.getCreatedAt();
        if (createdAt != null) {
            stmt.bindLong(4, createdAt.getTime());

        }
 
        String userId = entity.getUserId();
        if (userId != null) {
            stmt.bindString(5, userId);

        }
 
        Boolean favorited = entity.getFavorited();
        if (favorited != null) {
            stmt.bindLong(6, favorited ? 1l: 0l);

        }
    }

    /** @inheritdoc */
    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }

    /** @inheritdoc */
    @Override
    public Tweet readEntity(Cursor cursor, int offset) {
        Tweet entity = new Tweet( //

            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0) , // id
            cursor.isNull(offset + 1) ? null : cursor.getShort(offset + 1) != 0 , // retweeted
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2) , // text
            cursor.isNull(offset + 3) ? null : new java.util.Date( cursor.getLong(offset + 3) ) , // createdAt
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4) , // userId
            cursor.isNull(offset + 5) ? null : cursor.getShort(offset + 5) != 0 // favorited
        );
        return entity;
    }

    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Tweet entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0) );
        entity.setRetweeted(cursor.isNull(offset + 1) ? null : cursor.getShort(offset + 1) != 0 );
        entity.setText(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2) );
        entity.setCreatedAt(cursor.isNull(offset + 3) ? null : new java.util.Date( cursor.getLong(offset + 3) ) );
        entity.setUserId(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4) );
        entity.setFavorited(cursor.isNull(offset + 5) ? null : cursor.getShort(offset + 5) != 0 );
     }

    /** @inheritdoc */
    @Override
    protected Void updateKeyAfterInsert(Tweet entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }

    /** @inheritdoc */
    @Override
    public Void getKey(Tweet entity) {
        return null;
    }

    /** @inheritdoc */
    @Override
    protected boolean isEntityUpdateable() {
        return true;
    }

}
