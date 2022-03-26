package com.app.service;

import com.app.entity.PlayerEntity;
import org.springframework.stereotype.Service;
import com.app.repository.PlayerRepository;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository){
        this.playerRepository = playerRepository;
    }

    public PlayerEntity getPlayerByID(long id){
        return playerRepository.findById(id).orElse(null);
    }

    public PlayerEntity addPlayer(PlayerEntity player){
        return playerRepository.save(player);
    }
}
