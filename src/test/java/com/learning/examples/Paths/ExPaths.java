package com.learning.examples.Paths;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.testng.annotations.Test;

public class ExPaths {
  @Test
  public void f() {
	  
	  String home = System.getProperty("user.home");
	  String home1 = System.getProperty("user.dir");
	  System.out.println("Home directory is "+home);
	  System.out.println("User directory is "+home1);
	  Path currentDir = Paths.get(".");
	  System.out.println(currentDir.toAbsolutePath());

  }
  
  //Creating the Path
  @Test
  public void givenPathString_whenCreatesPathObject_thenCorrect() {
      Path p = Paths.get("/articles/pxkumar");
      assertEquals("\\articles\\pxkumar", p.toString());
    
      
  }
}
