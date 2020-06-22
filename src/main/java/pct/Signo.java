/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;
/**
 *
 * @author cauadelgado
 */
public class Signo {
       public static void main(String[] args) {
        
    
//        declaraçao de variaveis 
        int dia, mes;
       
//        entrada
        Scanner entrada = new Scanner (System.in);
        
//        apresentação
        System.out.println("\n\t\t\t ---Descubra Seu Signo--- \n "); 
        
//        Entradas
        System.out.print("\n Informe o dia: \n");
        dia = entrada.nextInt();
        
        System.out.print("\n Informe o mês: \n");
        mes = entrada.nextInt();
        
        if ( dia > 31){
            System.out.println("\n\t --Data inválida-- \n");
        }
        
        else if ( (dia >= 21 && mes == 3) || (dia <= 19 && mes == 4) ){
            System.out.println("\n\t --Áries-- \n");
        }
         
         else if( (dia >= 20 && mes == 4) || (dia <= 20 && mes == 5) ){
             System.out.println("\n\t --Touro-- \n");
         }
         
         else if( (dia >= 21 && mes == 5) || (dia <= 21 && mes == 6) ){
             System.out.println("\n\t --Gêmeos-- \n");
         }
         
         else if( (dia >= 22 && mes == 6) || (dia <= 22 && mes == 7) ){
             System.out.println("\n\t --Câncer-- \n");
         }
         
         else if( (dia >= 23 && mes == 7) || (dia <= 22 && mes == 8) ){
             System.out.println("\n\t --Leão-- \n");
         }
           
         else if( (dia >= 23 && mes == 8) || (dia <= 22 && mes == 9) ){
             System.out.println("\n\t --Virgem-- \n");
         }
         
         else if( (dia >= 23 && mes == 9) || (dia <= 22 && mes == 10) ){
             System.out.println("\n\t --Libra-- \n");
         }
         
         else if( (dia >= 23 && mes == 10) || (dia <= 21 && mes == 11) ){
             System.out.println("\n\t --Escorpião-- \n");
         }
         
         else if( (dia >= 22 && mes == 11) || (dia <= 21 && mes == 12) ){
             System.out.println("\n\t --Sargitário-- \n");
         }
         
         else if( (dia >= 22 && mes == 12) || (dia <= 19 && mes == 1) ){
             System.out.println("\n\t --Capricórnio-- \n");
         }
         
         else if( (dia >= 20 && mes == 1) || (dia <= 18 && mes == 2) ){
             System.out.println("\n\t --Aquário-- \n");
         }
         
         else if( (dia >= 19 && mes == 2) || (dia <= 20 && mes == 3) ){
             System.out.println("\n\t --Peixes-- \n");
         }
         
         else {
           System.out.println("\n\t --Data inválida-- \n");
       }
         
    }
}
