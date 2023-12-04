package com.example.myapi

import com.google.gson.annotations.SerializedName

class DogResponse(
    @SerializedName("status") var status:String,
    @SerializedName("message") var message:List<String>
)