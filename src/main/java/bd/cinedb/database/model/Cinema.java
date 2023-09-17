package bd.cinedb.database.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "cinema")
@SequenceGenerator(name = "seq_cinema", sequenceName = "seq_cinema", allocationSize = 1, initialValue = 1)
public class Cinema implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cinema")
	private Long id;
	
	private String name;
	private String local;
	

	@ManyToOne(targetEntity = Filme.class)
	@JoinColumn(name = "filme_id", 
		nullable = true, 
		foreignKey = 
	@ForeignKey(
			name = "filme_id", 
			value = ConstraintMode.CONSTRAINT
			))
	private Filme filmes;
	
	@ManyToOne(targetEntity = Filme.class)
	@JoinColumn(name = "ticket_id", 
		nullable = true, 
		foreignKey = 
	@ForeignKey(
			name = "ticket_id", 
			value = ConstraintMode.CONSTRAINT
			))
	private Ticket ticket;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	
	
	public Filme getFilmes() {
		return filmes;
	}
	public void setFilmes(Filme filmes) {
		this.filmes = filmes;
	}
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cinema other = (Cinema) obj;
		return Objects.equals(id, other.id);
	}
	
}
	
