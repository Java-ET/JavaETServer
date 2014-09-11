package main;

import utilities.Config;

public class ETCore {
	private static int port;
	private static String serverName;
	private static byte maxPlayers;
	
	public static void main(String[] args) {
		Config server = new Config("server.cfg");
		
		serverName = server.getString("serverName");
		port = server.getInt("port");
		maxPlayers = server.getByte("maxPlayers");
		
		System.out.println("Launched gameserver: " + serverName + " with port " + port + " and a max of " + maxPlayers + " playes.");
	}

}
