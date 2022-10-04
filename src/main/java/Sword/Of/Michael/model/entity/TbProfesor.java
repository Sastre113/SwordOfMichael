package Sword.Of.Michael.model.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


/**
 * The persistent class for the tb_profesor database table.
 * 
 */
@Entity
@Table(name="tb_profesor")
@NamedQuery(name="TbProfesor.findAll", query="SELECT t FROM TbProfesor t")
public class TbProfesor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_alta")
	private Date fechaAlta;

	@Column(name="fecha_baja")
	private Timestamp fechaBaja;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_nacimiento")
	private Date fechaNacimiento;

	private String nif;

	private String nombre;

	@Column(name="primer_apellido")
	private String primerApellido;

	@Column(name="segundo_apellido")
	private String segundoApellido;

	//bi-directional many-to-many association to TbAsignatura
	@ManyToMany
	@JoinTable(
		name="tb_profesor_asignatura"
		, joinColumns={
			@JoinColumn(name="id_profesor")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_asignatura")
			}
		)
	private List<TbAsignatura> tbAsignaturas;

	public TbProfesor() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getFechaAlta() {
		return this.fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Timestamp getFechaBaja() {
		return this.fechaBaja;
	}

	public void setFechaBaja(Timestamp fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNif() {
		return this.nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return this.primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return this.segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public List<TbAsignatura> getTbAsignaturas() {
		return this.tbAsignaturas;
	}

	public void setTbAsignaturas(List<TbAsignatura> tbAsignaturas) {
		this.tbAsignaturas = tbAsignaturas;
	}

}