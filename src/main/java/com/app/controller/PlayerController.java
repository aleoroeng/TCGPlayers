package com.app.controller;

import com.app.service.PlayerService;
import com.app.entity.PlayerEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@CrossOrigin("*")
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService){
        this.playerService = playerService;
    }

    @GetMapping("/player")
    public String getPlayerByID(Model model, @RequestParam(name = "id") long id){
       PlayerEntity player = playerService.getPlayerByID(id);
        Map<String, Object> playerList = new LinkedHashMap<>();
        playerList.put("player", player);
        model.addAllAttributes(playerList);
        return "page";
    }
    @PostMapping("/players")
    public PlayerEntity addPlayer(@RequestBody PlayerEntity player){
        return playerService.addPlayer(player);
    }
}
