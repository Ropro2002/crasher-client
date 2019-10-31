package me.potentia.client;

import me.potentia.client.module.Modules;
import me.potentia.client.command.Commands;
import me.potentia.client.listener.ClientChatListener;
import me.potentia.client.listener.ClientTickListener;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION)
@SideOnly(Side.CLIENT)
public class Main {
	public static final String MODID = "crashclient";
	public static final String NAME = "Crash Client";
	public static final String VERSION = "1.0";
    
	@EventHandler
	public void init(FMLInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(ClientTickListener.class);
		MinecraftForge.EVENT_BUS.register(ClientChatListener.class);
		Commands.init();
		Modules.init();
	}
}
