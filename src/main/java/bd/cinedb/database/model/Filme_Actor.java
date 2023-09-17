package bd.cinedb.database.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "filme_action")
@SequenceGenerator(name = "seq_filme_actor", sequenceName = "seq_filme_actor", allocationSize = 1, initialValue = 1)
public class Filme_Actor implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_filme_actor")
	private Long id;
	
	
}
