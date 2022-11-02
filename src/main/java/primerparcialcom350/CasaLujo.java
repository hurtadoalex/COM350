/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerparcialcom350;

/**
 *
 * @author Alex
 */
public class CasaLujo extends CasaBuilder {

    @Override
    public void contruirParedes() {
        casa.pared.material = MaterialPared.cemento; }

    @Override
    public void colocarPuertas() {
        casa.puerta.instalarPuerta(2,1.5);
        casa.puerta.puerta=MaterialPuerta.madera;
    }

    @Override
    public void colocarVentanas() {
       casa.ventana.instalarVentana(1.5,1.5);
        casa.ventana.marco= TipoMarco.madera;
        casa.ventana.instalarVentana(1.5,1.5);
        casa.ventana.marco= TipoMarco.madera;}

    @Override
    public void construirTecho() {
        casa.techo.techo= MaterialTecho.teja;}

    @Override
    public void construirPiso() {
        casa.piso.piso=MaterialPiso.porcelanato;}

    @Override
    public void construirGaraje() {
        casa.garaje.GarajeM(4,3, 2);}
    
}
