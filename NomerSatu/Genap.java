/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NomerSatu;

/**
 *
 * @author LENOVO
 */
public class Genap {
    private int total;
    
    public void getGenap(){
        for (int i = 0; i <= 20; i++){
            if(i % 2 == 0 && i != 0){
                System.out.print(i + " ");
                total += i;
            }
        }
        System.out.println("\ntotalnya adalah " + total);
    }
}
