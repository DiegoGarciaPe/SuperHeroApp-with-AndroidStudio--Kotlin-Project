package com.universae.webdam.superheroapp

import android.adservices.adid.AdId
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("/api/c3ce7e04b085b90e5abd1044bfd8480e/search/{name}")
    suspend fun getSuperheroes(@Path("name") superHeroName: String): Response<SuperHeroDataResponse>

    @GET("/api/c3ce7e04b085b90e5abd1044bfd8480e/{id}")
    suspend fun getSuperheroDetail(@Path("id") superheroId: String):Response<SuperHeroDetailResponse>

}