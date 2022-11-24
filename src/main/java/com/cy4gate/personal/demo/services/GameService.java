package com.cy4gate.personal.demo.services;

import com.cy4gate.personal.demo.DTO.GameDTO;

import java.util.List;

public interface GameService {

     GameDTO getGameById();

     List<GameDTO> getGames();

    List<GameDTO> getGamesByGenre();
}
