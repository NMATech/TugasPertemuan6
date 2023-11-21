/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NomerSatu;

/**
 *
 * @author LENOVO
 */
public class Alphabet {
    char huruf;
    
    public void getAlphabet(){
        for (huruf = 'Z'; huruf >= 'A'; huruf--){
            System.out.print(huruf + " ");
        }
    }   
}
