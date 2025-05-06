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
   
   public static String showFile(String folder, String name){
        String contenido = "";
       try{
       File file = new File("src\\folders" + folder + name);
       Scanner scan = new Scanner(file);
       scan.useDelimiter("\n");
       contenido = scan.next();
        
        }
        catch(FileNotFoundException e){
            System.out.println(e.toString());
       }
 
    return contenido;
        
   }
   
    public static boolean overWriteFile(String folder, String name, String content) {
        File file = new File("src\\folders" + folder + name);

        if (!file.exists()) {
            return false;
        } else {
            try {

                FileWriter fr = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fr);
                bw.write(content);
                bw.flush();
            } catch (IOException ex) {
                System.out.println(ex.toString());
            }
            return true;
        }

    }
   
   public static void deleteFile(String folder, String name){
       File file = new File("src\\folders" + folder + name);
       file.delete();
   }
   
   public static int countChars(String folder, String name){
       String contenido = "";
       try{
       File file = new File("src\\folders" + folder + name);
       Scanner scan = new Scanner(file);
       scan.useDelimiter("\n");
       contenido = scan.next();
       
       }
       catch(FileNotFoundException e){
           System.out.println(e.toString());
       }
       return contenido.length();
   }
   public static int countWords(String folder, String name){
       int contador = 0;
       try{
       File file = new File("src\\folders" + folder + name);
       Scanner scan = new Scanner(file);
       
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
       return contador;
   }
}
