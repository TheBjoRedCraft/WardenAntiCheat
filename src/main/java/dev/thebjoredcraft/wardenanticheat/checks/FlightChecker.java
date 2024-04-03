package dev.thebjoredcraft.wardenanticheat.checks;

import com.github.retrooper.packetevents.event.PacketReceiveEvent;
import com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPlayerFlying;
import dev.thebjoredcraft.wardenanticheat.anticheat.AntiCheat;
import dev.thebjoredcraft.wardenanticheat.anticheat.flag.FlagType;
import dev.thebjoredcraft.wardenanticheat.anticheat.player.AntiCheatPlayer;
public class FlightChecker {
    public FlightChecker(PacketReceiveEvent event) {
        AntiCheatPlayer player = AntiCheatPlayer.getAntiCheatPlayer(event.getPlayer());

        if (WrapperPlayClientPlayerFlying.isFlying(event.getPacketType()) && !player.getBukkitPlayer().isFlying()) {
            AntiCheat.flag(player, FlagType.FLY);
            event.setCancelled(true);
        }
    }
}
