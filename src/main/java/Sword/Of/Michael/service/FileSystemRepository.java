/**
 * 
 */
package Sword.Of.Michael.service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Repository;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 1:13:02 - 20/12/2022
 *
 */

@Repository
public class FileSystemRepository {

	private final String RESOURCES_DIR = "src\\main\\resources\\img\\";
	
	public String save(byte[] content, String imageName) throws Exception {
        Path newFile = Paths.get(RESOURCES_DIR + imageName + ".png");
        Files.createDirectories(newFile.getParent());

        Files.write(newFile, content);

        System.out.println(newFile.toAbsolutePath().toString());
        return newFile.toAbsolutePath().toString();
    }

}
