package bd.cinedb.database.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name =   "filme")
@SequenceGenerator(name = "seq_filme", sequenceName = "seq_filme", allocationSize = 1, initialValue = 1)
public class Filme implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_filme")
	private Long id;
	
	private String nome;
	
	private String datails;
	
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
	public String getDatails() {
		return datails;
	}
	public void setDatails(String datails) {
		this.datails = datails;
	}
	
	
	
}
