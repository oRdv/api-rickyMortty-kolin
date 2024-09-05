package br.senai.jandira.sp.rickandmotty.service

import br.senai.jandira.sp.rickandmotty.model.Character
import br.senai.jandira.sp.rickandmotty.model.Results
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface CharacterService {

    @GET("character/{id}")
        fun getCharacterById(@Path("id") id: Int): Call<Character>

    @GET("character")
    fun getAllCharacters(): Call<Results>

    @GET("episode/{id}")
//    fun getEpisodeById(@Path("id") id: Int): Call<Episode>

    @POST ("login")
    fun login(@Body character: Character): Call<Character>




}