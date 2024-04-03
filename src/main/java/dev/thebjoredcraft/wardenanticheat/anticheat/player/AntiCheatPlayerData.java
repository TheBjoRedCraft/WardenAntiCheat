package dev.thebjoredcraft.wardenanticheat.anticheat.player;

import dev.thebjoredcraft.wardenanticheat.anticheat.flag.Flag;
import org.bukkit.entity.Player;

import java.util.List;

public class AntiCheatPlayerData {
    public List<Flag> flags;
    public Player player;
    public AntiCheatPlayerData(Player player, List<Flag> flags){
        this.player = player;
        this.flags = flags;
    }

    public Player getPlayer() {
        return player;
    }

    public List<Flag> getFlags() {
        return flags;
    }

    public void addFlag(Flag flag) {
        this.flags.add(flag);
    }
    public void clearFlags(){
        this.flags.clear();
    }
    public void removeFlag(Flag flag){
        this.flags.remove(flag);
    }
}
