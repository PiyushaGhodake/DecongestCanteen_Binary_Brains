package com.piyusha.foodorderingapp;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;
@Dao //data access object
public interface DishesDao {
    @Insert
    void insert(Dishes dish);

    @Query("SELECT * FROM menu")
    List<Dishes> getalldishes();

   @Delete
    void delete(Dishes dish);
   @Update
    void update(Dishes dish);


}
