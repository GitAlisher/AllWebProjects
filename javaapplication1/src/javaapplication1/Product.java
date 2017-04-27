/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Alisher
 */
public class Product {
    private String Name;
    private int price;
    
    public Product(String nm, int pr) {
        Name = nm;
        price = pr;
    }
    
    public String getName() {
        return Name;
    }
    
    public int getPrice() {
        return price;
    }
    public void setName(String str) {
        Name = str;
    }
    
    public void setPrice(int cnt) {
        price = cnt;
    }
    public void reset() {
        Name = "";
        price = 0;
    }
}
