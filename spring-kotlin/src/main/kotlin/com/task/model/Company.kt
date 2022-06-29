package com.task.model

import javax.persistence.*

@Entity
@Table(name = "company")
data class Company(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,
    val name: String = "",
    val address: String = ""
)
