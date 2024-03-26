package com.techmania.photoalbumapplication.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "my_images") //table name in SQLite
class MyImages(
    val imageTitle:String,
    val imageDescription:String,
    val imageAsString:String
) {
    @PrimaryKey(autoGenerate = true)
    var imageId=0
}

//BLOB(binary large object):stores images , multimedia as binary
//String->converting images to string using base64 format:  we will use string and not blob in this project