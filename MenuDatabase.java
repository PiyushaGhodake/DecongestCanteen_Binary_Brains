package com.piyusha.foodorderingapp;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
@Database(entities = {Dishes.class},exportSchema = false,version=1)
public abstract class MenuDatabase extends RoomDatabase {

   private static final String DB_NAME="FoodItemsDB";
   /* private static MenuDatabase instance;

   public static synchronized MenuDatabase getDB(Context context){
        if(instance==null){
            instance= Room.databaseBuilder(context,MenuDatabase.class,DB_NAME).fallbackToDestructiveMigrationFrom().allowMainThreadQueries().build();


        }
        return instance;
    }*/
    //public abstract Dishes dishes();
    public abstract DishesDao Dishesdao();
}
