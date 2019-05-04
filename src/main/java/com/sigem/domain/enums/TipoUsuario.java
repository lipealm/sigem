package com.sigem.domain.enums;

public enum TipoUsuario {
	ADM(1, "Administrador"), 
	ESTOQUISTA(2, "Estoquista"), 
	SOLICITANTE(3, "Solicitante");
	
	private int cod;
	private String descricao;
	
	private TipoUsuario(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static TipoUsuario toEnum (Integer cod) {
		if (cod==null) {
		return null;
	}
		for(TipoUsuario tipoUsuario: TipoUsuario.values()) {
			if(cod.equals(tipoUsuario.getCod())) {
				return tipoUsuario;
			}
		}
		throw new IllegalArgumentException("Id invalido: " + cod);
	}
	
}
