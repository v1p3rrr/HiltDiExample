package com.example.compose.data.remote

import retrofit2.Response
import retrofit2.http.GET

interface DemoApi {
    @GET("/whatever")
    fun getWhatever(): Response<Unit>
}