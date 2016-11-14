package br.com.k19.modelo;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * 
 * @author Bruno Cícero Rodrigues de Souza
 * 
 *         Tabela Livro será gerada a partir dessa classe com o relacionamento
 *         Many to Many (@ManyToMany)
 *
 */

@Entity
public class Livro {

	@Id
	@GeneratedValue
	private Long id;

	private String nome;

	@ManyToMany
	private Collection<Autor> autores = new ArrayList<Autor>();

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

	public Collection<Autor> getAutores() {
		return autores;
	}

	public void setAutores(Collection<Autor> autores) {
		this.autores = autores;
	}

}
