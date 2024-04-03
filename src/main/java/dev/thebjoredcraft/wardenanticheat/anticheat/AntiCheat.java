package dev.thebjoredcraft.wardenanticheat.anticheat;

import dev.thebjoredcraft.wardenanticheat.anticheat.flag.Flag;
import dev.thebjoredcraft.wardenanticheat.anticheat.flag.FlagType;
import dev.thebjoredcraft.wardenanticheat.anticheat.player.AntiCheatPlayer;

import java.util.Date;

public class AntiCheat {
    public static double maxReach = 3.42;
    public static double maxFlySpeed = 10;
    public static void flag(AntiCheatPlayer player, FlagType type){
        player.getData().addFlag(new Flag(type, new Date()));
    }
}
