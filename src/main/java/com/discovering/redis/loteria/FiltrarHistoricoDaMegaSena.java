package com.discovering.redis.loteria;

import java.util.Set;

import redis.clients.jedis.Jedis;

public class FiltrarHistoricoDaMegaSena {

	private static Jedis jedis;
	
	public static Set<String> filtrarResultados(int mes, int ano) {
		String chave = "resultado:*-%02d-%04d:megasena";
		jedis = new Jedis("localhost");
		
		return jedis.keys(String.format(chave, mes, ano));
	}

}
