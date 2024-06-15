package com.in30mins.springboot_age.repository;

import com.in30mins.springboot_age.entity.AgeCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgeCustomRepo extends JpaRepository<AgeCustom,Integer> {
}
