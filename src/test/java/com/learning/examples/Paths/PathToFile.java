package com.learning.examples.Paths;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.testng.annotations.Test;

public class PathToFile {

	@Test
	  public void givenPathString_whenCreatesPathObject_thenCorrect() {
	     
		
		 
		  Path p = Paths.get("C:\\QA\\RestAssured\\RestAPI\\interview"); 
		 File f = p.toFile();
		 
		 
		 System.out.println(f.isDirectory());
	      assertEquals(f.isDirectory(),true);
	      
	  }

}
