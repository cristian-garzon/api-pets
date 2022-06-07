package com.curso.crud.kotlin.Controller

import com.curso.crud.kotlin.Entity.Pet
import com.curso.crud.kotlin.Service.PertService
import io.swagger.annotations.Api
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@Api(value = "info for pets", tags = ["Pets"])
@RequestMapping("/api/pet")
@RestController
class PetController (private val petService: PertService) {
    @GetMapping
    fun getAllPets(): List<Pet> = petService.getAllPets()
}