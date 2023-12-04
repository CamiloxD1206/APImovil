@file:Suppress("UNREACHABLE_CODE")

package com.example.myapi

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface APIservice {
    @GET
    fun getDogsByBreeds(@Url url:String):Response<DogResponse>{
        return TODO("Provide the return value")
    }
}