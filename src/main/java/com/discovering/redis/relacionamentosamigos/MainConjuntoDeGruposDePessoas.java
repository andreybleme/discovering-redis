package com.discovering.redis.relacionamentosamigos;

public class MainConjuntoDeGruposDePessoas {

	public static void main(String[] args) {
		ConjuntoDeGruposDePessoas relacionamentos = new ConjuntoDeGruposDePessoas();
		relacionamentos.adicionaMembrosAoGrupo("video-game", new String[]{"rafael", "gustavo", "carlos", "rodrigo"});
		relacionamentos.adicionaMembrosAoGrupo("judo", new String[]{"rafael"});
		relacionamentos.adicionaMembrosAoGrupo("natacao", new String[]{"rafael", "cristiane"});
		relacionamentos.adicionaMembrosAoGrupo("kung-fu", new String[]{"andressa"});
		relacionamentos.adicionaMembrosAoGrupo("violao", new String[]{"gustavo"});
		relacionamentos.adicionaMembrosAoGrupo("ciclismo", new String[]{"cristiane"});
		relacionamentos.adicionaMembrosAoGrupo("cachorro", new String[]{"cristiane", "rodrigo", "tereza"});
		relacionamentos.adicionaMembrosAoGrupo("moto", new String[]{"carlos"});
		relacionamentos.adicionaMembrosAoGrupo("carro", new String[]{"carlos", "rodrigo"});
		relacionamentos.adicionaMembrosAoGrupo("livro", new String[]{"gustavo", "rodrigo"});
		relacionamentos.adicionaMembrosAoGrupo("novela", new String[]{"andressa", "cristiane", "tereza"});
	}

}
