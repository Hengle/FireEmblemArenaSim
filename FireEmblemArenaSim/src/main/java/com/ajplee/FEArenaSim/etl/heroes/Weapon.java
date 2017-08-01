package com.ajplee.FEArenaSim.etl.heroes;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weapon {
	private String name;
	private String color;
	private String type;
	private String might;
	private String range;
	private boolean magical;
	private int heal_dmg;
	private String description;
	private Map<String, Integer> riposte;
	private int threshold;
	private boolean char_unique;
	private String move_effective;
	private Map<String, String> breaker;
	private String weapon_type;
	private Map<String, Integer> defend_mod;
	private int def;
	private int res;
	private int spec_cooldown_mod;
	private boolean add_bonus;
	private boolean adjacent_ally_bonus;
	private String color_effective;
	private int initiate_heal;
	private boolean brave;
	private Map<String, Integer> stat_mod;
	private int spd;
	private boolean cancel_counter;
	private int spec_damage_bonus;
	private Map<String, Integer> seal;
	private int atk;
	private int initiate_position;
	private Map<String, Integer> full_hp_mod;
	private int full_hp_atk_recoil_dmg;
	private Map<String, Integer> initiate_mod;
	private Map<String, Integer> threaten;
	private boolean tri_advantage;
	private boolean dragon_effective;
	private boolean prevent_counter;
	private Map<String, Integer> defiant;
	private boolean convert_penalties;
	private boolean counter;
	private int poison;
	private Map<String, String> target_seal; //hold String and int... for now just parse string to int
	private String target;
	private Map<String, Integer> after_mod;
	private Map<String, Double> desperation;
	private Map<String, String> below_threshold_mod; //needs to hold String and Map types
	private Map<String, Double> vantage;
	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		//add string
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMight() {
		return might;
	}
	public void setMight(String might) {
		this.might = might;
	}
	public String getRange() {
		return range;
	}
	public void setRange(String range) {
		this.range = range;
	}
	public boolean getMagical() {
		return magical;
	}
	public void setMagical(boolean magical) {
		this.magical = magical;
	}
	public int getHeal_dmg() {
		return heal_dmg;
	}
	public void setHeal_dmg(int heal_dmg) {
		this.heal_dmg = heal_dmg;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Map<String, Integer> getRipsote() {
		return riposte;
	}
	public void setRiposte(Map<String, Integer> riposte) {
		this.riposte = riposte;
	}
	public int getThreshold() {
		return threshold;
	}
	public void setThreshold(int threshold) {
		this.threshold = threshold;
	}
	public boolean get_char_unique() {
		return char_unique;
	}
	public void set_char_unique(boolean char_unique) {
		this.char_unique = char_unique;
	}
	public String get_move_effective() {
		return move_effective;
	}
	public void set_move_effective(String move_effective) {
		this.move_effective = move_effective;
	}
	public Map<String, String> getBreaker() {
		return breaker;
	}
	public void setBreaker(Map<String, String> breaker) {
		this.breaker = breaker;
	}
	public String get_weapon_type() {
		return weapon_type;
	}
	public void set_weapon_type(String weapon_type) {
		this.weapon_type = weapon_type;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public int getRes() {
		return res;
	}
	public void setRes(int res) {
		this.res = res;
	}
	public int get_spec_cooldown_mod() {
		return spec_cooldown_mod;
	}
	public void set_spec_cooldown_mod(int spec_cooldown_mod) {
		this.spec_cooldown_mod = spec_cooldown_mod;
	}
	public boolean get_add_bonus() {
		return add_bonus;
	}
	public void set_add_bonus(boolean add_bonus) {
		this.add_bonus = add_bonus;
	}
	public boolean get_adjacent_ally_bonus() {
		return adjacent_ally_bonus;
	}
	public void set_adjacent_ally_bonus(boolean adjacent_ally_bonus) {
		this.adjacent_ally_bonus = adjacent_ally_bonus;
	}
	public String get_color_effective() {
		return color_effective;
	}
	public void set_color_effective(String color_effective) {
		this.color_effective = color_effective;
	}
	public int get_initiate_heal() {
		return initiate_heal;
	}
	public void set_initiate_heal(int initiate_heal) {
		this.initiate_heal = initiate_heal;
	}
	public boolean getBrave() {
		return brave;
	}
	public void setBrave(boolean brave) {
		this.brave = brave;
	}
	public Map<String, Integer> get_stat_mod() {
		return stat_mod;
	}
	public void set_stat_mod(Map<String, Integer> stat_mod) {
		this.stat_mod = stat_mod;
	}
	public int getSpd() {
		return spd;
	}
	public void setSpd(int spd) {
		this.spd = spd;
	}
	public boolean get_cancel_counter() {
		return cancel_counter;
	}
	public void set_cancel_counter(boolean cancel_counter) {
		this.cancel_counter = cancel_counter;
	}
	public int get_spec_damage_bonus() {
		return spec_damage_bonus;
	}
	public void set_spec_damage_bonus(int spec_damage_bonus) {
		this.spec_damage_bonus = spec_damage_bonus;
	}
	public Map<String, Integer> getSeal() {
		return seal;
	}
	public void setSeal(Map<String, Integer> seal) {
		this.seal = seal;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int get_intitiate_position() {
		return initiate_position;
	}
	public void set_initiate_position(int initiate_position) {
		this.initiate_position = initiate_position;
	}
	public Map<String, Integer> get_full_hp_mod() {
		return full_hp_mod;
	}
	public void set_full_hp_mod(Map<String, Integer> full_hp_mod) {
		this.full_hp_mod = full_hp_mod;
	}
	public Map<String, Integer> get_intiate_mod() {
		return initiate_mod;
	}
	public void set_initiate_mod(Map<String, Integer> initiate_mod) {
		this.initiate_mod = initiate_mod;
	}
	public Map<String, Integer> getThreaten() {
		return threaten;
	}
	public void setThreaten(Map<String, Integer> threaten) {
		this.threaten = threaten;
	}
	public boolean get_tri_advantage() {
		return tri_advantage;
	}
	public void set_tri_advantage(boolean tri_advantage) {
		this.tri_advantage = tri_advantage;
	}
	public boolean get_dragon_effective() {
		return dragon_effective;
	}
	public void set_dragon_effective(boolean dragon_effective) {
		this.dragon_effective = dragon_effective;
	}
	public boolean get_prevent_counter() {
		return prevent_counter;
	}
	public void set_prevent_counter(boolean prevent_counter) {
		this.prevent_counter = prevent_counter;
	}
	public Map<String, Integer> getDefiant() {
		return defiant;
	}
	public void setDefiant(Map<String, Integer> defiant) {
		this.defiant = defiant;
	}
	public boolean get_convert_penalties() {
		return convert_penalties;
	}
	public void set_convert_penalties(boolean convert_penalties) {
		this.convert_penalties = convert_penalties;
	}
	public boolean getCounter() {
		return counter;
	}
	public void setCounter() {
		this.counter = counter;
	}
	public int getPoison() {
		return poison;
	}
	public void setPoison(int poison) {
		this.poison = poison;
	}
	//hold String and int... for now just parse string to int
	public Map<String, String> get_target_seal() {
		return target_seal;
	}
	public void set_target_seal(Map<String, String> target_seal) {
		this.target_seal = target_seal;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public Map<String, Integer> get_after_mod() {
		return after_mod;
	}
	public void set_after_mod(Map<String, Integer> after_mod) {
		this.after_mod = after_mod;
	}
	public Map<String, Double> getDesperation() {
		return desperation;
	}
	public void setDesperation(Map<String, Double> desperation) {
		this.desperation = desperation;
	}
	//needs to hold String and Map types
	public Map<String, String> get_below_threshold_mod() { 
		return below_threshold_mod;
	}
	public void set_below_threshold_mod(Map<String, String> below_threshold_mod) {
		this.below_threshold_mod = below_threshold_mod;
	}
	public Map<String, Double> getVantage() {
		return vantage;
	}
	public void setVantage(Map<String, Double> vantage) {
		this.vantage = vantage;
	}
	
	
	
}

