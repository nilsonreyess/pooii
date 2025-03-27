
package models;

public class People {
    // Atributes
    private int id;
    private String document;
    private String fullname;
    private String email;
    private String smartphone;
    
    // Methods
    // Methods Getter and Setter
    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSmartphone() {
        return smartphone;
    }

    public void setSmartphone(String smartphone) {
        this.smartphone = smartphone;
    }
        
    // Methods personalized
    public String walk() {
        return "Estoy caminando";
    }
    
    public String speak() {
        return "Hola, ¿cómo estas?";
    }
    
}
