/*MITAUT
TDA
Addition d'entier
29/03/2024
*/
package calculator;

import java.util.Scanner;

/**
 *
 * @author Barnabé
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int operateur;
        double operande1, operande2;
        System.out.println("Please enter the operator");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
 
        Scanner sc = new Scanner(System.in);
        operateur = sc.nextInt();
        
        System.out.println("Entrer votre premier nombre : ");
        operande1 = sc.nextFloat();
        
        System.out.println("Entrez votre deuxième nombre : ");
        operande2 = sc.nextFloat();
        
        System.out.println("Résultat : ");
        if (operateur == 1); {
                System.out.println(operande1 + operande2);
    }
        if (operateur == 2); {
                System.out.println(operande1 - operande2);
                }
        if (operateur == 3); {
                System.out.println(operande1*operande2);
                }
        if (operateur == 4); {
                System.out.println(operande1/operande2);
                } 
        if (operateur == 5); {
                System.out.println(operande1%operande2);
                }
    }
        
    
        
    
    
    
    
}
