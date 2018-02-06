package org.kurosawa;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	@Override
	public void onEnable() {
		getLogger().info("プラグインが有効になりました");
	}
	
	@Override
	public void onDisable() {
		getLogger().info("プラグインが無効になりました");
	}
}
