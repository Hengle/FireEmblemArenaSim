package com.ajplee.FEArenaSim.etl.heroes;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
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
	private List<String> assist;
	private List<Map<String, Integer>> base_stat;
	private List<Map<String, Integer>> rarity_restrict;
	
	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append("{ \n");
		string.append(name + ":{\n");
		string.append(" color:" + "\"" + color + "\"\n");
		string.append(" weapon_type:" + "\"" + weapon_type + "\"\n");
		string.append(" move_type:" + "\"" + move_type + "\"\n");
		
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
		
		if(passive_a != null) {
			string.append(" passive_a:["); 
			for(String a : passive_a) {
				string.append("\"" + a + "\"");
			}
		}
		string.append("] \n");
		
		if(passive_b != null) {
			string.append(" passive_b:["); 
			for(String b : passive_b) {
				string.append("\"" + b + "\"");
			}
		}
		string.append("] \n");
		
		if(passive_c != null) {
			string.append(" passive_c:["); 
			for(String c : passive_c) {
				string.append("\"" + c + "\"");
			}
		}
		string.append("] \n");
		
		if(assist!= null) {
			string.append(" assist:[");
			for(String a : assist) {
				string.append("\"" + a + "\"");
			}
		}
		string.append("] \n");
		
		string.append(" base_stat:{");
		if(base_stat != null) {
			for(Map<String, Integer> stat : base_stat) {
				string.append(stat + ":{");
				for(Map.Entry<String, Integer> entry : stat.entrySet()) {
					string.append(entry.getKey() + ":" + entry.getValue());
				}
				string.append("} \n");
			}
			string.append("} \n");
		}
		string.append(" rarity_restrict:{");
		if(rarity_restrict != null) {
			for(Map<String, Integer> rarity : rarity_restrict) {
				string.append(rarity + ":{");
				for(Map.Entry<String, Integer> entry : rarity.entrySet()) {
					string.append(entry.getKey() + ":" + entry.getValue());
				}
				string.append("} \n");
			}
			string.append("} \n");
		}
		
		return string.toString();
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getWeaponType() {
		return weapon_type;
	}
	public void setWeaponType(String weapon_type) {
		this.weapon_type = weapon_type;
	}
	public String getMoveType() {
		return move_type;
	}
	public void setMoveType(String move_type) {
		this.move_type = move_type;
	}
	public List<String> getWeapon() {
		return weapon;
	}
	public void setWeapon(List<String> weapon) {
		this.weapon = weapon;
	}
	public List<String> getSpecial() {
		return special;
	}
	public void setSpecial(List<String> special) {
		this.special = special;
	}
	public List<String> getPassive_a() {
		return passive_a;
	}
	public void setPassive_a(List<String> passive_a) {
		this.passive_a = passive_a;
	}
	public List<String> getPassive_b() {
		return passive_b;
	}
	public void setPassive_b(List<String> passive_b) {
		this.passive_b = passive_b;
	}
	public List<String> getPassive_c() {
		return passive_c;
	}
	public void setPassive_c(List<String> passive_c) {
		this.passive_c = passive_c;
	}
	public List<Map<String, Integer>> getBase_stat() {
		return base_stat;
	}
	public void setBase_stat(List<Map<String, Integer>> base_stat) {
		this.base_stat = base_stat;
	}
	public List<Map<String, Integer>> getRarityRestrict() {
		return rarity_restrict;
	}
	public void setRarityRestrict(List<Map<String, Integer>> rarity_restrict) {
		this.rarity_restrict = rarity_restrict;
	}
	
} 
