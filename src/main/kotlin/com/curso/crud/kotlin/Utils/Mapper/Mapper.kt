package com.curso.crud.kotlin.Utils.Mapper

interface Mapper<D, E> {
    fun fromEntity(entity: E): D
    fun toEntity(domain: D): E
}