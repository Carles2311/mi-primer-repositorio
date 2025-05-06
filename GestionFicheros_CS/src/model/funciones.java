/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author carlessalfor
 */
public class funciones {
    
   public static void createFolder( String carpeta){
        File file = new File("src\\folders\\" + carpeta);
        file.mkdirs();
    }
   
   public static void createFile(String folder, String name, String content){
    try{
        File file = new File("src\\folders" + folder + name);
        FileWriter fr = new FileWriter(file,true);
        BufferedWriter bw = new BufferedWriter(fr);
        bw.write(content);
        bw.flush();
        }    
    catch(IOException ex){
            System.out.println(ex.toString());
        }
   
   }
   
   public static String[] showListFiles(String folder){
       File file = new File("src\\folders" + folder);
       File[] archivos = file.listFiles();
       String[] names = null;
       if(archivos != null){
           names = new String[archivos.length];
           int contador = 0;
        for(File archivo : archivos){            
            names[contador] = archivo.getName();
            contador++;
            
        }
       }else{
           System.out.println("No se han encontrado archivos en ese directorio");
       }
       return names;
   }
   
   public static void countChars(String folder, String name){
       try{
       File file = new File("src\\folders" + folder + name);
       Scanner scan = new Scanner(file);
       scan.useDelimiter("\n");
       String contenido = scan.next();
       System.out.println("Chars: " + contenido.length());
       }
       catch(FileNotFoundException e){
           System.out.println(e.toString());
       }
   }
   public static void countWords(String folder, String name){
       try{
       File file = new File("src\\folders" + folder + name);
       Scanner scan = new Scanner(file);
       int contador = 0;
       String palabra = "";
       while(scan.hasNext()){
            palabra = scan.next();
            System.out.println(palabra);
            contador++;
        }
       System.out.println("words: " + contador);
       }
       catch(FileNotFoundException e){
           System.out.println(e.toString());
       }
   }
}
