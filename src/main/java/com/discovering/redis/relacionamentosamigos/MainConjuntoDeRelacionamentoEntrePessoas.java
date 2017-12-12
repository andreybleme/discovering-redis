package com.discovering.redis.relacionamentosamigos;

public class MainConjuntoDeRelacionamentoEntrePessoas {
	
	public static void main(String[] args) {
		
		ConjuntoDeRelacionamentosEntrePessoas relacionamentos = new ConjuntoDeRelacionamentosEntrePessoas();
		relacionamentos.adicionaAmigos("rafael", new String[]{"gustavo", "andressa", "rodrigo", "tereza"});
		relacionamentos.adicionaAmigos("andressa", new String[]{"cristiane", "rodrigo", "gustavo", "rafael"});
		relacionamentos.adicionaAmigos("gustavo", new String[]{"carlos", "tereza", "rafael", "andressa"});
		relacionamentos.adicionaAmigos("cristiane", new String[]{"tereza", "andressa", "carlos"});
		relacionamentos.adicionaAmigos("carlos", new String[]{"cristiane", "rodrigo", "gustavo"});
		relacionamentos.adicionaAmigos("rodrigo", new String[]{"andressa", "rafael", "carlos"});
		relacionamentos.adicionaAmigos("tereza", new String[]{"gustavo", "rafael", "cristiane"});
	}

}
