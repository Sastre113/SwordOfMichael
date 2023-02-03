/**
 * 
 */
package Sword.Of.Michael.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Sword.Of.Michael.model.dto.RespuestaDTO;
import Sword.Of.Michael.model.dto.profesor.ProfesorDTO;
import Sword.Of.Michael.model.dto.profesor.peticion.PeticionInsertarProfesorDTO;
import Sword.Of.Michael.service.profesor.IProfesorService;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 0:35:39 - 06/10/2022
 */

@RestController
@RequestMapping(value = "/profesor")
public class ProfesorController extends BaseController {

	private IProfesorService profesorService;

	public ProfesorController(IProfesorService profesorService) {
		super();
		this.profesorService = profesorService;	
	}
	
	@PostMapping(path = "/insertar")
	public ResponseEntity<RespuestaDTO<ProfesorDTO>> insertarProfesor(@RequestBody PeticionInsertarProfesorDTO peticionDTO) {
		ProfesorDTO profesor = this.profesorService.insertar(peticionDTO);
		RespuestaDTO<ProfesorDTO> respuesta = new RespuestaDTO<>(profesor);
		return ResponseEntity.ok(respuesta);
	}
	
	@GetMapping(value = "/obtener/")
	public ResponseEntity<RespuestaDTO<ProfesorDTO>> obtenerProfesor(@RequestParam String idProfesor){
		try {
			ProfesorDTO profesor = this.profesorService.obtener(idProfesor).orElseThrow();			
			return ResponseEntity.ok(super.generarRespuestaService(profesor));
		} catch (Exception e) {
			return super.generarRespuestaService(e);
		}
	}
}
