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

                    break;
                case "5":

                    break;
                case "6":

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
        System.out.println("Vamos a crear un archivo:");
        System.out.print("Escribe el nombre del directorio del nuevo archivo: ");
        String folderName = entrada.next();
        folderName = "\\" + folderName ;
        System.out.println(folderName);
        String[] nombres = funciones.showListFiles(folderName);
        for(String nombre : nombres){
            System.out.println(nombre);
        }
    }
    public static void countChars(){
    System.out.print("Escribe el nombre del directorio del nuevo archivo: ");
        String folderName = entrada.next();
        folderName = "\\" + folderName ;
        System.out.println(folderName);
        System.out.print("Escribe el nombre del archivo: ");
        String fileName = entrada.next();
        fileName = "\\" + fileName + ".txt" ;
        System.out.println(fileName);
        funciones.countChars(folderName, fileName);
    }
    public static void countWords(){
    System.out.print("Escribe el nombre del directorio del nuevo archivo: ");
        String folderName = entrada.next();
        folderName = "\\" + folderName ;
        System.out.println(folderName);
        System.out.print("Escribe el nombre del archivo: ");
        String fileName = entrada.next();
        fileName = "\\" + fileName + ".txt" ;
        System.out.println(fileName);
        funciones.countWords(folderName, fileName);
    }
}
