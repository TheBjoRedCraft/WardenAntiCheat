package dev.thebjoredcraft.wardenanticheat.manager;

import dev.thebjoredcraft.wardenanticheat.checks.ReachChecker;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class EventManager implements Listener {
    @EventHandler
    public void onMove(PlayerMoveEvent event) {

    }

    @EventHandler
    public void onHit(EntityDamageByEntityEvent event) {
        new ReachChecker(event);
    }
    @EventHandler
    public void onJoin(PlayerJoinEvent event){

    }
    @EventHandler
    public void onQuit(PlayerQuitEvent event){

    }
}
