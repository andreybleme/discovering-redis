package com.discovering.redis.filasemails;

import com.google.gson.Gson;

import redis.clients.jedis.Jedis;

public class ConsomeItemDaFila {
	
	private Jedis jedis;
	
	public void enviarEmailAtivacaoUsuario() {
		int timeOut = 2;
		String chave = "fila:confirmar-usuario";
		
		jedis = new Jedis("localhost");
		java.util.List<String> mensagens = jedis.blpop(timeOut, chave);
		
		if (mensagens == null) {
			System.out.println("A fila " + chave + " está vazia.");
		} else {
			String json = mensagens.get(0);
			Mensagem mensagem = new Gson().fromJson(json, Mensagem.class);
			System.out.println(String.format("Enviando e-mail para %s (%s)", mensagem.getEmail(), mensagem.getNome()));	
		}
	}

}
