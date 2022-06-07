package com.curso.crud.kotlin.Entity

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

@Entity
data class Pet (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,
    var name: String?,
    var age: Int?,
    var type: String?,
    @Lob
    var photo: Byte?,
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_person")
    var person: Person
)