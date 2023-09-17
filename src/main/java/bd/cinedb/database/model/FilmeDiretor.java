package bd.cinedb.database.model;

import java.io.Serializable;

import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name =   "filme_diretor")
@SequenceGenerator(name = "seq_filme_diretor", sequenceName = "seq_filme_diretor", allocationSize = 1, initialValue = 1)
public class FilmeDiretor implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_filme_diretor")
	private Long id;
	
	@OneToOne(targetEntity = Director.class)
	@JoinColumn(
			name = "diretor_id", 
			nullable = false, 
	foreignKey = 
	@ForeignKey(
			name = "diretor_fk", 
			value = ConstraintMode.CONSTRAINT))
	private Director director;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}
	
	
}
