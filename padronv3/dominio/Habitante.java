package dominio;
import comprobaciones.Comprobacion;
import presentacion.InterfazUsuario;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Habitante
{
    private String nombre;
    private String apellido1;
    private String apellido2;
    
    public Habitante(String nombre, String apellido1, String apellido2){
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }
    
    /*public void setNombre(String nombreHabitante){
        this.nombre = nombreHabitante;
    }
    
    public void setApellido1(String apellido1Habitante){
        this.apellido1 = apellido1Habitante;
    }
    
    public void setApellido2(String apellido2Habitante){
        this.apellido2 = apellido2Habitante;
    }*/
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido1(){
        return apellido1;
    }
    
    public String getApellido2(){
        return apellido2;
    }
}
