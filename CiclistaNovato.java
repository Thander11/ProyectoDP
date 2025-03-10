
/**
 * Subclase de ciclista
 * 
 * @author Alexeido, Thander y Natera
 * @version 1,0
 */

import java.io.*;
import java.io.IOException;
import java.nio.*;

public class CiclistaNovato extends Ciclista {
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class CiclistaNovato
     */

    public CiclistaNovato(String nombre, CiclistaHabilidad habilidad, double energia, Equipo team) {
        // initialise instance variables
        super(nombre, habilidad, energia, team);
        super.setDestreza(((getHabilidad() + 2) / 120) * 10);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param y a sample parameter for a method
     * @return the sum of x and y
     */

    /*
     * Muestra el ciclista sin su bicicleta llamando al super
     */
    @Override
    public void mostrarSinBici(BufferedWriter ficheroOut) {
        try {
            System.out.print("<CiclistaNovato: ");
            ficheroOut.write("<CiclistaNovato: ");
            super.mostrarSinBici(ficheroOut);
            System.out.println();
            ficheroOut.write('\n');
        } catch (IOException e) {
            System.err.println("There was a problem writing to ");
        }

    }

    // toString de la subclase CiclistaNovato
    @Override
    public String toString() {
        return "<CiclistaNovato: " + super.getNombre() + " energia: " + String.format("%.2f", super.getEnergia())
                + super.getCiclistaHabilidad()
                + " tiempo total: " + String.format("%.2f", super.getTotalTime()) + super.getBicicleta();
    }
}
