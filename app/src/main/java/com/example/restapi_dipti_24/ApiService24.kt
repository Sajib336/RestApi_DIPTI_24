package com.example.restapi_dipti_24


import retrofit2.http.GET

interface ApiService24 {
    @GET("products")
    suspend fun getProducts(): List<Product24>
}