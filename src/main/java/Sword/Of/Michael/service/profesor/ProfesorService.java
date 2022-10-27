/**
 * 
 */
package Sword.Of.Michael.service.profesor;

import org.springframework.stereotype.Service;

import Sword.Of.Michael.repository.IProfesorRepository;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 0:51:23 - 06/10/2022
 *
 */
@Service
public class ProfesorService implements IProfesorService<Object, Object> {

	private IProfesorRepository profesorRepository;
	
	public ProfesorService(IProfesorRepository profesorRepository) {
		this.profesorRepository = profesorRepository;
	}
	
	
	/*
	 * @Override public RespuestaDTO insertar(PeticionDTO peticion) { // TODO
	 * Auto-generated method stub
	 * 
	 * TbProfesor profesorEntity = new TbProfesor();
	 * profesorEntity.setId(UUID.randomUUID().toString());
	 * profesorEntity.setNif(peticion.getNif());
	 * profesorEntity.setNombre(peticion.getNombre());
	 * profesorEntity.setPrimerApellido(peticion.getPrimerApellido());
	 * profesorEntity.setSegundoApellido(peticion.getSegundoApellido());
	 * profesorEntity.setFechaAlta(new Date());
	 * 
	 * this.profesorRepository.save(profesorEntity);
	 * 
	 * return null; }
	 * 
	 * @Override public RespuestaDTO obtener(PeticionDTO peticion) { // TODO
	 * Auto-generated method stub return null; }
	 * 
	 * @Override public RespuestaDTO eliminar(PeticionDTO peticion) { // TODO
	 * Auto-generated method stub return null; }
	 * 
	 * @Override public RespuestaDTO modificar(PeticionDTO peticion) { // TODO
	 * Auto-generated method stub return null; }
	 */
}
