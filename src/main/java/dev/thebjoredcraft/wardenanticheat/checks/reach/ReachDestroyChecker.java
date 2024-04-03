package dev.thebjoredcraft.wardenanticheat.checks.reach;

import dev.thebjoredcraft.wardenanticheat.anticheat.AntiCheat;
import dev.thebjoredcraft.wardenanticheat.anticheat.flag.FlagType;
import dev.thebjoredcraft.wardenanticheat.anticheat.player.AntiCheatPlayer;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class ReachDestroyChecker {
    public ReachDestroyChecker(BlockBreakEvent event) {
        Player player = event.getPlayer();
        Location playerLocation = new Location(player.getWorld(), player.getX(), player.getY() + 1, player.getZ());
        Location targetLocation = new Location(event.getBlock().getWorld(), event.getBlock().getX(), event.getBlock().getY() + 1, event.getBlock().getZ());
        double distance = playerLocation.distance(targetLocation);

        if (distance > AntiCheat.maxReach) {
            AntiCheat.flag(AntiCheatPlayer.getAntiCheatPlayer(player), FlagType.REACH);
            event.setCancelled(true);
        }
    }
}
