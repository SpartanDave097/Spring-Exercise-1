package com.cy4gate.personal.demo.DTO;

import com.cy4gate.personal.demo.entities.GameEntity;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data @AllArgsConstructor
public class GameDTO {

    private Long id;

    private String nome;
    private String genere;
    private int rating;

    public static GameDTO fromEntity(GameEntity game){
        return new GameDTO(game.getId(),game.getNome(),game.getGenere(),game.getRating());
    }

}
