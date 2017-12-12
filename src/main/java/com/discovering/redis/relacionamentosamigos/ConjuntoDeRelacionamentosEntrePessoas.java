package com.discovering.redis.relacionamentosamigos;

import java.util.Arrays;

import redis.clients.jedis.Jedis;

public class ConjuntoDeRelacionamentosEntrePessoas {
	
	private Jedis jedis;
	
	public void adicionaAmigos(String pessoa, String[] amigos) {
		String chave = String.format("pessoas:%s:relacionamentos", pessoa);
		
		jedis = new Jedis("localhost");
		long resultado = jedis.sadd(chave, amigos);
		
		System.out.println(String.format
				("%s tem %d amigos %s", pessoa, resultado, Arrays.toString(amigos)));
	}
}
