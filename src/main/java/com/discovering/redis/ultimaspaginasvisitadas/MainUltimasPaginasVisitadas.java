package com.discovering.redis.ultimaspaginasvisitadas;

import redis.clients.jedis.Jedis;

public class MainUltimasPaginasVisitadas {
	
	private static Jedis jedis;

	public static void main(String[] args) {
		String chave = "ultimas_paginas_visitadas";
		String[] paginas = {
				"/inicio",
				"/contato",
				"/sobre-mim",
				"/todos-os-posts",
				"/armazenando-dados-no-redis"
		};
		
		jedis = new Jedis("localhost");
		
		Long resultado = jedis.lpush(chave, paginas);
		System.out.println(String.format("A lista %s contém %d elementos", chave, resultado));
		
		//	Mantem apenas 3 registros na lista
		jedis.ltrim(chave, 0, 2);
		
		buscaUltimas3PaginasVisitadas();
		exercicio1Lindex();
		exercicio2Lrem();
	}
	
	private static void buscaUltimas3PaginasVisitadas() {
		String chave = "ultimas_paginas_visitadas";
		jedis = new Jedis("localhost");
		
		System.out.println("As 3 últimas páginas visitadas são: ");
		java.util.List<String> paginas = jedis.lrange(chave, 0, 2);
		paginas.forEach(p -> System.out.println(p));
	}
	
	private static void exercicio1Lindex() {
		String chave = "ultimas_paginas_visitadas";
		jedis = new Jedis("localhost");
		
		String primeiraPagina = jedis.lindex(chave, 0);
		String ultimaPagina = jedis.lindex(chave, 2);
		System.out.println("Primeira página: " + primeiraPagina);
		System.out.println("Ultima página: " + ultimaPagina);
	}
	
	private static void exercicio2Lrem() {
		String chave = "ultimas_paginas_visitadas";
		jedis = new Jedis("localhost");
		
		jedis.lrem(chave, 0, chave);
	}

}
