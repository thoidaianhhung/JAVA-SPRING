package com.vti.Assignment1.repository;

import com.vti.Assignment1.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<Position, Integer> {
}
