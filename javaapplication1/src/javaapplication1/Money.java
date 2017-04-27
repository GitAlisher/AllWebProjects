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
public class Money {
    
    private int[] coinType = {5, 10, 20, 50, 100};
    private int[] coin = new int[5];
    private int[] cashType = {200, 500, 1000, 2000, 5000, 10000};
    private int[] cash = new int[6];
    private int total = 0;
    
    public Money() {
        for (int i = 0; i < 5; i++) {
            coin[i] = 0;
        }
        for (int i = 0; i < 6; i++) {
            cash[i] = 0;
        }
        total = 0;
    }
    
    public void addMoney(int cnt) {
        if (cnt < 200) {
            boolean flag = false;
            
            for (int i = 0; i < 5; i++) {
                if (cnt == coinType[i]) {
                    coin[i]++;
                    total += cnt;
                    flag = true;
                    break;
                }
            }
            
            if (!flag) {
                System.out.println("Incorrect type of Money !!! ");
                return;
            }
        } else {
            boolean flag = false;
            
            for (int i = 0; i < 5; i++) {
                if (cnt == cashType[i]) {
                    cash[i]++;
                    total += cnt;
                    flag = true;
                    break;
                }
            }
            
            if (!flag) {
                System.out.println("Incorrect type of Money !!! ");
                return;
            }
        }
    }
    
    public int getTotal() {
        return total;
    }   
    
    public int getChange(int price) {
        return total - price;
    }
}
