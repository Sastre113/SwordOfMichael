/**
 * 
 */
package Sword.Of.Michael.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import Sword.Of.Michael.model.dto.RespuestaDTO;
import Sword.Of.Michael.service.FileSystemRepository;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 1:10:30 - 20/12/2022
 *
 */
@RestController
@RequestMapping("/img")
public class ImgController {

	@Autowired
	FileSystemRepository fsRepository;
	
	@PostMapping(path = "/insertar")
	public ResponseEntity<RespuestaDTO> insertarImg(MultipartFile img){
		System.out.println("insertarImg");
		try {
			fsRepository.save(img.getBytes(), img.getName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ResponseEntity.ok().build();
	}
}
