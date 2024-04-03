package dev.thebjoredcraft.wardenanticheat.checks.reach;

import dev.thebjoredcraft.wardenanticheat.anticheat.AntiCheat;
import dev.thebjoredcraft.wardenanticheat.anticheat.flag.FlagType;
import dev.thebjoredcraft.wardenanticheat.anticheat.player.AntiCheatPlayer;
import org.bukkit.Location;
import org.bukkit.event.player.PlayerInteractEvent;

public class ReachInteractChecker {
    public ReachInteractChecker(PlayerInteractEvent event) {
        Location playerLocation = new Location(event.getPlayer().getWorld(), event.getPlayer().getX(), event.getPlayer().getY() + 1, event.getPlayer().getZ());
        Location targetLocation = new Location(event.getInteractionPoint().getWorld(), event.getInteractionPoint().getX(), event.getInteractionPoint().getY() + 1, event.getInteractionPoint().getZ());
        if(event.getInteractionPoint() != null) {
            double distance = playerLocation.distance(event.getInteractionPoint());

            if (distance > AntiCheat.maxReach) {
                AntiCheat.flag(AntiCheatPlayer.getAntiCheatPlayer(event.getPlayer()), FlagType.REACH);
                event.setCancelled(true);
            }
        }
    }
}
