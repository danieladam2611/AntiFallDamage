package de.daniel;

import cn.nukkit.plugin.PluginBase;
import de.daniel.Listener.AntiFallListener;

public class AntiFallDamageMain extends PluginBase {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new AntiFallListener(), this);
        getLogger().info("§b" + getName() + " §fwas successfully §aEnabled");
    }

    @Override
    public void onDisable() {
        getLogger().info("§b" + getName() + " §fwas successfully §cDisabled");
    }
}
