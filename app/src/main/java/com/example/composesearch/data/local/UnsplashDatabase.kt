package com.example.composesearch.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.composesearch.data.local.dao.UnsplashImageDao
import com.example.composesearch.data.local.dao.UnsplashRemoteKeysDao
import com.example.composesearch.model.Converters
import com.example.composesearch.model.UnsplashImage
import com.example.composesearch.model.UnsplashRemoteKeys

@Database(entities = [UnsplashImage::class, UnsplashRemoteKeys::class], version = 4)
@TypeConverters(Converters::class)
abstract class UnsplashDatabase : RoomDatabase() {

    abstract fun unsplashImageDao(): UnsplashImageDao
    abstract fun unsplashRemoteKeysDao(): UnsplashRemoteKeysDao

}