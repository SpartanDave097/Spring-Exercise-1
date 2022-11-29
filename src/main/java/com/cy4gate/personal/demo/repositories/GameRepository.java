package com.cy4gate.personal.demo.repositories;

import com.cy4gate.personal.demo.entities.GameEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GameRepository extends JpaRepository<GameEntity,Long> {
    Optional<GameEntity> findByGenere(String genere);
}
