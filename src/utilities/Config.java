package utilities;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Config {
	private Map<String, Object> entries;
	
	public Config(String configPath) {
		File file = new File(configPath);
		if (!file.exists()) // We shouldn't continue loading if the .cfg for the server's missing.
			return;
		
		entries = new HashMap<String, Object>();
		Scanner fileReader = new Scanner(file.getPath());	// Will getPath() return the correct path?
		
		while(fileReader.hasNextLine()) {
			String entry  = fileReader.nextLine();
			
			entries.put(entry.split("=")[0], entry.split("=")[1]);	// Cache the config. More efficient than reading it over and over.
		}
		
	}
	
	public int getInt(String key) {
		return (int) entries.get(key);
	}
	
	public boolean getBoolean(String key) {
		return Boolean.getBoolean((String) entries.get(key));
	}
	
	public String getString(String key) {
		return (String) entries.get(key);
	}
}
