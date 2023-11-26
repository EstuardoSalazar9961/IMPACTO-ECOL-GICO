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
public class Edificio extends ImpactoEcologico{
    private String nombre;
    private double consumoEnergetico; // En kilovatios por hora

    public Edificio(String nombre, double consumoEnergetico) {
        this.nombre = nombre;
        this.consumoEnergetico = consumoEnergetico;
    }

    public double obtenerImpactoEcologico() {
        // Supongamos un factor de conversión para el impacto ecológico de un edificio
        double factorConversion = 0.5;
        return consumoEnergetico * factorConversion;
    }

    public String getIdentificacion() {
        return "Edificio: " + nombre;
    }
}
