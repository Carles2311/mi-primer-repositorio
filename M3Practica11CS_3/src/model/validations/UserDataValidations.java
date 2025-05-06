/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.validations;
import exceptions.CantCheckId;
import exceptions.NotName;
import java.util.Scanner;
/**
 *
 * @author carlessalfor
 */
public class UserDataValidations {
    
    
    public static void checkId(int typeDoc, String id) throws CantCheckId{
        boolean idok = false;
        //Comprobar que la longitud del dni es la correcta
        CheckId checkid = new CheckId(typeDoc, id);
        
    }
    public static boolean checkFecha(String date){
        System.out.println(date);
        boolean stat = false;
        //separamos en distintas strings los contenidos de la fecha xx/xx/xx dejando de lado las barras
        String numRef = "" + date.charAt(0) + date.charAt(1);
        String numRef2 = "" + date.charAt(3) + date.charAt(4);
        String numRef3 = "" + date.charAt(6) + date.charAt(7);
        boolean continuacion = isNumeric(numRef);
        //Enviar los string y comprovarlos
        if (continuacion == true){      
            continuacion = isNumeric(numRef2);
            if (continuacion == true){               
                continuacion = isNumeric(numRef3);
                if (continuacion ==true){
                stat = true;
                }
                else if (continuacion == false){
                stat = false;
                }
            }
            else if (continuacion == false){
            stat = false;
            }
        }
        else if (continuacion == false){
        stat = false;
        }
        //Si el dia y el mes es mayor a 31 y 12 dara false
        if (stat == true){
            int num = Integer.parseInt(numRef);
            System.out.println(num);
            if(num <= 31){
                //System.out.println("Dia esta bien");
                stat = true;
            }
            else{
             stat = false;
                System.out.println("El dia es incorrecto");
            }
            int num2 = Integer.parseInt(numRef2);
            System.out.println(num);
            if(num2 <= 12){
                //System.out.println("Mes esta bien");
                if(stat == false){
                    stat = false;
                }
                else{
                stat = true;
                }
            }
            else{
             stat = false;
                System.out.println("El mes es incorrecto");
            }
        }
         return stat;
    }
    public static int calculadoraFecha(String fecha){
        //calculo que la fecha este bien
        boolean stat = checkFecha(fecha);
        int año = 25;
        int resultado = -1;
        if(stat == true){
            //separacion del año de la fecha de nacimiento y calculos
            String numRef = "" + fecha.charAt(6) + fecha.charAt(7);
            int num = Integer.parseInt(numRef);
            resultado = año - num;
        }
        
        return resultado;
    }
    public static boolean checkPostalCode( String codigo){
        boolean stat = false;
        //si el string contiene los 5 caracteres que tiene el codigo postal comprueba que sea un numero
        if (codigo.length() == 5){
            stat = isNumeric(codigo);
        }
    return stat;
    }
    public static boolean isNumeric(String numRef){
        boolean stat = false;
        
            if (numRef.matches("\\d+")){
            stat = true;
            }
        
            return stat;
    }
    public static boolean isAlphabetic( String texto){       
            boolean stat = true;
            for (int i = 0; i < texto.length(); i++) {
                if (!Character.isLetter(texto.charAt(i))) {
                    stat = false;
                }
        }
            return stat;
    }
    
    public static void checkName(String name) throws NotName{
        CheckName checkname = new CheckName(name);
        
    }
}
