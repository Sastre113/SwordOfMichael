/**
 * 
 */
package Sword.Of.Michael.service.profesor;

import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import Sword.Of.Michael.model.dto.profesor.ProfesorDTO;
import Sword.Of.Michael.model.dto.profesor.peticion.PeticionInsertarProfesorDTO;
import Sword.Of.Michael.model.entity.TbProfesor;
import Sword.Of.Michael.repository.IProfesorRepository;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 0:51:23 - 06/10/2022
 *
 */
@Service("profesorService")
public class ProfesorService implements IProfesorService {

	private IProfesorRepository profesorRepository;
	
	public ProfesorService(IProfesorRepository profesorRepository) {
		this.profesorRepository = profesorRepository;
	}

	@Override
	public ProfesorDTO insertar(PeticionInsertarProfesorDTO profesorDTO) {	
		TbProfesor profesorEntity = this.mapDtoToEntity(profesorDTO);
		this.profesorRepository.save(profesorEntity);
		
		return this.mapEntityToProfesorDTO(profesorEntity);
	}

	@Override
	public Optional<ProfesorDTO> obtener(String idProfesor) {
		// TODO Auto-generated method stub
		if(!"11223344H".equals(idProfesor)) {
			throw new NoSuchElementException("No se ha encontrado el profesor");
		}
		
		ProfesorDTO profesorDTO = this.mapEntityToProfesorDTO(null);
		
		return Optional.of(profesorDTO);
	}
	
	
	private TbProfesor mapDtoToEntity(PeticionInsertarProfesorDTO profesorDTO) {
		TbProfesor profesorEntity = new TbProfesor();
		
		profesorEntity.setId(UUID.randomUUID().toString());
		profesorEntity.setFechaalta(new Date());
		profesorEntity.setNif(profesorDTO.getNif());
		profesorEntity.setFechanacimiento(profesorDTO.getFechaNacimiento());
		profesorEntity.setNombre(profesorDTO.getNombre());
		profesorEntity.setPrimerapellido(profesorDTO.getPrimerApellido());
		profesorEntity.setSegundoapellido(profesorDTO.getSegundoApellido());
		
		return profesorEntity;
	}
	
	private ProfesorDTO mapEntityToProfesorDTO(TbProfesor profesorEntity) {
		ProfesorDTO profesorDTO = new ProfesorDTO();
		
		if(profesorEntity == null) {
			profesorDTO.setIdProfesor(UUID.randomUUID().toString());
			profesorDTO.setNif("11223344H");
			profesorDTO.setNombre("Pepe");
			profesorDTO.setPrimerApellido("Villuela");
			profesorDTO.setFechaAlta(new Date());
			profesorDTO.setFechaNacimiento(new Date());
		} 
		
		profesorDTO.setIdProfesor(profesorEntity.getId());
		profesorDTO.setNif(profesorEntity.getNif());
		profesorDTO.setNombre(profesorEntity.getNombre());
		profesorDTO.setPrimerApellido(profesorEntity.getPrimerapellido());
		profesorDTO.setSegundoApellido(profesorEntity.getSegundoapellido());
		profesorDTO.setFechaNacimiento(profesorEntity.getFechanacimiento());
		profesorDTO.setFechaAlta(profesorEntity.getFechaalta());
		profesorDTO.setFechaBaja(profesorEntity.getFechabaja());
		
		return profesorDTO;
	}
}
