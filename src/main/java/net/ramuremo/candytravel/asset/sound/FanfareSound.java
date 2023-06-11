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
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING         ).pitch(Tone.C_1.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE).pitch(Tone.C_1.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_COW_BELL      ).pitch(Tone.C_1.getPitch()).build()),

                Map.entry(4L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING         ).pitch(Tone.E_1.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE).pitch(Tone.E_1.getPitch()).build()),
                
                Map.entry(2L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING         ).pitch(Tone.G_1.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE).pitch(Tone.G_1.getPitch()).build()),

                Map.entry(4L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING         ).pitch(Tone.B_0.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE).pitch(Tone.B_0.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_COW_BELL      ).pitch(Tone.B_0.getPitch()).build()),

                Map.entry(6L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING         ).pitch(Tone.D_1.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE).pitch(Tone.D_1.getPitch()).build()),

                Map.entry(2L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING         ).pitch(Tone.G_1.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE).pitch(Tone.G_1.getPitch()).build()),

                Map.entry(4L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING         ).pitch(Tone.B_1.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE).pitch(Tone.B_1.getPitch()).build()),

                Map.entry(2L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING         ).pitch(Tone.C_2.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE).pitch(Tone.C_2.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_FLUTE         ).pitch(Tone.C_2.getPitch()).build()),

                Map.entry(6L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING         ).pitch(Tone.B_1.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE).pitch(Tone.B_1.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_FLUTE         ).pitch(Tone.B_1.getPitch()).build()),


                Map.entry(6L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING         ).pitch(Tone.C_2.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE).pitch(Tone.C_2.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_FLUTE         ).pitch(Tone.C_2.getPitch()).build()),

                Map.entry(6L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING         ).pitch(Tone.C_1.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE).pitch(Tone.C_1.getPitch()).build()),
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_FLUTE         ).pitch(Tone.C_1.getPitch()).build())


                );
    }

}
