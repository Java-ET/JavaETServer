package main;

import utilities.Config;

public class ETCore {
	private static int port;
	private static String serverName;
	private static byte maxPlayers;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Config server = new Config("server.cfg");
		
		serverName = server.getString("serverName");
		port = server.getInt("port");
		
		
	}
	
	public void sendHeartbeat() {	// Probably doesn't have to be in a method of its own IF it's never called more than once.
		
	}

}
