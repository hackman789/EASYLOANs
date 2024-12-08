package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.model.Contact;


public interface ContactRepository extends JpaRepository<Contact, String> {

}
