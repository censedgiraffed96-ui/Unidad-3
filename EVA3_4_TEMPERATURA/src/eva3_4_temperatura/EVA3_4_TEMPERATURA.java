
package eva3_4_temperatura;

import java.util.Scanner;

public class EVA3_4_TEMPERATURA {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int valor;
        do {
            imprimirMenu();
            valor= captu.nextInt();
            switch(valor){
                case 1:
                    System.out.println("****Realizar Conversion Farenheit a Celsius****");
                    realizarFarenheitCelsius();
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("****Realizar Conversion Celsius a Farenheit****");
                    realizarCelsiusFarenheit();
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("****Realizar Conversion Celsius a Kelvin****");
                    realizarCelsiusKelvin();
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("****Realizar Conversion Kelvin a Celsius****");
                    realizarKelvinCelsius();
                    System.out.println("");
                    break;
            }
            }while(valor != 5);
        System.out.println("Saliste del sistema!!");
    }
        //Realizar Farenheit a Celsius
        public static void realizarFarenheitCelsius(){
            Scanner captu = new Scanner (System.in);
        double Fahr, resuF;
        System.out.println("Conversion de Grados Farenheit a Celsius: ");
        Fahr= captu.nextDouble();
        resuF = convertirFarCelsius(Fahr);
        System.out.println(Fahr + " " +  "Farenheit=  " + resuF + "C");
        }
        public static double convertirFarCelsius(double far){
        double resuf = (far - 32) / 1.8;
        return resuf;
        }
        
        //Realizar Celsius Farenheit
        public static void realizarCelsiusFarenheit(){
            Scanner captu = new Scanner (System.in);
        double resuC,Cels ;
        System.out.println("Conversion de Grados Celsius a Farenheit:");
        Cels= captu.nextDouble();
        resuC = convertirCelsiusFar(Cels);
        System.out.println(Cels + " " +  "Celsius= " + resuC + "F");
        }
        public static double convertirCelsiusFar(double cels){
        double resuc = (cels * 1.8) + 32;
        return resuc;
        }
        
        //Realizar Celsius a Kelvin
        public static void realizarCelsiusKelvin(){
            Scanner captu = new Scanner (System.in);
        double resuck,Celsk;
        System.out.println("Conversion de Grados Celsius a Kelvin:");
        Celsk= captu.nextDouble();
        resuck = convertirCelsiusKelvin(Celsk);
        System.out.println(Celsk + " " + "Farenheit=  " + resuck + "K");
        }
        public static double convertirCelsiusKelvin(double celsk){
        double resufk = (celsk + 273.15);
        return resufk;
     
        }
        //Realizar Kelvin a Celsius
        public static void realizarKelvinCelsius(){
            Scanner captu = new Scanner (System.in);
        double resuK,Kelv ;
        System.out.println("Conversion de Grados Kelvin a Celsius:");
        Kelv= captu.nextDouble();
        resuK = convertirKelvinCels(Kelv);
        System.out.println(Kelv + " " + "Kelvin=  " + resuK + "C");
        }
        public static double convertirKelvinCels(double kelv){
        double resuk = (kelv - 273.15);
        return resuk;
        }
    public static void imprimirMenu(){
        System.out.println("**!!Bienvenido a la calculadora de temperatura!!**");
        System.out.println("**!!Elige la opcion que quieras convertir!!**");
        System.out.println("1. Calcular Farenheit a Celsius");
        System.out.println("2. Calcular Celsius a Farenheit");
        System.out.println("3. Clacular Celsius a Kelvin");
        System.out.println("4. Calcular Kelvin a Celsius");
        System.out.println("5. Terminar Programa (Salir)");
    }
}