package com.example.restapp


import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


interface BlogService {

    @GET("posts/{id}")
    fun getPost(@Path("id") id: String): Call<Post>
}