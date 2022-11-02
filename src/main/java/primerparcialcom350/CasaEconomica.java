/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerparcialcom350;

/**
 *
 * @author Alex
 */
public class CasaEconomica extends CasaBuilder{

    @Override
    public void contruirParedes() {
       casa.pared.material = MaterialPared.adobe ;}

    @Override
    public void colocarPuertas() {
        casa.puerta.instalarPuerta(2, 0.9); 
        casa.puerta.puerta=MaterialPuerta.aglomerado;
    }

    @Override
    public void colocarVentanas() {
        casa.ventana.instalarVentana(1,1);
        casa.ventana.marco= TipoMarco.fierro;}

    @Override
    public void construirTecho() {
        casa.techo.techo= MaterialTecho.calamina; }

    @Override
    public void construirPiso() {
        casa.piso.piso=MaterialPiso.cemento;  }

    @Override
    public void construirGaraje() {
        System.out.println("no tiene garaje"); }

    /*@Override
    public void contruirParedes() {
        casa.pared.material = MaterialPared.adobe ;
    }

    @Override
    public void colocarPuertas() {
       casa.puerta.instalarPuerta(2, 0.9);
    }

    @Override
    public void colocarVentanas() {
        casa.ventana.instalarVentana(1,1);
        casa.ventana.marco= TipoMarco.fierro;
    }

    @Override
    public void construirTecho() {
        casa.techo.techo= MaterialTecho.calamina;
    }

    @Override
    public void construirPiso() {
        casa.piso.piso=MaterialPiso.cemento;
    }

    @Override
    public void construirGaraje() {
       System.out.println("no tiene garaje");
    }*/

   
   

}