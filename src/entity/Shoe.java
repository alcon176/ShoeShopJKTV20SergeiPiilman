/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author pupil
 */
public class Shoe implements  Serializable{   
    String firma;
    String model;
    int size;
    int price;
    
    public Shoe() {
    }
    
    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }
    
    public String getModel() {
    return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
        public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
        @Override
    public String toString() {
        return "Shoe{" 
                + "\n firma=" + firma
                + ",\n  model=" + model 
                + ",\n size=" + size 
                + ",\n price=" + price 
                + '}';
    }
}
