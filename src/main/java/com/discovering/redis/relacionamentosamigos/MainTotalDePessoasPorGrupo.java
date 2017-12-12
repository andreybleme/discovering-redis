package com.discovering.redis.relacionamentosamigos;

public class MainTotalDePessoasPorGrupo {

	public static void main(String[] args) {
		TotalDePessoasPorGrupo grupo = new TotalDePessoasPorGrupo();
		grupo.monstrarQuantidadeDeMembros("video-game");
		grupo.monstrarQuantidadeDeMembros("judo");
		grupo.monstrarQuantidadeDeMembros("natacao");
		grupo.monstrarQuantidadeDeMembros("kung-fu");
		grupo.monstrarQuantidadeDeMembros("violao");
		grupo.monstrarQuantidadeDeMembros("ciclismo");
		grupo.monstrarQuantidadeDeMembros("cachorro");
		grupo.monstrarQuantidadeDeMembros("moto");
		grupo.monstrarQuantidadeDeMembros("carro");
		grupo.monstrarQuantidadeDeMembros("livro");
		grupo.monstrarQuantidadeDeMembros("novela");
	}
}
