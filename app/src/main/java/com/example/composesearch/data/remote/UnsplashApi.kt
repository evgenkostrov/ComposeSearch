package com.example.composesearch.data.remote

import com.example.composesearch.model.SearchResult
import com.example.composesearch.model.UnsplashImage
import retrofit2.http.GET
import retrofit2.http.Query

interface UnsplashApi {

    @GET("products")
    suspend fun getAllImages(
        @Query("apikey") x: String ="0QFpJVORqhJ5",
        @Query("page") page: Int,
        @Query("limit") perPage: Int
    ): UnsplashImage

//    @Headers("Authorization: Client-ID EMGkZrD69q8SB6spmeGfUFmDvZr9zIS_XBArnTSxG84")
@GET("products")
    suspend fun searchImages(
    @Query("apikey") x: String ="0QFpJVORqhJ5",
        @Query("limit") query: String,
        @Query("page") perPage: Int
    ): SearchResult

}