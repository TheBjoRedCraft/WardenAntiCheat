package dev.thebjoredcraft.wardenanticheat.manager;

import com.github.retrooper.packetevents.event.PacketReceiveEvent;
import dev.thebjoredcraft.wardenanticheat.anticheat.player.AntiCheatPlayer;
import dev.thebjoredcraft.wardenanticheat.anticheat.player.AntiCheatPlayerData;
import dev.thebjoredcraft.wardenanticheat.checks.FlightChecker;
import dev.thebjoredcraft.wardenanticheat.checks.reach.ReachPvPChecker;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.ArrayList;

public class EventManager implements Listener {
    @EventHandler
    public void onMove(PlayerMoveEvent event) {

    }

    @EventHandler
    public void onHit(EntityDamageByEntityEvent event) {
        new ReachPvPChecker(event);
    }
    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        AntiCheatPlayer.add(new AntiCheatPlayerData(event.getPlayer(), new ArrayList<>()));
    }
    @EventHandler
    public void onQuit(PlayerQuitEvent event){
        AntiCheatPlayer.remove(new AntiCheatPlayerData(event.getPlayer(), new ArrayList<>()));
    }
    public void onPacketReceive(PacketReceiveEvent event){
        new FlightChecker(event);
    }
}
