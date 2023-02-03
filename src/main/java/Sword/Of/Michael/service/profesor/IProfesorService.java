/**
 * 
 */
package Sword.Of.Michael.service.profesor;

import java.util.Optional;

import Sword.Of.Michael.model.dto.profesor.ProfesorDTO;
import Sword.Of.Michael.model.dto.profesor.peticion.PeticionInsertarProfesorDTO;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 0:38:38 - 06/10/2022
 *
 */
public interface IProfesorService{

	public ProfesorDTO insertar(PeticionInsertarProfesorDTO profesorDTO);
	public Optional<ProfesorDTO> obtener(String idProfesor);
	
}
