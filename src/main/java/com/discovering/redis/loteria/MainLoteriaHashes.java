package com.discovering.redis.loteria;

import redis.clients.jedis.Jedis;

public class MainLoteriaHashes {
	
	private static Jedis jedis;

	public static void main(String[] args) {
		String ganhadores = "22";
		String dataSorteio = "19-11-2013";
		String numeros = "8, 18, 26, 42, 56, 58";
		String chave = String.format("resultado:%s:megasena", dataSorteio);
		
		jedis = new Jedis("localhost");
		long resutado1 = jedis.hset(chave, "ganhadores", ganhadores);
		long resutado2 = jedis.hset(chave, "numeros", numeros);
		System.out.println("Resultado 1 = " + resutado1 + ", Resultado 2 = " + resutado2);
		
		buscaValorHash();
		exercicio1Hdel();
		exercicio2Hexists();
		exercicio3Hlen();
	}
	
	private static void buscaValorHash() {
		String chave = "resultado:19-11-2013:megasena";
		jedis = new Jedis("localhost");
		String ganhadores = jedis.hget(chave, "ganhadores");
		String numeros = jedis.hget(chave, "numeros");
		System.out.println("Ganhadores = " + ganhadores + ", Numeros = " + numeros);
	}
	
	private static void exercicio1Hdel() {
		jedis = new Jedis("localhost");
		long resultado = jedis.hdel("resultado:19-11-2013:megasena", "ganhadores");
		System.out.println("Deletado 'ganhadores' = " + resultado);
	}
	
	private static void exercicio2Hexists() {
		jedis = new Jedis("localhost");
		Boolean resultado = jedis.hexists("resultado:19-11-2013:megasena", "ganhadores");
		System.out.println("Exists 'ganhadores' = " + resultado);
	}
	
	private static void exercicio3Hlen() {
		jedis = new Jedis("localhost");
		long resultado = jedis.hlen("resultado:19-11-2013:megasena");
		System.out.println("Len 'ganhadores' = " + resultado);
	}
}
