/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerparcialcom350;

/**
 *
 * @author Alex
 */
class Ventanas {
    public double Alto;
    public double Ancho;
    public TipoMarco marco;
    public Color color;
    
    public void instalarVentana(double a,double b){
        Alto=a;
        Ancho=b;
        System.out.println("la Venta es de :"+Alto+"x"+Ancho);
    }
    
}

enum TipoMarco{
    madera,aluminio,fierro
}

