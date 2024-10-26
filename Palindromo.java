/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromo;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String entrada;
       
       do{
        System.out.println("Digite uma palavra, ou se preferir uma frase: ");
        entrada = sc.nextLine();
        
        if(Palindromo(entrada)){
            System.out.println("Essa palavra ou frase eh um palindromo!");
        } else {
            System.out.println("Essa palavra ou frase nao eh um palindromo!");
        }
       } while(!Palindromo(entrada));
        
        sc.close();
    
}
    
public static boolean Palindromo(String palavra){
    String palavraLimpa = palavra.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    
    String palavraInvertida = new StringBuilder(palavraLimpa).reverse().toString();
    
    return palavraLimpa.equals(palavraInvertida);
}

}
