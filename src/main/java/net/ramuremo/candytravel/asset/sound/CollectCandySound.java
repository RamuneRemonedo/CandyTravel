package net.ramuremo.candytravel.asset.sound;

import net.kyori.adventure.sound.Sound;
import net.ramuremo.candytravel.asset.SoundAsset;
import net.ramuremo.candytravel.asset.Tone;
import net.ramuremo.candytravel.common.TickedTask;

import java.util.ArrayList;
import java.util.Map;

public class CollectCandySound implements SoundAsset {

    @Override
    public TickedTask<Sound> getSounds() {

        ArrayList<Character> strings = new ArrayList<>();

        strings.add('a');
        strings.add('日');

        strings.forEach(System.out::println);

        return new TickedTask<>(
                Map.entry(0L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.B_1.getPitch()).build()),
                Map.entry(2L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.C_2.getPitch()).build()),
                Map.entry(2L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.B_1.getPitch()).build()),
                Map.entry(2L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.C_2.getPitch()).build()),
                Map.entry(2L, Sound.sound().type(org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING).pitch(Tone.D_2.getPitch()).build())
        );
    }

}
