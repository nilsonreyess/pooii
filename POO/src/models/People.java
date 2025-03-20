
package models;

public class People {
    // Atributes
    private int id;
    private int dni;
    private String nombres;
    private String apellidos;
    
    // Methods
    // Methods Getter and Setter
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    
    // Methods personalized
    public String walk() {
        return "Estoy caminando";
    }
    
    public String speak() {
        return "Hola, ¿cómo estas?";
    }
    
}
