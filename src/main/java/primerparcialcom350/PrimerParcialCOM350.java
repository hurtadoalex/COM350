/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package primerparcialcom350;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class PrimerParcialCOM350 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String cadena = "";
        System.out.println("Elegir que casa Construir");
        System.out.println("1. Casa de Lujo:");
        System.out.println("2. Casa Media: ");
        System.out.println("3. Casa Economica:");
        cadena= sc.nextLine();
        
        if(cadena=="1"){
        casaMaker construirCasaEconomica = new casaMaker(new CasaEconomica());
        construirCasaEconomica.BuildCasa();
        Casa casa1 = construirCasaEconomica.getCasa();
        casa1.Mostrar();
        }
        if(cadena=="2"){
        casaMaker construirCasaMedia = new casaMaker(new CasaMedia());
        construirCasaMedia.BuildCasa();
        Casa casa2 = construirCasaMedia.getCasa();
        casa2.Mostrar();
        }
        if(cadena=="3"){
        casaMaker construirCasaLujo = new casaMaker(new CasaLujo());
        construirCasaLujo.BuildCasa();
        Casa casa3 = construirCasaLujo.getCasa();
        casa3.Mostrar();
        }
        
    }
}
