package com.techmania.photoalbumapplication.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.techmania.photoalbumapplication.model.MyImages
import java.security.AccessControlContext

@Database(entities=[MyImages::class], version = 1)
abstract class MyImagesDatabase :RoomDatabase(){

    abstract fun myImagesDao():MyImagesDao

    //singleton Design pattern

    companion object{
        @Volatile //to make the instance cerated from the file to be visible to all threads
        private var instance : MyImagesDatabase? =null

        fun getDatabaseInstance(context:Context):MyImagesDatabase{
            synchronized(this){
                if(instance==null){
                    instance= Room.databaseBuilder(
                        context.applicationContext,
                        MyImagesDatabase::class.java,
                        "my_album"

                    ).build()
                }
                return instance as MyImagesDatabase
            }
        }
    }
}







//applying the folowing to this class
//1->annotaion
//2->abstract and extend RoomDatabase
//3->abstract method returns room database

