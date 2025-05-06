/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.validations;

import exceptions.NotName;

/**
 *
 * @author carlessalfor
 */
public class CheckName {
    private String name;
    
    public CheckName(String name) throws NotName{
        if(name.length() < 15){
        throw new NotName("El nombre es demasiado largo");
        }
        this.name = name;
    }
    
}
