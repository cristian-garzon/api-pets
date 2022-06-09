package com.curso.crud.kotlin.Utils.Mapper.ModelMapper

import com.curso.crud.kotlin.Dto.PetDto
import com.curso.crud.kotlin.Entity.Pet
import com.curso.crud.kotlin.Utils.Mapper.Mapper
import org.springframework.stereotype.Component

@Component
class PetMapper: Mapper<PetDto, Pet> {
    override fun fromEntity(entity: Pet): PetDto = PetDto(
        entity.id,
        entity.name,
        entity.age,
        entity.type
    )
    override fun toEntity(domain: PetDto): Pet = Pet(
        domain.id,
        domain.name,
        domain.age,
        domain.type,
        photo = null,
        person = null
    )
}