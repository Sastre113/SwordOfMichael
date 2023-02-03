/**
 * 
 */
package Sword.Of.Michael.model.dto;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 0:49:20 - 06/10/2022
 *
 */
public class RespuestaDTO<T> {

	private String codigo;
	private String descripcion;
	private T resultado;
	
	public RespuestaDTO() {}
	
	public RespuestaDTO(T resultado) {
		this("OK", "Petición correcta", resultado);
	}
	
	public RespuestaDTO(String codigo, String descripcion) {
		this(codigo, descripcion, null);
	}
	
	public RespuestaDTO(String codigo, String descripcion, T resultado) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.resultado = resultado;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public T getResultado() {
		return resultado;
	}

	public void setResultado(T resultado) {
		this.resultado = resultado;
	}
}
