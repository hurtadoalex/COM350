/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerparcialcom350;

/**
 *
 * @author Alex
 */
class Puertas {
    public double Alto;
    public double Ancho;
    public MaterialPuerta puerta;
    public Color color;
    public void instalarPuerta(double x, double y){
        Alto=x;
        Ancho=y;
        System.out.println("la Puerta es de :"+Alto+"x"+Ancho);
    }
}

enum MaterialPuerta{
    madera,aglomerado,fierro,aluminio
}
