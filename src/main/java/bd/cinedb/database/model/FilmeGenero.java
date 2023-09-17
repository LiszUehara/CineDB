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
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name =   "filme_genero")
@SequenceGenerator(name = "seq_filme_genero", sequenceName = "seq_filme_genero", allocationSize = 1, initialValue = 1)
public class FilmeGenero implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_filme_genero")
	private Long id;
	
	@OneToOne(targetEntity = Genre.class)
	@JoinColumn(
			name = "genre_id", 
			nullable = false, 
	foreignKey = 
	@ForeignKey(
			name = "genre_fk", 
			value = ConstraintMode.CONSTRAINT))
	private Genre genre;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
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
		FilmeGenero other = (FilmeGenero) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
