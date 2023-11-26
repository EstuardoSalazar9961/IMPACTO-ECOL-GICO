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
public class Auto extends ImpactoEcologico{
    private String modelo;
    private double emisionesCO2; // En toneladas métricas por año

    public Auto(String modelo, double emisionesCO2) {
        this.modelo = modelo;
        this.emisionesCO2 = emisionesCO2;
    }

    public double obtenerImpactoEcologico() {
        return emisionesCO2;
    }

    public String getIdentificacion() {
        return "Auto: " + modelo;
    }
}
