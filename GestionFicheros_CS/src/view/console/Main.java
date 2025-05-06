/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.console;
import java.util.Scanner;
import model.funciones;
/**
 *
 * @author carlessalfor
 */
public class Main {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        String option;
        do {
            System.out.println("Tester funciones UserDataValidations");
            System.out.println("1. test createFolder");
            System.out.println("2. test createFile");
            System.out.println("3. test showListFiles");
            System.out.println("4. test showFile");
            System.out.println("5. test overWriteFile");
            System.out.println("6. test deleteFile");
            System.out.println("7. test countChars");
            System.out.println("8. test countWords");
            System.out.println("z. exit");
            System.out.print("Escoje alguna opción: ");
            option = entrada.next();
            switch (option) {
                case "1":
                   createFolder(); 
                    break;
                case "2":
                    createFile();
                    break;
                case "3":
                    showListFiles();
                    break;
                case "4":
                    showFile();
                    break;
                case "5":
                    overWriteFile();
                    break;
                case "6":
                    deleteFile();
                    break;
                case "7":
                    countChars();
                    break;
                case "8":
                    countWords();
                    break;
                case "z":
                    System.out.println("exit");
                    break;
                default:
                    System.out.println("Incorrect option");
            }
        } while (!option.equals("z"));
    }
    
    static void createFolder(){
        System.out.println("Vamos a crear una carpeta:");
        System.out.print("Escribe el nombre del directorio: ");
        String folderName = entrada.next();
        funciones.createFolder(folderName);
    }
    static void createFile(){
        System.out.println("Vamos a crear un archivo:");
        System.out.print("Escribe el nombre del directorio del nuevo archivo: ");
        String folderName = entrada.next();
        folderName = "\\" + folderName ;
        System.out.println(folderName);
        System.out.print("Escribe el nombre del archivo: ");
        String fileName = entrada.next();
        fileName = "\\" + fileName + ".txt" ;
        System.out.println(fileName);
        System.out.print("Escribe el contenido del archivo: ");
        entrada.useDelimiter("\n");
        String fileContent = entrada.next();
        funciones.createFile(folderName, fileName, fileContent);
        
    }
    static void showListFiles(){
        System.out.println("Vamos ver un listado de archivos:");
        System.out.print("Escribe el nombre del directorio: ");
        String folderName = entrada.next();
        folderName = "\\" + folderName ;
        System.out.println(folderName);
        String[] nombres = funciones.showListFiles(folderName);
        for(String nombre : nombres){
            System.out.println(nombre);
        }
    }
    static void showFile(){
        System.out.println("Vamos a mostrar un archivo:");
        System.out.print("Escribe el nombre del directorio del archivo: ");
        String folderName = entrada.next();
        folderName = "\\" + folderName ;
        System.out.println(folderName);
        System.out.print("Escribe el nombre del archivo: ");
        String fileName = entrada.next();
        fileName = "\\" + fileName + ".txt" ;
        System.out.println(fileName);
        System.out.println(funciones.showFile(folderName, fileName));    
    }
    
     static void overWriteFile(){
        System.out.println("Vamos a sobrescribir un archivo:");
        System.out.print("Escribe el nombre del directorio del archivo: ");
        String folderName = entrada.next();
        folderName = "\\" + folderName ;
        System.out.println(folderName);
        System.out.print("Escribe el nombre del archivo: ");
        String fileName = entrada.next();
        fileName = "\\" + fileName + ".txt" ;
        System.out.println(fileName);
        System.out.print("Escribe el contenido del archivo: ");
        entrada.useDelimiter("\n");
        String fileContent = entrada.next();
        boolean resultado = funciones.overWriteFile(folderName, fileName, fileContent);
        if(resultado == true){
            System.out.println("El archivo se sobrescribio correctamente");
        }else{
            System.out.println("Hubo un error o el archivo no existe");
        }
    }
    
     static void deleteFile(){
        System.out.println("Vamos a borrar un archivo:");
        System.out.print("Escribe el nombre del directorio del archivo: ");
        String folderName = entrada.next();
        folderName = "\\" + folderName ;
        System.out.println(folderName);
        System.out.print("Escribe el nombre del archivo: ");
        String fileName = entrada.next();
        fileName = "\\" + fileName + ".txt" ;
        System.out.println(fileName);
        funciones.deleteFile(folderName, fileName);
     }
    
     static void countChars(){
    System.out.print("Escribe el nombre del directorio: ");
        String folderName = entrada.next();
        folderName = "\\" + folderName ;
        System.out.println(folderName);
        System.out.print("Escribe el nombre del archivo: ");
        String fileName = entrada.next();
        fileName = "\\" + fileName + ".txt" ;
        System.out.println(fileName);
         System.out.println(funciones.countChars(folderName, fileName));
    }
     static void countWords(){
    System.out.print("Escribe el nombre del directorio: ");
        String folderName = entrada.next();
        folderName = "\\" + folderName ;
        System.out.println(folderName);
        System.out.print("Escribe el nombre del archivo: ");
        String fileName = entrada.next();
        fileName = "\\" + fileName + ".txt" ;
        System.out.println(fileName);
         System.out.println(funciones.countWords(folderName, fileName));
    }
}
