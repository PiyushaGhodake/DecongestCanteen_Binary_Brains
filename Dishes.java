package com.piyusha.foodorderingapp;

import androidx.room.ColumnInfo;
import androidx.room.Dao;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "menu")
public class Dishes {
    @PrimaryKey(autoGenerate = true)
    public int tokenid;

    @ColumnInfo(name="Dishname")
   public String name;
   // private String name;
    @ColumnInfo(name="Quantity")
    public int qty;
    //private int qty;

    Dishes(int tokenid,String name,int qty) {
        this.tokenid=tokenid;
        this.name = name;
        this.qty=qty;
    }


   public int getTokenid() {
        return tokenid;
    }

    public void setTokenid(int tokenid) {
        this.tokenid = tokenid;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getQty() {
        return qty;
    }


}
