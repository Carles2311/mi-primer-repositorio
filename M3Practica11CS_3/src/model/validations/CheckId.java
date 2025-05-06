/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.validations;
import exceptions.CantCheckId;
/**
 *
 * @author carlessalfor
 */
public class CheckId {
    private int typeDoc;
    private String id;
    
    
    public CheckId(int typeDoc, String id) throws CantCheckId{
        if(typeDoc == 0 || id.length() != 8){
            throw new CantCheckId("No se ha podido gestionar el documento a causa de que el ID es muy largo o el tipo de documento no esta permitido actualmente.");
        }
        this.typeDoc = typeDoc;
        this.id = id;
    }
    
}
