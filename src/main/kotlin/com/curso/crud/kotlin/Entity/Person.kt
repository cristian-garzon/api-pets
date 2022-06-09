package com.curso.crud.kotlin.Entity

import javax.persistence.*
import javax.validation.constraints.Email

@Entity
data class Person(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long?,
    var name:String?,
    var surName: String?,
    var job:String,
    @Email
    var email: String,
    var age:Int,
    @Lob
    var avatar: Byte?,
    @OneToMany(mappedBy = "person", fetch = FetchType.LAZY, orphanRemoval = true)
    var pets: List<Pet>
)