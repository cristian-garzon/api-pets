package com.curso.crud.kotlin.Service

import com.curso.crud.kotlin.Dto.PetDto
import com.curso.crud.kotlin.Repository.PetRepository
import com.curso.crud.kotlin.Utils.Mapper.ModelMapper.PetMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PertService(
    private val petRepository:PetRepository,
    private val petMapper: PetMapper
) : IPetService {
    override fun getAllPets(): List<PetDto>? = null
    override fun getPetById(id: Long): PetDto = petMapper.fromEntity(petRepository.getById(id))
}