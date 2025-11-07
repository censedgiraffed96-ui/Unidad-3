//ARATH👍
package eva3_3_metodos;

import java.util.Scanner;

public class EVA3_3_METODOS {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int valor;
        do {
            imprimirMenu();
            valor= captu.nextInt();
            switch(valor){
                case 1:
                    System.out.println("**SUMAR DOS NUMEROS**");
                    realizarSuma();
                    break;
                case 2:
                    System.out.println("**CALCULAR POTENCIA**");
                    realizarPotencia();
                    break;
                case 3:
                    break;
            
            }
        }while(valor != 4);
        System.out.println("Saliste del sistema!!");
}
    
    //imprimir un menu
    public static void imprimirMenu(){
        System.out.println("Bienvenido al Sistema!!");
        System.out.println("Elige la opcion del sistema");
        System.out.println("1. Calcular una suma");
        System.out.println("2. Calcular una potencia");
        System.out.println("3. Imprimir un mensaje");
        System.out.println("4. terminar");
    }
    //
    public static void realizarSuma(){
        Scanner captu = new Scanner (System.in);
        int val1, val2;
        System.out.println("Valor 1: ");
        val1 = captu.nextInt();
        System.out.println("Valor 2: ");
        val2 = captu.nextInt();
        int resu = sumar(val1,val2);
          System.out.println("La suma es: " + resu);
    }
    public static int sumar (int num1, int num2){
       return num1 + num2;
    }
    //calcular una potencia
    public static void realizarPotencia(){
        Scanner captu = new Scanner (System.in);
        int val1, val2;
        System.out.println("Base: ");
        val1 = captu.nextInt();
        System.out.println("Exponente: ");
        val2 = captu.nextInt();
        int resu = sumar(val1,val2);
          System.out.println("La suma es: " + resu);
    }
    public static int calcularPotencia(int base, int expo){
        //ciclo ----> for
        int potencia = 1;
        for (int i = 1; i <= expo; i++){
            potencia = potencia * base;
        }
        return potencia;
    }
}
