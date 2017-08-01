package com.ajplee.FEArenaSim.etl.heroes;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Skill {
	private String name;
	private String description;
	private Map<String, Integer> initiate_mod;
	private String weapon_restrict;
	private int def;
	private int atk;
	private Map<String, Integer> stat_mod;
	private boolean counter;
	private int range_unique;
	private List<Map<String, Object>> type_defend_mod;
	private Map<String, String> weapon_type;
	private boolean sword;
	private boolean axe;
	private boolean lance;
	private boolean dragon_stone;
	private int spd;
	private int hp;
	private Map<String, Integer> defiant;
	private boolean bow;
	private boolean dagger;
	private boolean staff;
	private boolean green_tome;
	private boolean red_tome;
	private boolean blue_tome;
	private Map<Object, Object> hp_adv_mod;
	private int hp_adv;
	private int recoil_damage;
	private String weapon_unique;
	private boolean cancel_effective;
	private String move_unique;
	private Map<String, Object> spec_accel;
	private String stat;
	private int adv;
	private double tri_advantage;
	private String color_restrict;
	private int res;
	private Map<String, Integer> breaker;
	private String weapon_type_breaker;
	private double threshold;
	private String move_restrict;
	private Map<String, Integer> brash;
	private boolean cancel_skill_affinity;
	private boolean cancel_enemy_skill_affinity;
	private boolean cancel_negative_enemy_skill_affinity;
	private double prevent_enemy_counter;
	private Map<String, Double> desperation;
	private double guard;
	private int poison;
	private Map<String, Integer> ripsote;
	private Map<String, Integer> heal;
	private int amount;
	private int turn_counter;
	private Map<String, Integer> seal;
	private Map<String, Integer> vantage;
	private Map<String, Integer> wary;
	private Map<Object, Object> sweep;
	private int spd_adv;
	private boolean no_follow;
	private boolean reg_weapon_dmg;
	
}
