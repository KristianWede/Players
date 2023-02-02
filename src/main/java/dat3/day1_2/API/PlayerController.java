package dat3.day1_2.API;

import dat3.day1_2.Entity.Player;
import dat3.day1_2.Repositories.PlayerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/players")
public class PlayerController {


    PlayerRepository playerRepository;


    public PlayerController(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }


    @GetMapping
    Iterable<Player> getPlayers() {
        var players =  playerRepository.findAll();
        return players;
    }
}

