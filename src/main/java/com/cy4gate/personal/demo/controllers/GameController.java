package com.cy4gate.personal.demo.controllers;

import com.cy4gate.personal.demo.DTO.GameDTO;
import com.cy4gate.personal.demo.services.GameService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GameController {

    private GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/api/game/{id}")
    @Operation(summary = "Retrive specific game")
    public GameDTO getGame(@PathVariable("id") Long id){
        return gameService.getGameById(id);
    }

    @GetMapping("/api/game")
    @Operation(summary = "Retrive all game")
    public List<GameDTO> getGameGames(){
        return gameService.getGames();
    }

    @GetMapping("/api/game/{genere}")
    @Operation(summary = "Retrive some games by genere")
    public List<GameDTO> getGamesByGenere(@PathVariable("genere") String genere){
        return gameService.getGamesByGenere(genere);
    }
}
