package com.projetos01.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projetos01.dsvendas.dto.SaleSucessDTO;
import com.projetos01.dsvendas.dto.SaleSumDTO;
import com.projetos01.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
@Query("SELECT new com.projetos01.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();

@Query("SELECT new com.projetos01.dsvendas.dto.SaleSucessDTO(obj.seller, SUM(obj.visited),SUM(obj.deals)) "
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSucessDTO> sucessGroupedBySeller();
}
