package com.task.repository

import com.task.model.Company
import org.springframework.data.jpa.repository.JpaRepository

interface CompanyRepository : JpaRepository<Company, Int> {

    fun findByName(name: String): Company
}