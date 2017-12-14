package com.discovering.redis.relacionamentosamigos;

import redis.clients.jedis.Jedis;

public class PessoaExisteNoGrupo {

	private Jedis jedis;
	
	public void existe(String grupo, String pessoa) {
		String chave = String.format("grupos:%s:membros", grupo);
		
		jedis = new Jedis("localhost");
		boolean resultado = jedis.sismember(chave, pessoa);
		System.out.println(String.format("%s é membro do grupo (%s)? %s", pessoa, grupo, resultado ? "SIM" : "NÃO"));
	}
}
