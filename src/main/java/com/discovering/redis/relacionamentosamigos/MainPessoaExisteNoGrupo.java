package com.discovering.redis.relacionamentosamigos;

public class MainPessoaExisteNoGrupo {

	public static void main(String[] args) {
		PessoaExisteNoGrupo pessoa = new PessoaExisteNoGrupo();
		
		pessoa.existe("judo", "rodrigo");
		pessoa.existe("livro", "gustavo");
		pessoa.existe("cachorro", "cristiane");
		pessoa.existe("cachorro", "andressa");
		pessoa.existe("violao", "carlos");
	}

}
