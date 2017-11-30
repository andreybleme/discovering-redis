package com.discovering.redis.loteria;

import java.util.List;
import java.util.Set;

import redis.clients.jedis.Jedis;

public class FiltrarHistoricoDaMegaSena {

	private static Jedis jedis = new Jedis("localhost");;
	
	public static Set<String> filtrarResultados(int mes, int ano) {
		String chave = "resultado:*-%02d-%04d:megasena";
		
		return jedis.keys(String.format(chave, mes, ano));
	}
	
	public static List<String> exercicio1mget() { 
		return jedis.mget("resultado:megasena", "resultado:07-09-2013:megasena");
	}
	
	public static Long exercicio2Strlen() {
		return jedis.strlen("resultado:megasena");
	}
	
	public static String exercicio3GetRange() {
		return jedis.getrange("resultado:megasena", 0, 1);
	}

}
