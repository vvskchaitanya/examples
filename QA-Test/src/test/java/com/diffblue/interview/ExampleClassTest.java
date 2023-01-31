package com.diffblue.interview;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.ClassLoaderUtils;

public class ExampleClassTest{

    @Test
    public void testExampleClass() throws IOException{
        String filePath = ClassLoaderUtils.getDefaultClassLoader().getResource("ExampleClass.java").getPath();
        File testFile = new File(filePath);
        ExampleClass exampleClass = new ExampleClass(testFile);
        Assertions.assertEquals(70, exampleClass.getLinesOfCode().size());
        Assertions.assertNotNull(exampleClass.getFile());
    }

    @Test
    public void testExampleClassThrowsException(){
        File testFile = new File("InvalidFile.java");
        Assertions.assertThrows(IOException.class, ()->{
            new ExampleClass(testFile);
        });
        
    }

}