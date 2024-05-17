package com.example.randomimage.network

import retrofit2.Call
import retrofit2.http.GET

interface DogApi {

    @GET("breeds/image/random")
    fun getRandomImage(): Call<DogAnswer>
}