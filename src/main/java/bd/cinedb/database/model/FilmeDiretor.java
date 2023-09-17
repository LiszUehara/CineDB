package bd.cinedb.database.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	
	
}
