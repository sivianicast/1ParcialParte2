/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialtercerapartesegundoejercicio;

import entidades.Persona;
import javax.swing.JOptionPane;
import util.Utilidades;

/**
 *
 * @author Jherom Chacon
 */
public class PrimerParcialTerceraParteSegundoEjercicio  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Carlitos");
        persona.setSexo('M');
        int resultado = Utilidades.suma(1,1);
        int resultadoResta = Utilidades.resta(3,2);
        System.out.println("El nombre de la pesona es "+persona.getNombre()+" Sexo "+persona.getSexo());
        System.out.println("El resultado de la suma es "+resultado);
        System.out.println("El resultado de la resta es "+resultadoResta);
    }
}
