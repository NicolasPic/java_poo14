package entidades;

import java.util.Objects;

public class Votos {

	private String nome;
	private Integer voto;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getVoto() {
		return voto;
	}
	
	public void setVoto(Integer voto) {
		this.voto = voto;
	}
	
	public Votos(String nome, Integer voto) {
		this.nome = nome;
		this.voto = voto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, voto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Votos other = (Votos) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(voto, other.voto);
	}
	
	
}
