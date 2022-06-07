package com.curso.crud.kotlin.Repository

import com.curso.crud.kotlin.Entity.Pet
import org.springframework.data.jpa.repository.JpaRepository

interface PetRepository : JpaRepository<Pet, Long>{
}