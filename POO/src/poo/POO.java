
package poo;

import models.People;

public class POO {

    public static void main(String[] args) {
        People pedro = new People();
        People juan = new People();
        
        pedro.setNombres("Pedrito");
        pedro.setApellidos("Pérez");
        
        juan.setNombres("Juanito");
        
        
        System.out.println(pedro.getNombres() + " " + pedro.speak());
        System.out.println(juan.getNombres() + " " + juan.walk());
    }
    
}
