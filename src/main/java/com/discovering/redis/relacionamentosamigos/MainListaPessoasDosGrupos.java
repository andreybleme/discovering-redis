package com.discovering.redis.relacionamentosamigos;

public class MainListaPessoasDosGrupos {

	public static void main(String[] args) {
		ListaPessoasDosGrupos grupos = new ListaPessoasDosGrupos();
		
		grupos.listarMembros("video-game");
		grupos.listarMembros("judo");
		grupos.listarMembros("natacao");
		grupos.listarMembros("kung-fu");
		grupos.listarMembros("violao");
		grupos.listarMembros("ciclismo");
		grupos.listarMembros("cachorro");
		grupos.listarMembros("moto");
		grupos.listarMembros("carro");
		grupos.listarMembros("livro");
		grupos.listarMembros("novela");
	}
}
