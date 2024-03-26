package com.techmania.photoalbumapplication.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.techmania.photoalbumapplication.model.MyImages


@Dao
interface MyImagesDao {
    @Insert
    suspend fun insert(myImages: MyImages)

    @Update
    suspend fun update(myImages: MyImages)

    @Delete
    suspend fun delete(myImages: MyImages)

    @Query("Select * from my_images order by imageId ASC")
    fun getAllImages(): LiveData<List<MyImages>>
}