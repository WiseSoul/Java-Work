/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptiontest;

import java.io.Serializable;

/**
 *
 * @author Silviu Patras
 */
public class Car implements Serializable {
    String manufacturer;
    String model;
    String hp;
    
    Car(String manufacturer, String model, String hp) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Masina " + manufacturer + " modelul " + model + " cu " + hp + " cai putere!";
    }
}
