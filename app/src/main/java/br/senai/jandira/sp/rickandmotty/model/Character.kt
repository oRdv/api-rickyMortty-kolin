package br.senai.jandira.sp.rickandmotty.model

data class Character(
    val id: Int = 0,
    val name: String = "",
    val status: String = "",
    val species: String = "",
    val type :String = "",
    val gender: String = "",
    val origin: Origin = Origin(),
    val location: Location = Location(),
    val image: String = "",
    val episode: List<String> = listOf<String>(),
    val url: String = "",
    val created: String = ""
)
