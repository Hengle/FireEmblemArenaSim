package com.ajplee.FEArenaSim.etl.heroes;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Special {
	private String name;
	private String description;
	private int cooldown;
	private Map<String, Double> reduce_dmg; //int and double
	private int stat;
	private int buff;
	private int range;
	private int range_unique;
	private int heal_dmg;
	private String weapon_restrict;
	private int enemy_def_res_mod;
	private int dmg_mod;
	private boolean before_combat_aoe;
	private int aoe_dmg_mod;
	private Map<String, String> dmg_buff_by_stat; //hold string and double
	private boolean extra_action;
	private boolean survive;
	private int dmg_suffer_buffer;
	private String weapon_unique;	
	
}
