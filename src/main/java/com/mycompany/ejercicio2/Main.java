
package com.mycompany.ejercicio2;


public class Main {
    public static void main (String[] args){
        // condidional IF
        System.out.println("Condicional IF----------------------------");
        int numeroIf = -30;
        
        if (numeroIf > 0){
            System.out.println("El numero " + numeroIf + " es positivo, mayor a cero.");
        }else if (numeroIf < 0){
            System.out.println("El numero " + numeroIf + " es negativo, menor a cero.");
        }else {
            System.out.println("El numero es 0 (cero).");
        }
        
        // WHILE
        System.out.println("Bucle WHILE-------------------------------");
        int numeroWhile = 0;
        while (numeroWhile < 3){ //compara la condicion y si se cumple se ejecuta
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }
        // el codigo sigue por aqui
        
        // DO-WHILE
        System.out.println("Bucle DO-WHILE----------------------------");
        int numeroDoWhile = 3;
        
        do{ //primero ejecuta la accion y despues compara la condicion
            System.out.println(numeroDoWhile);
            numeroDoWhile = numeroDoWhile -1;
        } while (numeroDoWhile >= 3);
        
        /*bucle FOR
        System.out.println("----------Bucle FOR------------");
        int valores[]={10,20,30,40,50};
        
        for (int i = 0; i < valores.length; i++){
            System.out.println(valores[i]);
        }*/
        //bucle FOR
        System.out.println("Bucle FOR---------------------------------");
        
        for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor + 1){
            System.out.println(numeroFor);
        }
        
        // SWITCH
        System.out.println("SWITCH------------------------------------");
        var estacion = "INVIERNO";
        
        switch(estacion){
            case "VERANO":
                System.out.println("es verano");
                break;
            case "OTOÑO":
                System.out.println("es otoño");
                break;
            case "INVIERNO":
                System.out.println("es invierno");
                break;
            case "PRIMAVERA":
                System.out.println("es primavera");
                break;
            default:
                System.out.println("Esa estacion NO existe");
        }
        
        /* 2 SWITCH
        var hoy_es ="MARTES";
        
        switch (hoy_es){
            case "LUNES":
            case "MARTES":
            case "MIERCOLES":
            case "JUEVES":
            case "VIERNES":
                System.out.println("Hoy es laborable");
                break;
            case "SABADO":
            case "DOMINGO":
                System.out.println("Hoy NO es laborable");           
        } */

    }
    
    
    
    
    
}
