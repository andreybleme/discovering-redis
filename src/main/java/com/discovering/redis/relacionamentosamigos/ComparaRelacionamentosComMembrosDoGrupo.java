package com.discovering.redis.relacionamentosamigos;

import java.util.Set;

import redis.clients.jedis.Jedis;

public class ComparaRelacionamentosComMembrosDoGrupo {
	
	private Jedis jedis;
	
	public void verAmigosDoGrupo(String pessoa, String grupo) {
		String chavePessoa = String.format("pessoas:%s:relacionamentos", pessoa);
		String chaveGrupo = String.format("grupos:%s:membros", grupo);
		
		jedis = new Jedis("localhost");
		Set<String> pessoas = jedis.sinter(chavePessoa, chaveGrupo);
		System.out.println(String.format("%s são amigos de %s"
				+ " e fazem parte do grupo que gosta de %s", 
				pessoas.toString(),
				pessoa,
				grupo));
	}

}
