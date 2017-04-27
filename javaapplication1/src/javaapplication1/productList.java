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
public class productList {
    private Product[] list = new Product[20];
    private int SZ = 0;
    public productList() {
        for (int i = 0; i < SZ; i++)
            list[i].reset();
        
        SZ = 0;
    }
    public void addProduct(Product p) {
        //list[SZ] = p;
        String str = p.getName();
        int cnt = p.getPrice();
        list[SZ] = new Product(str, cnt);
        /*
        list[SZ].setName(str);
        list[SZ].setPrice(cnt);*/
        SZ++;
    }
    
    public int getSize() {
        return SZ;
    }
    
    public Product getProductById(int id) {
        return list[id - 1];
    }
    
    public void show() {
        int k = 0;
        for (int i = 0; i < SZ; i++) {
            if (k >= 3) {
                System.out.println();
                k = 0;
            } else {
                System.out.print("ID " + (i + 1) + " Name " + list[i].getName() + " Price " + list[i].getPrice() + "   | ");
                k++;
            }
        }
    }
}
