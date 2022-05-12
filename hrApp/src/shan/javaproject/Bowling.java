package shan.javaproject;

import java.util.*;
import java.util.Collections;
import java.util.Map.Entry;

public class Bowling {
	HashMap<String, Integer> players;

	Bowling() {
		players = new HashMap<String, Integer>();
	}

	public void addPlayer(String name, int p) {
		players.put(name, p);
	}

	public void getWinner() {
		int maxValueInMap=(Collections.max(players.values()));  // This will return max value in the HashMap
        for (Entry<String, Integer> entry : players.entrySet()) {  // Iterate through HashMap
            if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey());     // Print the key with max value
            }
        }
    	 
	
	}

}
