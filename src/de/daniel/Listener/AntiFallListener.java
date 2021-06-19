package de.daniel.Listener;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.entity.EntityDamageEvent;

public class AntiFallListener implements Listener {

    @EventHandler
    public void onGettingFallDamage(EntityDamageEvent e) {
        if (!(e.getEntity() instanceof Player)) {
            return;
        }

        if (e.getCause() != EntityDamageEvent.DamageCause.FALL) {
            return;
        }

        e.setCancelled();
    }
}
