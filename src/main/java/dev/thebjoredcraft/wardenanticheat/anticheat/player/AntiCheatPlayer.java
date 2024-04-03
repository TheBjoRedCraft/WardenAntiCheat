package dev.thebjoredcraft.wardenanticheat.anticheat.player;

import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class AntiCheatPlayer {
    public static List<AntiCheatPlayerData> antiCheatPlayers = new ArrayList<>();
    public AntiCheatPlayerData data;
    public AntiCheatPlayer(AntiCheatPlayerData data){
        this.data = data;
    }

    public AntiCheatPlayerData getData() {
        return data;
    }
    public static void remove(AntiCheatPlayerData data){
        antiCheatPlayers.remove(data);
    }
    public static void add(AntiCheatPlayerData data){
        antiCheatPlayers.add(data);
    }
    public Player getBukkitPlayer(){
        return data.getPlayer();
    }
    public static AntiCheatPlayer getAntiCheatPlayer(Player player){
        AntiCheatPlayer antiCheatPlayer = null;
        for(AntiCheatPlayerData acData : antiCheatPlayers){
            if(acData.getPlayer().equals(player)){
                antiCheatPlayer = new AntiCheatPlayer(acData);
            }
        }
        return antiCheatPlayer;
    }
    public static AntiCheatPlayer getAntiCheatPlayer(Object player){
        AntiCheatPlayer antiCheatPlayer = null;
        for(AntiCheatPlayerData acData : antiCheatPlayers){
            if(acData.getPlayer().equals(player)){
                antiCheatPlayer = new AntiCheatPlayer(acData);
            }
        }
        return antiCheatPlayer;
    }
}
