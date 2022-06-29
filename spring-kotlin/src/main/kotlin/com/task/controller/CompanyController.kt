package com.task.controller

import com.task.model.Company
import com.task.repository.CompanyRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class CompanyController {

    @Autowired
    lateinit var companyRepository: CompanyRepository

    @PostMapping("/save")
    fun save(@RequestBody company: Company): String {
        companyRepository.save(company)
        return "Company Details Saved!"
    }

    @GetMapping("/getCompany")
    fun getAllCompany(): List<Company> {
        return companyRepository.findAll()
    }

    @GetMapping("/getCompanyByName/{name}")
    fun getCompanyByName(@PathVariable name: String): Company {
        return companyRepository.findByName(name)
    }

    @DeleteMapping("/deleteCompany/{id}")
    fun deleteCompany(@PathVariable id: Int): String {
        companyRepository.deleteById(id)
        return "Company Deleted!"
    }
}