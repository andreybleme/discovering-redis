package com.discovering.redis.sessao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import redis.clients.jedis.Jedis;

public class MainSessao {
	
	private static Jedis jedis;

	public static void main(String[] args) {
		String codigoUsuario = "1962";
		String nomeUsuario = "Peter Parker";
		String emailUsuario = "peter@parker.com";
		
		String chave = "sessao:usuario:" + codigoUsuario;
		Map<String, String> campos = new HashMap<String, String>();
		campos.put("codigo", codigoUsuario);
		campos.put("nome", nomeUsuario);
		campos.put("email", emailUsuario);
		
		jedis = new Jedis("localhost");
		String resultado = jedis.hmset(chave, campos);
		System.out.println(resultado);
		
		setaExpiracao();
		exercicio1Persist();
		exercicio2Hmget();
		exercicio3Pexpire();
	}
	
	private static void setaExpiracao() {
		String chave = "sessao:usuario:1962";
		int trintaMinutosEmSegundos = 1800;
		
		jedis = new Jedis("localhost");
		long resultado = jedis.expire(chave, trintaMinutosEmSegundos);
		System.out.println("Expire = " + resultado);
	}
	
	private static void exercicio1Persist() {
		jedis = new Jedis("localhost");
		String chave = "sessao:usuario:1962";
		
		long resultado = jedis.persist(chave);
		System.out.println("Persist = " + resultado);
	}
	
	private static void exercicio2Hmget() {
		jedis = new Jedis("localhost");
		String chave = "sessao:usuario:1962";
		
		List<String> resultado = jedis.hmget(chave, "codigo", "nome", "email");
		resultado.forEach(res -> System.out.println(res));
	}
	
	private static void exercicio3Pexpire() {
		jedis = new Jedis("localhost");
		String chave = "sessao:usuario:1962";
		
		long resultado = jedis.pexpire(chave, 30 * 60000L);
		System.out.println("Pexpire = " + resultado);
	}

}
