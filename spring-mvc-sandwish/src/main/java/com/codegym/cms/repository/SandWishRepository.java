package com.codegym.cms.repository;

import com.codegym.cms.dto.Sandwich;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SandWishRepository extends JpaRepository<Sandwich,String> {
}
