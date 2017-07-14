package com.ajplee.FEArenaSim.etl.heroes;

import java.util.List;

public class Heroes {
	private String name;
	private String color;
	private String weapon_type;
	private String move_type;
	private List<String> weapon;
	private List<String> special;
	private List<String> passive_a;
	private List<String> passive_b;
	private List<String> passive_c;
	private List<List<String>> base_stat;
	private List<List<String>> rarity_restrict;
	
	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append("{ \n");
		string.append(name);
		string.append(" color:" + "\"" + color + "\n");
		string.append(" weapon_type:" + "\"" + weapon_type + "\n");
		string.append(" move_type:" + "\"" + move_type + "\n");
		
		string.append(" weapon:["); 
		if(weapon != null) {
			for(String w : weapon) {
				string.append("\"" + w + "\"");
			}
		}
		string.append("] \n");
		
		string.append(" special:["); 
		if(special != null) {
			for(String s : special) {
				string.append("\"" + s + "\"");
			}
		}
		string.append("] \n");
		
		string.append(" passive_a:["); 
		if(passive_a != null) {
			for(String a : passive_a) {
				string.append("\"" + a + "\"");
			}
		}
		string.append("] \n");
		
		string.append(" passive_b:["); 
		if(passive_b != null) {
			for(String b : passive_b) {
				string.append("\"" + b + "\"");
			}
		}
		string.append("] \n");
		
		string.append(" passive_c:["); 
		if(passive_c != null) {
			for(String c : passive_c) {
				string.append("\"" + c + "\"");
			}
		}
		string.append("] \n");
		
		
		
		return string.toString();
		
	}
}
