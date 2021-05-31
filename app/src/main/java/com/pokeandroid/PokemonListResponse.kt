package com.pokeandroid

import com.pokeandroid.Pokemon


data class PokemonListResponse(
    val count: Int,
    val next: String,
    val results: List<Pokemon>
)