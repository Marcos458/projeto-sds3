package com.projetos01.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetos01.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
