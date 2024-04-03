package dev.thebjoredcraft.wardenanticheat.checks.reach;

import dev.thebjoredcraft.wardenanticheat.anticheat.AntiCheat;
import dev.thebjoredcraft.wardenanticheat.anticheat.flag.FlagType;
import dev.thebjoredcraft.wardenanticheat.anticheat.player.AntiCheatPlayer;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class ReachDestroyChecker {
    public ReachDestroyChecker(EntityDamageByEntityEvent event) {
        if (event.getDamager() instanceof Player player && event.getEntity() instanceof Player target) {
            Location playerLocation = new Location(player.getWorld(), player.getX(), player.getY() + 1, player.getZ());
            Location targetLocation = new Location(target.getWorld(), target.getX(), target.getY() + 1, target.getZ());
            double distance = playerLocation.distance(targetLocation);

            if (distance > 3.42) {
                AntiCheat.flag(AntiCheatPlayer.getAntiCheatPlayer(player), FlagType.REACH);

                event.setCancelled(true);
            }
        }
    }
}
