package com.curso.crud.kotlin.Service

import com.curso.crud.kotlin.Dto.PetDto
import java.util.function.DoubleToIntFunction

interface IPetService {
    fun getAllPets(): List<PetDto>?
    fun getPetById(id: Long): PetDto
}