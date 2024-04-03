package dev.thebjoredcraft.wardenanticheat.anticheat.player;

import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AntiCheatPlayer {
    public List<AntiCheatPlayer> antiCheatPlayers = new ArrayList<>();
    public AntiCheatPlayerData data;
    public AntiCheatPlayer(AntiCheatPlayerData data){
        this.data = data;
    }

    public AntiCheatPlayerData getData() {
        return data;
    }
}
