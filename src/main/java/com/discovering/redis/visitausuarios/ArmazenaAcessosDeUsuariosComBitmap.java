package com.discovering.redis.visitausuarios;

import redis.clients.jedis.Jedis;

public class ArmazenaAcessosDeUsuariosComBitmap {
	
	private Jedis jedis;
	
	public void armazenar(long codigoUsuario, String data) {
		jedis = new Jedis("localhost");
		String chave = String.format("acesso:%s", data);
		
		jedis.setbit(chave, codigoUsuario, true);
	}

}
