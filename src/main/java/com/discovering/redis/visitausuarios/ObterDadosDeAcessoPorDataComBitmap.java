package com.discovering.redis.visitausuarios;

import java.util.Arrays;

import redis.clients.jedis.Jedis;

public class ObterDadosDeAcessoPorDataComBitmap {
	
	private static Jedis jedis;
	
	private static long acessoPorPeriodo(String... datas) {
		jedis = new Jedis("localhost");
		long total = 0;
		
		for (String data : datas) {
			String chave = "acesso:" + data;
			total += jedis.bitcount(chave);
		}
		
		return total;
	}

	public static void main(String[] args) {
		String[] diario = {"05/11/2013"};
		String[] semanal = {
				"16/11/2013",
				"17/11/2013",
				"18/11/2013",
				"19/11/2013",
				"20/11/2013",
				"21/11/2013",
				"22/11/2013"
		};
		
		long totalDiario = acessoPorPeriodo(diario);
		long totalSemanal = acessoPorPeriodo(semanal);
		
		System.out.println("Total de usuários únicos no dia " + Arrays.asList(diario) + "foi: " + totalDiario);
		System.out.println("Total de usuários únicos nos dias " + Arrays.asList(semanal) + "foi: " + totalSemanal);

	}

}
