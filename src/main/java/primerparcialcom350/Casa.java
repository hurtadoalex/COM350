/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerparcialcom350;

import java.util.List;

/**
 *
 * @author Alex
 */
class Casa {
    public Pared pared;
    public Techo techo;
    public Piso piso;
    public Garaje garaje ;
    public Ventanas ventana;
    public Puertas puerta;

    public void Mostrar() {
        System.out.println("Pared de Tipo: " + pared + " ");
        System.out.println("Techo Tipo: " + techo);
        System.out.println("Piso Tipo:" + piso);
        System.out.println("Garaje Medidas:"+garaje);
        System.out.println("Garaje Medidas:"+ventana);
        System.out.println("Garaje Medidas:"+puerta);
       
    }
    
}
