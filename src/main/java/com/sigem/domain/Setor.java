package com.sigem.domain;

import java.util.ArrayList;
import java.util.List;

public class Setor {

	private long idSetor;
	private String nomeSetor;
	private String emailSetor;
	private List<Usuario> usuarios = new ArrayList<>();
	
	public Setor () {
		
	}

	public Setor(long idSetor, String nomeSetor, String emailSetor) {
		super();
		this.idSetor = idSetor;
		this.nomeSetor = nomeSetor;
		this.emailSetor = emailSetor;
	}

	public long getIdSetor() {
		return idSetor;
	}

	public void setIdSetor(long idSetor) {
		this.idSetor = idSetor;
	}

	public String getNomeSetor() {
		return nomeSetor;
	}

	public void setNomeSetor(String nomeSetor) {
		this.nomeSetor = nomeSetor;
	}

	public String getEmailSetor() {
		return emailSetor;
	}

	public void setEmailSetor(String emailSetor) {
		this.emailSetor = emailSetor;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idSetor ^ (idSetor >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Setor other = (Setor) obj;
		if (idSetor != other.idSetor)
			return false;
		return true;
	}	
}
