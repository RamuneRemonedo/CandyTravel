package net.ramuremo.candytravel;

import net.ramuremo.candytravel.asset.sound.CollectCandySound;
import net.ramuremo.candytravel.asset.sound.FanfareSound;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.concurrent.CompletableFuture;

public final class CandyTravel extends JavaPlugin implements Listener {

    private CompletableFuture<Void> soundTask = null;

    @EventHandler
    public void onShift(PlayerToggleSneakEvent event) {
        if (event.isSneaking()) {
            System.out.println("再生");
            soundTask = new CollectCandySound().play(Bukkit.getPlayer("ramuremo_chan"));
            soundTask.whenComplete((unused, throwable) -> System.out.println("終了"));
        } else {
            soundTask.cancel(true);
        }
    }

    @Override
    public void onEnable() {

        Bukkit.getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("The plugin has been enabled.");

    }

    @Override
    public void onDisable() {

        getLogger().info("The plugin has been disabled.");

    }
}
