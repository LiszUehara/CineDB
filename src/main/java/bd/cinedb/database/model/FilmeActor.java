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
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "filme_action")
@SequenceGenerator(name = "seq_filme_actor", sequenceName = "seq_filme_actor", allocationSize = 1, initialValue = 1)
public class FilmeActor implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_filme_actor")
	private Long id;
	

	@OneToOne(targetEntity = Actor.class)
	@JoinColumn(
			name = "actor_id", 
			nullable = false, 
	foreignKey = 
	@ForeignKey(
			name = "actor_fk", 
			value = ConstraintMode.CONSTRAINT))
	private Actor actor;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Actor getActor() {
		return actor;
	}


	public void setActor(Actor actor) {
		this.actor = actor;
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
		FilmeActor other = (FilmeActor) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
