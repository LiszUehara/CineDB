package bd.cinedb.database.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name =   "filme_genero")
@SequenceGenerator(name = "seq_filme_genero", sequenceName = "seq_filme_genero", allocationSize = 1, initialValue = 1)
public class Filme_Genre implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_filme_genero")
	private Long id;
	
	
}
