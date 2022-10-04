package Sword.Of.Michael.model.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;


/**
 * The persistent class for the tb_asignatura database table.
 * 
 */
@Entity
@Table(name="tb_asignatura")
@NamedQuery(name="TbAsignatura.findAll", query="SELECT t FROM TbAsignatura t")
public class TbAsignatura implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String descripcion;

	private String nombre;

	//bi-directional many-to-many association to TbProfesor
	@ManyToMany(mappedBy="tbAsignaturas")
	private List<TbProfesor> tbProfesors;

	public TbAsignatura() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<TbProfesor> getTbProfesors() {
		return this.tbProfesors;
	}

	public void setTbProfesors(List<TbProfesor> tbProfesors) {
		this.tbProfesors = tbProfesors;
	}

}