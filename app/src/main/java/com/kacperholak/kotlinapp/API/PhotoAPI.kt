package com.kacperholak.kotlinapp.api

import com.kacperholak.kotlinapp.models.PhotoList
import retrofit2.Call
import retrofit2.http.GET

interface PhotoAPI {
    @GET("?key=6815403-db53fce262d41e6caa5f5a092&q=nature&image_type=photo")
    fun getPhotos() : Call<PhotoList>
}