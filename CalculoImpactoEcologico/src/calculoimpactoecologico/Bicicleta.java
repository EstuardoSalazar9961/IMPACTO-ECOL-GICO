/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculoimpactoecologico;

/**
 *
 * @author CompuStore
 */
public class Bicicleta extends ImpactoEcologico {
    private String tipo;

    public Bicicleta(String tipo) {
        this.tipo = tipo;
    }

    public double obtenerImpactoEcologico() {
        // Una bicicleta tiene impacto cero
        return 0;
    }

    public String getIdentificacion() {
        return "Bicicleta: " + tipo;
    }
}
