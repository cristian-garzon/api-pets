package com.curso.crud.kotlin.Entity

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

@Entity
data class Pet (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    val name: String?,
    val age: Int?,
    val type: String?,
    @Lob
    val photo: Byte?,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_person")
    val person: Person?
)