package me.potentia.client.command;

import java.util.LinkedHashMap;

public class Commands {
	private static LinkedHashMap<String, Command> registered = new LinkedHashMap<>();
	private static String prefix = "*";
	
	public static void init() {
		register("help", new CommandHelp());
		register("crash", new CommandCrash());
	}
	
	public static void register(String id, Command command) {
		registered.put(id, command);
	}
	
	public static LinkedHashMap<String, Command> getRegistered() {
		return registered;
	}

	public static String getPrefix() {
		return prefix;
	}

	public static void setPrefix(String prefix) {
		Commands.prefix = prefix;
	}
	
}
