package net.ramuremo.candytravel.asset.sound;

import net.kyori.adventure.sound.Sound;
import net.ramuremo.candytravel.asset.SoundAsset;
import net.ramuremo.candytravel.asset.Tone;
import net.ramuremo.candytravel.common.TickedTask;

import java.util.List;
import java.util.Map;

public class FanfareSound implements SoundAsset {

    @Override
    public TickedTask<Sound> getSounds() {
        return new TickedTask<>(
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.D_1.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.F_1.getPitch()).build()),

                Map.entry(3L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.E_1.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.G_1.getPitch()).build()),

                Map.entry(3L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.F_1.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.A_1.getPitch()).build()),

                Map.entry(3L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.G_1.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.B_1.getPitch()).build()),

                Map.entry(3L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.F_1.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.A_1.getPitch()).build()),

                Map.entry(3L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.G_1.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.B_1.getPitch()).build()),

                Map.entry(3L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.A_1.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.C_2.getPitch()).build()),


                Map.entry(6L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.E_1.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.G_1.getPitch()).build()),

                Map.entry(3L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.C_1.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.E_1.getPitch()).build()),


                Map.entry(8L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.D_1.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.F_1.getPitch()).build()),

                Map.entry(3L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.E_1.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.G_1.getPitch()).build()),

                Map.entry(3L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.F_1.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.A_1.getPitch()).build()),

                Map.entry(3L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.G_1.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.B_1.getPitch()).build()),

                Map.entry(3L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.F_1.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.A_1.getPitch()).build()),

                Map.entry(3L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.G_1.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.B_1.getPitch()).build()),

                Map.entry(3L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.A_1.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.C_2.getPitch()).build()),


                Map.entry(6L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.D_1.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.B_0.getPitch()).build()),

                Map.entry(3L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.C_1.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.A_0.getPitch()).build()),


                Map.entry(8L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.D_1.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.F_1.getPitch()).build()),

                Map.entry(3L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.E_1.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.G_1.getPitch()).build()),

                Map.entry(3L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.F_1.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.A_1.getPitch()).build()),

                Map.entry(3L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.G_1.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.B_1.getPitch()).build()),

                Map.entry(3L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.F_1.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.A_1.getPitch()).build()),

                Map.entry(3L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.G_1.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.B_1.getPitch()).build()),

                Map.entry(3L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.A_1.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.C_2.getPitch()).build()),


                Map.entry(6L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.E_1.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.G_1.getPitch()).build()),

                Map.entry(3L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.C_1.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.E_1.getPitch()).build())
        );
    }

}
