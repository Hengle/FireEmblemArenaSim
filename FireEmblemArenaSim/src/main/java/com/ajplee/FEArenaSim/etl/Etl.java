package com.ajplee.FEArenaSim.etl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.net.URL;
import java.net.HttpURLConnection;

import com.ajplee.FEArenaSim.etl.heroes.Heroes;
import com.ajplee.FEArenaSim.etl.heroes.Assist;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Etl {
	final static Logger logger = LoggerFactory.getLogger("ETL");
	private String jsonText;
	private Heroes[] heroes;
	private Assist[] assist;
	
	private static final String hsURL = "https://api.hearthstonejson.com/v1/20022/enUS/cards.json";
	private static final String charURL = "https://kagerochart.com/dist/scripts/damage-calc/char.js";
	private static final String specialURL = "https://kagerochart.com/dist/scripts/damage-calc/special.js";
	private static final String weaponURL = "https://kagerochart.com/dist/scripts/damage-calc/weapon.js";
	private static final String assistURL = "https://kagerochart.com/dist/scripts/damage-calc/assist.js";
	
	public void run() throws Exception {
		//getData(hsURL);
		getData(assistURL);
		transformData();
		//loadData();
		//getData(specialURL);
		//transformData();
		//loadData();
		//getData(weaponURL);
		//transformData();
		//loadData();
	}
	//https://api.hearthstonejson.com/v1/20022/enUS/cards.json
	//https://kagerochart.com/dist/scripts/damage-calc/char.js
	public void getData(String url) throws Exception {
		HttpURLConnection conn = null;
		try {
			URL FireEmblemHeroesUrl = new URL(url);
			conn = (HttpURLConnection) FireEmblemHeroesUrl.openConnection();
			conn.setRequestProperty(
			          "User-Agent",
			          "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; .NET CLR 1.0.3705; .NET CLR 1.1.4322; .NET CLR 1.2.30703)");
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-length", "0");
			conn.setUseCaches(false);
			conn.setAllowUserInteraction(false);
			conn.setConnectTimeout(6000);
			conn.setReadTimeout(1500000);
			conn.connect();
			InputStreamReader ir = new InputStreamReader(conn.getInputStream());
			BufferedReader br = new BufferedReader(ir);
			StringBuilder sb = new StringBuilder();
	        String line;
	        while ((line = br.readLine()) != null) {
	          sb.append(line + "\n");
	        }
	        ir.close();
	        br.close();
	        	
	        jsonText = sb.toString();
		} catch (Exception e) {
			logger.error("Parsing failed" + e.getMessage());
		} finally {
			if(conn != null) {
				conn.disconnect();
			}
		}
        System.out.println(jsonText);
	}
	
	public void transformData() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		try {
			assist = mapper.readValue(jsonText, Assist[].class);	
			System.out.println(heroes.length);
		} catch (IOException e) {
			logger.error("Transforming data failed " + e.getMessage());
		}
		
	}
	
	public void loadData() throws Exception {
		for (Heroes hero : heroes) {
			return;
		}
	}
	 


	public static void main(String[] args) throws Exception {
		Etl etl = new Etl();
		etl.run();
	}
}
