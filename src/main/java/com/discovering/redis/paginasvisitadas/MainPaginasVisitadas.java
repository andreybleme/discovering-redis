package com.discovering.redis.paginasvisitadas;

public class MainPaginasVisitadas {

	public static void main(String[] args) {
		String data = "01/12/2017";
		String[] paginasVisitadas = {
				"/inicio",
				"/contato",
				"/sobre-mim",
				"todos-os-posts",
				"armazenando-dados-no-redis"
				};
		
		GeraEstatisticasDePaginasVisitadas geradorEstatisticas = new GeraEstatisticasDePaginasVisitadas();
		geradorEstatisticas.gerarEstatistica(paginasVisitadas[0], data);
		geradorEstatisticas.gerarEstatistica(paginasVisitadas[1], data);
		geradorEstatisticas.gerarEstatistica(paginasVisitadas[2], data);
		geradorEstatisticas.gerarEstatistica(paginasVisitadas[1], data);
		geradorEstatisticas.gerarEstatistica(paginasVisitadas[1], data);

	}

}
