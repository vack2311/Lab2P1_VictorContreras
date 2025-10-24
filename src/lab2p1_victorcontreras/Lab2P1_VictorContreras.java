/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_victorcontreras;
 import java.util.Scanner;

public class Lab2P1_VictorContreras {
public static Scanner leer = new Scanner (System.in);
    public static void main(String[] args) {
        //Menu
        int op = 0;
        do{
        System.out.println("----Bienvenido-----");
        System.out.println("1. Triangulos Geometricos ");
        System.out.println("2. Sumatoria ");
        System.out.println("3. Cinecito");
        System.out.println("0.  Salir");
        op = leer.nextInt();
        if (op == 1) {
            System.out.println("Ingresa los lados y los angulos de tu triangulo");
            System.out.println(" Lado 1: ");
            int lado1 = leer.nextInt();
            System.out.println(" Lado 2: ");
            int lado2 = leer.nextInt();
            System.out.println(" Lado 3: ");
            int lado3 = leer.nextInt();
            
            System.out.println(" Ahora ingresa los angulos ");
            System.out.println(" Angulo 1");
            int angulo1 = leer.nextInt();
            System.out.println(" Angulo 2");
            int angulo2 = leer.nextInt();
            System.out.println(" Angulo 3");
            int angulo3 = leer.nextInt();
            
            if (lado1 + lado2 < lado3 || lado2 + lado3 < lado1 || lado1 + lado3 < lado2 ) {
                System.out.println("Triangulo invalido");
            }else{
                System.out.println(" Triangulo valido");
            }
            
            if (lado1==lado2 && lado1 == lado3 && lado3 == lado2) {
                System.out.println(" Triangulo Equilatero");
            } else if(lado1 != lado2 && lado3 != lado2 && lado3 !=lado1){
                System.out.println("Triangulo Escaleno");
            }else{
                System.out.println("Triangulo Isosceles ");
            }
            
            if (angulo1 > 90 && angulo2 > 90 && angulo3 > 90) {
                System.out.println("Triangulo acutangulo");
            }else if(angulo1 == 30 && angulo2 == 60  && angulo3 == 90 || angulo1 == 90 && angulo2 == 30  && angulo3 == 60 || angulo1 == 60 && angulo2 == 90  && angulo3 == 30){
                System.out.println("Triangulo rectangulo");
            }else{
                System.out.println(" Triangulo Obtusangulo");
            }
        
            
            }
            if (op == 2) {
                System.out.println(" Sumatoria");
                System.out.println("Ingresa un numero entero: ");
                double k = leer.nextInt();
                double n = 1;
                double funcion = 0;
                
                while(n <= k){
                    double variable = (n/(n+1));
                    funcion += Math.pow(variable,n) * n;  
                    n++;
                }
                System.out.println(funcion);
            }
            if (op == 3) {
                System.out.println("---Bienvenido al cine---");
                System.out.println(" Ingrese cuantas personas vienen: ");
                int personas = leer.nextInt();
                System.out.println(
                        "CÓDIGO     CATEGORIA PELÍCULAS INCLUIDAS                      PRECIO X PERSONA\n" +
                        "1          Infantil Cenicienta, Enredados, Bella y la Bestia  L. 500.00\n" +
                        "2          Comedia  Son como niños 1 y 2                      L. 360.00\n" +
                        "3          Terror   El Conjuro, La Monja, Guerra Z            L. 600.00\n" +
                        "4          Anime    AOT, KNY                                  L. 560.00");
                System.out.println("Ingrese el codigo: ");
                int codigo = leer.nextInt();
                System.out.println(" Cantidad de personas que quieren agrandar las palomitas");
                int palomitas = leer.nextInt();
                System.out.println(" Desea ver la funcion en formato 3D (1/0)");
                int funcion = leer.nextInt();
                //Precio
                int precio = 0;
                int totalpalo = 0;
                int totalfun = 0;
                double descuento = 0;
                
                if ( codigo == 1) {
                    precio = 500;
                }else if(codigo == 2){
                    precio = 360;
                }else if (codigo ==3) {
                    precio = 600;
                }else if (codigo == 4) {
                    precio = 560;
                }
                // Extras
                if (palomitas > personas && personas > 0) {
                    System.out.println("no valido");
                }else{
                     totalpalo = palomitas * 100;
                }
                if (funcion == 1) {
                    totalfun = 120 * personas;
                }
                // descuento
                if(codigo == 1 || codigo == 3){
                     descuento = 0.25;
                }else if (codigo == 2 || codigo == 4) {
                     descuento = 0.15;
                }
                
                int subtotal = personas * precio;
                System.out.println("Subtotal Base :"+ subtotal);
                System.out.println("Recargo por palomitas: "+ totalpalo);
                System.out.println("Recargo por sala 3D:"+ totalfun);
                int totaldescuento = (int) (subtotal * descuento);
                int totalpagar = subtotal + totalpalo + totalfun - totaldescuento;
                System.out.println("Total a pagar  " + totalpagar);
                }
        }while(op != 0);
    }
}
        
        
        
    


