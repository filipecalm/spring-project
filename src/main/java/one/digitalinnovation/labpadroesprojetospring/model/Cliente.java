package one.digitalinnovation.labpadroesprojetospring.model;

import javax.persistence.*;

@Entity
public class Cliente extends ClienteRepository {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;

	@ManyToOne
	public String Endereco;
	@ManyToOne
	@JoinColumn(name = "endereco_cep")
	private Endereco endereco;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}