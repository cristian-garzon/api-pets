package com.curso.crud.kotlin.Dto


data class PetDto(
    var id: Long?,
    var name: String?,
    var age: Int?,
    var type: String?,
    var photo: Byte?
)
