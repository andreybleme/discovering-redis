package com.discovering.redis.relacionamentosamigos;

import java.util.Set;

import redis.clients.jedis.Jedis;

public class ListaPessoasDosGrupos {
	
	private Jedis jedis;
	
	public void listarMembros(String grupo) {
		String chave = String.format("grupos:%s:membros", grupo);
		
		jedis = new Jedis("localhost");
		Set<String> membros = jedis.smembers(chave);
		
		System.out.println(String.format("Membros do grupo (%s): %s", grupo, membros.toString()));
	}

}
