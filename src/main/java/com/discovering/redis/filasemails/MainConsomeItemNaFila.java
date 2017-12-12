package com.discovering.redis.filasemails;

public class MainConsomeItemNaFila {

	public static void main(String[] args) {	
		ConsomeItemDaFila fila = new ConsomeItemDaFila();
		 
		while (true) {
			fila.enviarEmailAtivacaoUsuario();
		}
	}

}
