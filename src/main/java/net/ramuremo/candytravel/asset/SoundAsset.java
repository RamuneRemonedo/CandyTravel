package net.ramuremo.candytravel.asset;

import net.kyori.adventure.sound.Sound;
import net.ramuremo.candytravel.CandyTravel;
import net.ramuremo.candytravel.common.TickedTask;
import org.bukkit.entity.Player;

import java.util.concurrent.CompletableFuture;

public interface SoundAsset {

    TickedTask<Sound> getSounds();

    default CompletableFuture<Void> play(Player player) {

        TickedTask<Sound> sounds = getSounds();

        sounds.setWhenTickedConsumer(entry -> player.playSound(entry.getValue(), Sound.Emitter.self()));
        return sounds.run(CandyTravel.getPlugin(CandyTravel.class));

    }

}
