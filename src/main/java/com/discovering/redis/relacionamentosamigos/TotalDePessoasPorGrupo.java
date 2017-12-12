package com.discovering.redis.relacionamentosamigos;

import redis.clients.jedis.Jedis;

public class TotalDePessoasPorGrupo {
	
	private Jedis jedis;
	
	public void monstrarQuantidadeDeMembros(String grupo) {
		String chave = String.format("grupos:%s:membros", grupo);
		
		jedis = new Jedis("localhost");
		
		long resultado = jedis.scard(chave);
		System.out.println(String.format("Grupo (%s) tem %d membros", grupo, resultado));
	}

}
