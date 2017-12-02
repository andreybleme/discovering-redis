package com.discovering.redis.paginasvisitadas;

import redis.clients.jedis.Jedis;

public class GeraEstatisticasDePaginasVisitadas {
	
	private Jedis jedis;
	
	public void gerarEstatistica(String pagina, String data) {
		String chave = String.format("pagina:%s:%s", pagina, data);
		
		jedis = new Jedis("localhost");
		long resultado = jedis.incr(chave);
		
		System.out.println(String.format("página %s teve %d acesso(s) em %s", pagina, resultado, data));
	}

}
