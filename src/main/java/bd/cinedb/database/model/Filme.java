package bd.cinedb.database.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
	
	
	@OneToOne(targetEntity = Review.class)
	@JoinColumn(
			name = "review_id", 
			nullable = false, 
	foreignKey = 
	@ForeignKey(
			name = "review_fk", 
			value = ConstraintMode.CONSTRAINT))
	private Review review;
	
	@OneToOne(targetEntity = FilmeDiretor.class)
	@JoinColumn(
			name = "filme_diretor_id", 
			nullable = false, 
	foreignKey = 
	@ForeignKey(
			name = "filme_diretor_fk", 
			value = ConstraintMode.CONSTRAINT))
	private FilmeDiretor filmeDiretor;
	
	@OneToOne(targetEntity = FilmeActor.class)
	@JoinColumn(
			name = "filme_ator_id", 
			nullable = false, 
	foreignKey = 
	@ForeignKey(
			name = "filme_ator_fk", 
			value = ConstraintMode.CONSTRAINT))
	private FilmeActor filmeAtor;
	
	
	@OneToOne(targetEntity = FilmeGenero.class)
	@JoinColumn(
			name = "filme_genero_id", 
			nullable = false, 
	foreignKey = 
	@ForeignKey(
			name = "filme_genero_fk", 
			value = ConstraintMode.CONSTRAINT))
	private FilmeGenero filmeGenero;
	
	@OneToMany(targetEntity = Ticket.class, fetch = FetchType.EAGER)
	@JoinColumn(
			name = "ticket_id", 
			nullable = false, 
	foreignKey = 
	@ForeignKey(
			name = "ticket_fk", 
			value = ConstraintMode.CONSTRAINT))
	private List<Ticket> ticket;
	
	
	@OneToMany(targetEntity = Session.class)
	@JoinColumn(
			name = "session_id", 
			nullable = false, 
	foreignKey = 
	@ForeignKey(
			name = "session_fk", 
			value = ConstraintMode.CONSTRAINT))
	private List<Session> session;
	
	
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
	public Review getReview() {
		return review;
	}
	public void setReview(Review review) {
		this.review = review;
	}
	public FilmeDiretor getFilmeDiretor() {
		return filmeDiretor;
	}
	public void setFilmeDiretor(FilmeDiretor filmeDiretor) {
		this.filmeDiretor = filmeDiretor;
	}
	public FilmeActor getFilmeAtor() {
		return filmeAtor;
	}
	public void setFilmeAtor(FilmeActor filmeAtor) {
		this.filmeAtor = filmeAtor;
	}
	public FilmeGenero getFilmeGenero() {
		return filmeGenero;
	}
	public void setFilmeGenero(FilmeGenero filmeGenero) {
		this.filmeGenero = filmeGenero;
	}

	
	public List<Ticket> getTicket() {
		return ticket;
	}
	public void setTicket(List<Ticket> ticket) {
		this.ticket = ticket;
	}
	public List<Session> getSession() {
		return session;
	}
	public void setSession(List<Session> session) {
		this.session = session;
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
		Filme other = (Filme) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
