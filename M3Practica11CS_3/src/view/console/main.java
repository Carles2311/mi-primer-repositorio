/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.console;
import exceptions.CantCheckId;
import java.util.Scanner;
import model.validations.UserDataValidations;
/**
 *
 * @author carlessalfor
 */
public class main {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        String option;
        do {
            System.out.println("Tester funciones UserDataValidations");
            System.out.println("1. test CheckID");
            System.out.println("2. test chackFormatDate");
            System.out.println("3. test CalculateAge");
            System.out.println("4. test CheckPostalCode");
            System.out.println("5. test isNumeric");
            System.out.println("6. test isAlphabetic");
            System.out.println("7. test CheckEmail");
            System.out.println("8. test CheckName");
            System.out.println("z. exit");
            System.out.print("Escoje alguna opción: ");
            option = entrada.next();
            switch (option) {
                case "1":
                    testCheckId();
                    break;
                case "2":
                    testCheckFormatDate();
                    break;
                case "3":
                    testCalculatorAge();
                    break;
                case "4":
                    testCheckPostalCode();
                    break;
                case "5":
                    testIsNumeric();
                    break;
                case "6":
                    testCheckIsAlphabetic();
                    break;
                case "7":
                    testCheckEmail();
                    break;
                case "8":
                    testCheckName();
                    break;
                case "z":
                    System.out.println("exit");
                    break;
                default:
                    System.out.println("Incorrect option");
            }
        } while (!option.equals("z"));
    }
    
    static void testCheckId(){
        System.out.println("Entra tu id");
        String nif = entrada.next();
        
        try{
            UserDataValidations.checkId(1, nif);
            System.out.println("the id is correct");
        }catch(CantCheckId err){
             System.out.println(err.getMessage());
        }
    }
    static void testCheckFormatDate(){
        String fecha = entrada.next();
        boolean fechaok = UserDataValidations.checkFecha(fecha);
        if (fechaok == true){
            System.out.println("esta bien");}
        else if (fechaok == false){
            //System.out.println("no esta bien");
        }
    }
    static void testCalculatorAge(){
        
    }
    static void testCheckPostalCode(){
        System.out.println("Entra el codigo postal");
        String codigo = entrada.next();
        boolean codok = UserDataValidations.checkPostalCode(codigo);
        if (codok == true){
            System.out.println("Codigo correcto");
        }
        else{
            System.out.println("Codigo mal");
        }
    }
    static void testIsNumeric(){
        System.out.println("Entra un numero:");
        String numero = entrada.next(); 
        boolean numok = UserDataValidations.isNumeric(numero);
        if (numok == true){
            System.out.println("si");
        }
        else{
            System.out.println("no");
        }     
    }
    static void testCheckIsAlphabetic(){
        System.out.println("Entra un numero:");
        String texto = entrada.next();
        boolean textok = UserDataValidations.isAlphabetic(texto);
        if(textok){
            System.out.println("si");}
        else{System.out.println("no");}
    }
    static void testCheckEmail(){
    
    }
    static void testCheckName(){
    
    }
}