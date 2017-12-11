package com.discovering.redis.filasemails;

import redis.clients.jedis.Jedis;

public class ArmazenaItemNaFila {
	
	private Jedis jedis;
	
	public void agentarAutorizacaoDeUsuario(String nome, String email) {
		String chave = "fila:confirmar-usuario";
		String mensagem = String.format("{\"nome\": \"%s\", \"email\": \"%s\"}", nome, email);
		
		jedis = new Jedis("localhost");
		Long resultado = jedis.rpush(chave, mensagem);
		System.out.println("A fila " + chave + "contém " + resultado);
	}

}
