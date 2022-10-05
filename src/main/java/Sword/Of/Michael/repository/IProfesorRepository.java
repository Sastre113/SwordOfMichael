/**
 * 
 */
package Sword.Of.Michael.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Sword.Of.Michael.model.entity.TbProfesor;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 1:03:56 - 06/10/2022
 *
 */
public interface IProfesorRepository extends JpaRepository<TbProfesor, String> {

}
