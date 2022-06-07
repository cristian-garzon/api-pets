package com.curso.crud.kotlin.Service

import com.curso.crud.kotlin.Entity.Pet
import com.curso.crud.kotlin.Repository.PetRepository
import org.springframework.stereotype.Service

@Service
class PertService(private val petRepository:PetRepository) {
    fun getAllPets(): List<Pet> = petRepository.findAll()
}