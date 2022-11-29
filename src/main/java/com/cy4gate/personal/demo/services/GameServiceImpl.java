package com.cy4gate.personal.demo.services;

import com.cy4gate.personal.demo.DTO.GameDTO;
import com.cy4gate.personal.demo.entities.GameEntity;
import com.cy4gate.personal.demo.exceptions.GameNotFoundException;
import com.cy4gate.personal.demo.repositories.GameRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameServiceImpl implements GameService{

    private GameRepository gameRepo;

    public GameServiceImpl(GameRepository gameRepo) {
        this.gameRepo = gameRepo;
    }

    @Override
    public GameDTO getGameById(Long id) {
        Optional<GameEntity> o = gameRepo.findById(id);
        if (o.isEmpty()) throw new GameNotFoundException(id);
        return GameDTO.fromEntity(o.get());
    }

    @Override
    public List<GameDTO> getGames() {
        return gameRepo.findAll().stream().map(GameDTO::fromEntity).toList();
    }

    @Override
    public List<GameDTO> getGamesByGenere(String genere) {
        Optional<GameEntity> o = gameRepo.findByGenere(genere);
        if (o.isEmpty()) return null;
        return gameRepo.findAll().stream().map(GameDTO::fromEntity).toList();
    }
}
