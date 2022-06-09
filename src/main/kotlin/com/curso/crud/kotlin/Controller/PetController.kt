package com.curso.crud.kotlin.Controller

import com.curso.crud.kotlin.Dto.PetDto
import com.curso.crud.kotlin.Entity.Pet
import com.curso.crud.kotlin.Service.IPetService
import io.swagger.annotations.Api
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@Api(value = "info for pets", tags = ["Pets"])
@RequestMapping("/api/pet")
@RestController
class PetController (private val petService: IPetService) {
    @GetMapping
    fun getAllPets(): List<PetDto>? = petService.getAllPets()
    @GetMapping("/{id}")
    fun getPetById(@PathVariable id: Long): PetDto = petService.getPetById(id);
}