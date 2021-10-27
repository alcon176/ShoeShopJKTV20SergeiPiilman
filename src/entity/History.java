/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;



public class History implements Serializable{
    private Shoe shoe;
    private Custumer custumer;
    private int shoeSale;
    private int shopincome;
    
    public History() {
    }
        public Shoe getShoe() {
        return shoe;
    }

    public void setShoe(Shoe shoe) {
        this.shoe = shoe;
    }
    
        public Custumer getCustumer() {
        return custumer;
    }

    public void setCustumer(Custumer custumer) {
        this.custumer = custumer;
    }
    
        public int getShoeSale() {
        return shoeSale;
    }

    public void setShoeSale(int shoeSale) {
        this.shoeSale = shoeSale;
    }
    
            public int getShopincome() {
        return shopincome;
    }

    public void setShopincome(int shopincome) {
        this.shopincome = shopincome;
    }
    
       @Override
    public String toString() {
        return "History{" 
                + "\nshoe=" + shoe.toString()
                + ",\n custumer=" + custumer.toString()
                + ",\n shoeSale=" + shoeSale
                + ",\n shopincome=" + shopincome 
                + "\n}";
}
}