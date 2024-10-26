package com.example.restapi_dipti_24

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object ApiInterface24 {
    val retroFit = Retrofit.Builder()
        .baseUrl("https://api.escuelajs.co/api/v1/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiService = retroFit.create(ApiService24::class.java)
}