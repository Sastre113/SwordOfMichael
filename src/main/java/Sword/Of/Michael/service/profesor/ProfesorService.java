/**
 * 
 */
package Sword.Of.Michael.service.profesor;

import java.util.Date;
import java.util.UUID;

import org.springframework.stereotype.Service;

import Sword.Of.Michael.model.dto.PeticionServiceDTO;
import Sword.Of.Michael.model.dto.RespuestaServiceDTO;
import Sword.Of.Michael.model.entity.TbProfesor;
import Sword.Of.Michael.repository.IProfesorRepository;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 0:51:23 - 06/10/2022
 *
 */
@Service
public class ProfesorService implements IProfesorService {

	private IProfesorRepository profesorRepository;
	
	public ProfesorService(IProfesorRepository profesorRepository) {
		this.profesorRepository = profesorRepository;
	}

	@Override
	public RespuestaServiceDTO insertar(PeticionServiceDTO peticion) {
		// TODO Auto-generated method stub
		
		TbProfesor profesorEntity = new TbProfesor();
		profesorEntity.setId(UUID.randomUUID().toString());
		profesorEntity.setNif(peticion.getNif());
		profesorEntity.setNombre(peticion.getNombre());
		profesorEntity.setPrimerApellido(peticion.getPrimerApellido());
		profesorEntity.setSegundoApellido(peticion.getSegundoApellido());
		profesorEntity.setFechaAlta(new Date());
		
		this.profesorRepository.save(profesorEntity);
		
		return IProfesorService.super.insertar(peticion);
	}

	@Override
	public RespuestaServiceDTO obtener(PeticionServiceDTO peticion) {
		// TODO Auto-generated method stub
		return IProfesorService.super.obtener(peticion);
	}

	@Override
	public RespuestaServiceDTO eliminar(PeticionServiceDTO peticion) {
		// TODO Auto-generated method stub
		return IProfesorService.super.eliminar(peticion);
	}

	@Override
	public RespuestaServiceDTO modificar(PeticionServiceDTO peticion) {
		// TODO Auto-generated method stub
		return IProfesorService.super.modificar(peticion);
	}

}
