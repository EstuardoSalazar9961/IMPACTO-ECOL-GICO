/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculoimpactoecologico;

import java.util.ArrayList;

/**
 *
 * @author CompuStore
 */
public class CalculoImpactoEcologico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Crear objetos de cada clase
        Edificio edificio = new Edificio("Edificio Dorado", 2000);
        Auto auto = new Auto("Mazda BT-50", 7);
        Bicicleta bicicleta = new Bicicleta("Montañera");

        // Crear ArrayList para almacenar objetos que implementan ImpactoEcologico
        ArrayList<ImpactoEcologico> listaImpacto = new ArrayList<>();
        listaImpacto.add(edificio);
        listaImpacto.add(auto);
        listaImpacto.add(bicicleta);

        // Iterar a través de la lista e imprimir el impacto ecológico
        for (ImpactoEcologico impacto : listaImpacto) {
            System.out.println(impacto.getIdentificacion());
            System.out.println("Impacto ecológico: " + impacto.obtenerImpactoEcologico());
            System.out.println("------------------------");
        }

    }
}
    
