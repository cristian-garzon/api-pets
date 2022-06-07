package com.curso.crud.kotlin.Entity

import javax.persistence.*
import javax.validation.constraints.Email

@Entity
data class Person(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long,
    val name:String,
    val surName: String,
    val job:String,
    @Email
    val email: String,
    val age:Int,
    @Lob
    val avatar: Byte,
    @OneToMany(mappedBy = "person", fetch = FetchType.LAZY, orphanRemoval = true)
    val pets: List<Pet>
)
