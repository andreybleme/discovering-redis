package com.discovering.redis.relacionamentosamigos;

import java.util.Arrays;

import redis.clients.jedis.Jedis;

public class ConjuntoDeGruposDePessoas {
	
	private Jedis jedis;

	public void adicionaMembrosAoGrupo(String grupo, String[] membros) {
		String chave = String.format("grupos:%s:membros", grupo);
		
		jedis =  new Jedis("localhost");
		long resultado = jedis.sadd(chave, membros);
		
		System.out.println(String.format
				("Grupo (%s) tem %d membros %s", grupo, resultado, Arrays.asList(membros)));
	}
}
