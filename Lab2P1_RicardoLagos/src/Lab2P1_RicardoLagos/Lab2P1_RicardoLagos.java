
package Lab2P1_RicardoLagos;

import java.util.Scanner;

public class Lab2P1_RicardoLagos {
    public static void main(String[] args) {
        int opcion;
        Scanner leer = new Scanner (System.in);
        System.out.println("1.Saber si es triangulo");
        System.out.println("2.Area de figuras");
        System.out.println("3.Evaluando numeros");
        System.out.println("Ingrese una opcion: ");
        opcion=leer.nextInt();
        while(opcion<=3&&opcion>0){
        
         if(opcion==1){
            int anguloA, anguloB, anguloC;
            int sumaAB, sumaAC, sumaBC;
            System.out.println("Ingrese un lado del triangulo: ");
            anguloA=leer.nextInt();
            System.out.println("Ingrese el otro lado del triangulo: ");
            anguloB=leer.nextInt();
            System.out.println("Ingrese el ultimo lado del triangulo: ");
            anguloC=leer.nextInt();
            sumaAB=anguloA+anguloB;
            if(anguloA<0||anguloB<0||anguloC<0){
                 System.out.println("No se pueden ingresar longitudes negativas");
            }
                else{
                     if(sumaAB>anguloC){
                         System.out.println("¡Las longitudes ingresadas forman un triangulo!");
                     } else{
                            if(sumaAB<anguloC){
                                System.out.println("Las longitudes ingresadas no forman un triangulo D:"); 
                            }
                            else{
                                    if(sumaAB==anguloC){
                                        System.out.println("Las longitudes ingresadas no forman un triangulo doggie D:");
                                    }
                            }
                     }
                }
         }//fin opcion 1
         
         if(opcion==2){
             char resp='s';
             while(resp=='s'||resp=='S'){
             int base, altura, radio;
             int figura;
             double rectangulo, triangulo, circulo;
             System.out.println("1.Rectangulo");
             System.out.println("2.Triangulo");
             System.out.println("3.Circulo");
             System.out.println("Ingrese el tipo de figura que desea calcular el area[1,2,3]: ");
             figura=leer.nextInt();
             if(figura==1){
                 System.out.println("Ingrese la base del rectangulo: ");
                 base=leer.nextInt();
                 System.out.println("Ahora ingrese la altura del rectangulo: ");
                 altura=leer.nextInt();
                 rectangulo=base*altura;
                 System.out.println("El area es "+rectangulo);
             }
             else{
                 if(figura==2){
                   System.out.println("Ingrese la base del triangulo: ");
                   base=leer.nextInt();
                   System.out.println("Ahora ingrese la altura del triangulo: ");
                   altura=leer.nextInt();
                   triangulo=0.5/base*altura;
                   System.out.println("El area es "+triangulo);  
                 }
                 else{
                     if(figura==3){
                       System.out.println("Ingrese el radio del circulo: ");
                       radio=leer.nextInt();
                       circulo=Math.PI*radio*radio;
                       System.out.println("El area es "+circulo);
                     }
                 }
             }
             System.out.println("Desea ingresar otro tipo de figura:[S/N]: ");
             resp=leer.next().charAt(0);
             }    
         }
         
         if(opcion==3){
             int num,div=0;
             int primo;
             System.out.println("Ingrese un numero: ");
             num=leer.nextInt();
             if(num%2==0&&div==2){
                 System.out.println("El numero es par y primo");
             }
             else{
                 if(num%2==1&&div==3){
                     System.out.println("El Numero es impar y primo");
                 }
                 else{
                     if(num%2==0){
                       System.out.println("El numero es par");
                     }
                     else{
                         if(num%2==1){
                            System.out.println("El Numero es impar");
                             
                     }
                 }
             }
         }
         }//fin opcion 3
        
        
        System.out.println("*********M E N U**********");
        System.out.println("1.Saber si es triangulo");
        System.out.println("2.Area de figuras");
        System.out.println("3.Evaluando numeros");
        System.out.println("Ingrese una opcion: ");
        opcion=leer.nextInt();
        }//fin del while
    }
    }
