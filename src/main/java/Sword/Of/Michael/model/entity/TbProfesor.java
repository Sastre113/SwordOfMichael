package Sword.Of.Michael.model.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

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
 * The persistent class for the "TB_PROFESOR" database table.
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
	private Date fechaalta;

	private Timestamp fechabaja;

	@Temporal(TemporalType.DATE)
	private Date fechanacimiento;

	private String nif;

	private String nombre;

	private String primerapellido;

	private String segundoapellido;

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

	public Date getFechaalta() {
		return this.fechaalta;
	}

	public void setFechaalta(Date fechaalta) {
		this.fechaalta = fechaalta;
	}

	public Timestamp getFechabaja() {
		return this.fechabaja;
	}

	public void setFechabaja(Timestamp fechabaja) {
		this.fechabaja = fechabaja;
	}

	public Date getFechanacimiento() {
		return this.fechanacimiento;
	}

	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
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

	public String getPrimerapellido() {
		return this.primerapellido;
	}

	public void setPrimerapellido(String primerapellido) {
		this.primerapellido = primerapellido;
	}

	public String getSegundoapellido() {
		return this.segundoapellido;
	}

	public void setSegundoapellido(String segundoapellido) {
		this.segundoapellido = segundoapellido;
	}

	public List<TbAsignatura> getTbAsignaturas() {
		return this.tbAsignaturas;
	}

	public void setTbAsignaturas(List<TbAsignatura> tbAsignaturas) {
		this.tbAsignaturas = tbAsignaturas;
	}

}