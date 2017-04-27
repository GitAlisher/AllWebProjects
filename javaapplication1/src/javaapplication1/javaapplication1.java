/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author 19539
 */
public class javaapplication1{

    /**
     * @param args the command line arguments
     */
    
    
    
    
    
    public static void main(String[] args){
        // TODO code application logic here
        Product p = new Product("Cola", 250);
        productList pl = new productList();
        Money m = new Money();
        
        pl.addProduct(p);
        p.setName("Pepsi");
        p.setPrice(280);
        pl.addProduct(p);
        p.setName("Chocolate");
        p.setPrice(440);
        pl.addProduct(p);
        p.setName("Nestea");
        p.setPrice(340);
        pl.addProduct(p);
        p.setName("Chocopie");
        p.setPrice(1040);
        pl.addProduct(p);
        p.setName("Mersi");
        p.setPrice(1440);
        pl.addProduct(p);
        p.setName("Asu");
        p.setPrice(240);
        pl.addProduct(p);
        pl.show();
        System.out.println();
        System.out.println("Choose Product By ID ");
        
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        
        p = pl.getProductById(id);
        
        System.out.println("You have to pay $" + p.getPrice());
        
        System.out.println("Pay use Coin nominal{5, 10, 20, 50, 100} and Cash nominal {200, 500, 1000, 2000, 5000, 10000} ");
        
        while(sc.hasNextInt()) {
            m.addMoney(sc.nextInt());
        }
        if (m.getTotal() >= p.getPrice()) {
             System.out.println("Thank you for buying Product " + p.getName() + ", your change is $" + m.getChange(p.getPrice()) + ". Please come again!");
        } else {
            System.out.println("Please insert another " + "$" + (-1 * m.getChange(p.getPrice())));
            
            while(sc.hasNextInt()) {
                m.addMoney(sc.nextInt());
            }
        }
        
        /*Product p = new Product();
        Money m;
        int size = p.getAmount();
        System.out.println("Choose a product below ");
        
        for (int i = 0; i < size; i++) {
            System.out.println("Name of product " + p.getProduct(i) + " Price of Product " + p.getPrice(i));
        }
        Scanner in;*/
    }
    
}