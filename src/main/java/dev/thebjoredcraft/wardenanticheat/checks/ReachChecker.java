package dev.thebjoredcraft.wardenanticheat.checks;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageByEntityEvent;


public class ReachChecker {
    public ReachChecker(EntityDamageByEntityEvent event) {
        if (event.getDamager() instanceof Player player && event.getEntity() instanceof Player target) {
            Location playerLocation = new Location(player.getWorld(), player.getX(), player.getY() + 1, player.getZ());
            Location targetLocation = new Location(target.getWorld(), target.getX(), target.getY() + 1, target.getZ());
            double distance = playerLocation.distance(targetLocation);

            if (distance > 3.42) {

            }
        }
    }
}