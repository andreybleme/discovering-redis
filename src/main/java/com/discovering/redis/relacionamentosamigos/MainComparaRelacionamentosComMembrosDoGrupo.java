package com.discovering.redis.relacionamentosamigos;

public class MainComparaRelacionamentosComMembrosDoGrupo {
	
	public static void main(String[] args) {
		ComparaRelacionamentosComMembrosDoGrupo relacionamentos = new ComparaRelacionamentosComMembrosDoGrupo();
		relacionamentos.verAmigosDoGrupo("rafael", "cachorro");
		relacionamentos.verAmigosDoGrupo("rodrigo", "video-game");
		relacionamentos.verAmigosDoGrupo("andressa", "novela");
	}

}
