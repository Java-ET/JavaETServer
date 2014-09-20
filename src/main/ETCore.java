package main;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import player.Player;
import items.weapons.Weapon;
import utils.Config;
import utilities.Jython;

public class ETCore {
	private static int port;
	private static String serverName;
	private static byte maxPlayers;
	private Vector<Player> playerList;
	
	public static void main(String[] args) throws IOException {
		Config server = new Config("server.cfg");
		Map<String, Long> serverPk3hashes = new HashMap<String, Long>();
		serverName = server.getString("serverName");
		port = server.getInt("port");
		maxPlayers = server.getByte("maxPlayers");
		
		Weapon weap = new Weapon();
		Jython.callScript("scripts/weapons/guns/", "mp40", "setup", weap);
		
		ETConsole serverConsole = new ETConsole();
		serverConsole.println("Launched gameserver: " + serverName + " with port " + port + " and a max of " + maxPlayers + " players.");
		
	}

}
