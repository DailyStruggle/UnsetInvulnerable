package io.github.dailystruggle.unsetinvulnerable;

import net.flawe.offlinemanager.OfflineManager;
import net.flawe.offlinemanager.api.OfflineManagerAPI;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.plugin.java.JavaPlugin;

public final class UnsetInvulnerable extends JavaPlugin{

    @Override
    public void onEnable() {
        OfflineManagerAPI offlineManagerAPI = OfflineManager.getApi();

        for(OfflinePlayer offlinePlayer : Bukkit.getOfflinePlayers()) {
            offlineManagerAPI.getPlayerData(offlinePlayer.getUniqueId()).setInvulnerable(false);
        }
    }
}
