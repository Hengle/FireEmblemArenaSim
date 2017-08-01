package com.ajplee.FEArenaSim.etl.heroes;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Assist {
	private String name;
	private String description;
	private String weapon_restrict;
	private Boolean char_unique;
	private Integer spec_cooldown_mod;
	private String weapon_unique;
	
	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append("// command skill data\n" + "var assistInfo =\n" +"{\n");
		string.append("    " + "\"" + name + "\" :  {");
		string.append("        " + "\"desciption\" : \"" + description + "\",");
		if(weapon_restrict != null) {
			string.append("        " + "\"weapon_restrict\" : \"" + weapon_restrict + "\",");
		}
		if(char_unique != null) {
			string.append("        " + "\"char_unique\" : " + char_unique.toString() + ",");
		}
		if(spec_cooldown_mod != null) {
			string.append("        " + "\"spec_cooldown_mod\" : \"" + spec_cooldown_mod.toString() + "\",");
		}
		if(weapon_unique != null) {
			string.append("        " + "\"weapon_unique\" : \"" + weapon_unique + "\",");
		}
		
		
		return string.toString();
	}
	public String getName() {
		return name;
	}
	public void setString(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getWeaponRestrict() {
		return weapon_restrict;
	}
	public void setWeaponRestrict(String weapon_restrict) {
		this.weapon_restrict = weapon_restrict;
	}
	public boolean getCharUnique() {
		return char_unique;
	}
	public void setCharUnique(boolean char_unique) {
		this.char_unique = char_unique;
	}
	public int getSpecCooldownMod() {
		return spec_cooldown_mod;
	}
	public void setSpecCooldownMod(int spec_cooldown_mod) {
		this.spec_cooldown_mod = spec_cooldown_mod;
	}
	public String getWeaponUnique() {
		return weapon_unique;
	}
	public void setWeaponUnique(String weapon_unique) {
		this.weapon_unique = weapon_unique;
	}
}
