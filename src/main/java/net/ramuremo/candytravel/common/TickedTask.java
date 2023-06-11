package net.ramuremo.candytravel.common;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class TickedTask<V> {

    private final List<Map.Entry<Long, V>> entries;
    private Consumer<Map.Entry<Long, V>> whenTickedConsumer = object -> {
    };

    public TickedTask() {
        this.entries = new ArrayList<>();
    }

    @SafeVarargs
    public TickedTask(Map.Entry<Long, V>... entries) {
        this.entries = new ArrayList<>(List.of(entries));
    }

    public TickedTask(Collection<Map.Entry<Long, V>> entries) {
        this.entries = new ArrayList<>(entries);
    }

    public void setWhenTickedConsumer(Consumer<Map.Entry<Long, V>> consumer) {
        this.whenTickedConsumer = consumer;
    }

    public CompletableFuture<Void> run(@NotNull Plugin plugin) {

        CompletableFuture<Void> future = new CompletableFuture<>();

        List<Map.Entry<Long, V>> remainingEntries = List.copyOf(entries);

        Bukkit.getAsyncScheduler().runNow(plugin, task -> {

            consumeTickedTasks(future, remainingEntries);

            future.complete(null);

        });

        return future;
    }

    private void consumeTickedTasks(CompletableFuture<Void> future, List<Map.Entry<Long, V>> tasks) {

        for (Map.Entry<Long, V> entry : tasks) {

            sleep(entry.getKey());

            if (future.isCancelled()) break;

            whenTickedConsumer.accept(entry);
        }

    }

    private void sleep(long tick) {

        if (tick <= 0) return;

        try {
            Thread.sleep(50 * tick);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}