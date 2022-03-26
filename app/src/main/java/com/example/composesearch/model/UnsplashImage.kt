package com.example.composesearch.model

import androidx.room.*
import com.example.composesearch.util.Constants.UNSPLASH_IMAGE_TABLE
import kotlinx.serialization.*
import kotlinx.serialization.json.Json

@Serializable
@Entity(tableName = UNSPLASH_IMAGE_TABLE)
data class UnsplashImage(

    @PrimaryKey(autoGenerate = false)

 var id: String="1",

//    @Embedded
//    val urls: Urls,

    var `data` : List<Data>
)
{

}
@Serializable
data class Data (


    val product_image_sm : String
)

class Converters {

    @TypeConverter
    fun fromList(value: List<Data>): String {
        return Json.encodeToString(value)
    }
    @TypeConverter
    fun toList(value: String): List<Data> {

        return Json { ignoreUnknownKeys=true }.decodeFromString<List<Data>>(value)
    }



}
