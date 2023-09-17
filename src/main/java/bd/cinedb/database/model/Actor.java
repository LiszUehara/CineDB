package bd.cinedb.database.model;

import java.io.Serializable;

import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.ForeignKey;

@Entity
@Table(name =   "actor")
@SequenceGenerator(name = "seq_actor", sequenceName = "seq_actor", allocationSize = 1, initialValue = 1)
public class Actor implements Serializable{


	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_actor")
	private Long id;
	private String name;
	
	
	@ManyToOne(targetEntity = Filme.class)
	@JoinColumn(name = "filme_id", 
		nullable = true, 
		foreignKey = 
	@ForeignKey(
			name = "filme_id", 
			value = ConstraintMode.CONSTRAINT
			))
	private Filme filme;
	
	
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
	
	
	
}
