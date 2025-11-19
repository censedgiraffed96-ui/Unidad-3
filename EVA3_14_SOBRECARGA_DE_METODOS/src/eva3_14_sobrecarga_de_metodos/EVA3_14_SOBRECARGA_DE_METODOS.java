//ARATH👍
package eva3_14_sobrecarga_de_metodos;

import java.util.Scanner;

public class EVA3_14_SOBRECARGA_DE_METODOS {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int valor;
        do {
            imprimirMenu();
            valor = captu.nextInt();
        switch(valor){
                case 1:
                    System.out.println("Calcular Area de un Circulo ");
                    area(0.0);
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Calcular Area de un Traingulo");
                    area(1.0,1);
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Calcular Area de Trapecio");
                    area(2.0,1.0);
                    System.out.println("");
                    break;
                    }
                  }while(valor != 4);
        System.out.println("Saliste del sistema!!");
        }
        public static void area(double Area){
            Scanner captu = new Scanner (System.in);
            double area, radio;
            System.out.println("Introduce el Radio del circulo: ");
            radio= captu.nextDouble();
            area= (radio * radio) * Math.PI;
            System.out.println(area);
        }
        public static void area(double Area, int Base){
            Scanner captu = new Scanner (System.in);
            double base, altura,area;
            System.out.println("Introduce la base del Triangulo: ");
            base= captu.nextDouble();
            System.out.println("Introduce la alltura del Triangulo: ");
            altura= captu.nextDouble();
            area= (base * altura) / 2;
            System.out.println(area);
        }
        public static void area(double Area, double Basem){
            Scanner captu = new Scanner (System.in);
            double baseM, basem, altura, area, area1;
            System.out.println("Introduce la base menor del trapecio: ");
            baseM= captu.nextDouble();
            System.out.println("Introduce la base mayor del trapecio: ");
            basem= captu.nextDouble();
            System.out.println("Introduce la altura del trapecio ");
            altura= captu.nextDouble();
            area= (basem + baseM) * altura;
            area1= area / 2;
            System.out.println(area1);
        }
    public static void imprimirMenu(){
        System.out.println("**!!Bienvenido a la calculadora de Areas!!**");
        System.out.println("**!!Elige la opcion que quieras convertir!!**");
        System.out.println("1. Calcular Area de un Circulo");
        System.out.println("2. Calcular Area de un Triangulo");
        System.out.println("3. Calcular Area de un Trapecio");
        System.out.println("4. Terminar Programa (Salir)");
    }
}