package com.discovering.redis.loteria;

import java.util.List;
import java.util.Set;

import redis.clients.jedis.Jedis;

public class MainLoteriaStrings {

	private static Jedis jedis;

	public static void main(String[] args) {
		criarResultados();
		int mes = 10;
		int ano = 2013;
		
		Set<String> chavesResult = FiltrarHistoricoDaMegaSena.filtrarResultados(mes, ano);
		System.out.println("Filtro por ano/mês - " + chavesResult);
		
		List<String> todasChaves = FiltrarHistoricoDaMegaSena.exercicio1mget();
		System.out.println("ex1 - " + todasChaves);
		
		Long tamanhoChave = FiltrarHistoricoDaMegaSena.exercicio2Strlen();
		System.out.println("ex2 - " + tamanhoChave);
		
		String range = FiltrarHistoricoDaMegaSena.exercicio3GetRange();
		System.out.println("ex3 - " + range);
	}
	
	private static void criarResultados() {
		String dataDoSorteio1 = "04-09-2013";
		String numerosDoSorteio1 = "10, 11, 18, 42, 55, 56";
		
		String chave1 = String.format("resultado:%s:megasena", dataDoSorteio1);
		String dataDoSorteio2 = "07-09-2013";
		String numerosDoSorteio2 = "2, 21, 30, 35, 45, 50";
		
		String chave2 = String.format("resultado:%s:megasena", dataDoSorteio2);
		String dataDoSorteio3 = "21-09-2013";		
		String numerosDoSorteio3 = "2, 13, 24, 41, 42, 44";
		
		String chave3 = String.format("resultado:%s:megasena", dataDoSorteio3);
		String dataDoSorteio4 = "02-10-2013";
		String numerosDoSorteio4 = "7, 15, 20, 23, 30, 41";
		
		String chave4 = String.format("resultado:%s:megasena", dataDoSorteio4);
		jedis = new Jedis("localhost");
		
		String resultado = jedis.mset(
				chave1, numerosDoSorteio1,
				chave2, numerosDoSorteio2,
				chave3, numerosDoSorteio3,
				chave4, numerosDoSorteio4
				);
		
		System.out.println(resultado);
	}

}
