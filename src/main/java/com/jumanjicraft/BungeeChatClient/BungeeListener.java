package com.jumanjicraft.BungeeChatClient;

import com.dthielke.herochat.ChannelChatEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

public class BungeeListener implements Listener {

    private final BungeeChatClient plugin;

    public BungeeListener(BungeeChatClient plugin) {
        this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onChannelChatEvent(ChannelChatEvent event) {
        plugin.getBungeeChatListener().TransmitChatMessage(
                event.getMessage(),
                event.getChannel().getName(),
                event.getSender().getName(),
                event.getChannel().getColor().toString(),
                event.getChannel().getNick());
    }
}
