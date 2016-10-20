/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.p3;
import java.util.Scanner;
/**
 *
 * @author osiri
 */
public class PP2P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion
        int n;
        int r;
        //Procedimiento
        n = pedir();
        r = calcular(n);
        mostrar(r,n);
    }
    public static int pedir (){
        int n;
        Scanner teclado = new Scanner (System.in);
        System.out.println("*****   Factoriales   *****");
        System.out.println("Introduce un numero");
        n = teclado.nextInt();
        return n;
    }
    public static int calcular (int n){
        int r;
        r = 1;
        //El ciclo while multiplica el numero por todo lo que le compone
        while (n != 0){
            r = n * r;
            n--;
        }
        return r;
    }
    public static void mostrar(int r,int n){
        System.out.println("el factorial de "+n+" es "+r);
    }
}
