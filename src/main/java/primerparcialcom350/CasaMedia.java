/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerparcialcom350;

/**
 *
 * @author Alex
 */
public class CasaMedia extends CasaBuilder{

    @Override
    public void contruirParedes() {
        casa.pared.material = MaterialPared.ladrillo ;}

    @Override
    public void colocarPuertas() {
        casa.puerta.instalarPuerta(2, 0.9);
        casa.puerta.puerta=MaterialPuerta.madera;
    }

    @Override
    public void colocarVentanas() {
        casa.ventana.instalarVentana(1.5,1.5);
        casa.ventana.marco= TipoMarco.aluminio;
        casa.ventana.instalarVentana(1.5,1.5);
        casa.ventana.marco= TipoMarco.aluminio;
    }

    @Override
    public void construirTecho() {
         casa.techo.techo= MaterialTecho.calamina;}

    @Override
    public void construirPiso() {
        casa.piso.piso=MaterialPiso.cemento;}

    @Override
    public void construirGaraje() {
        casa.garaje.GarajeM(2,3, 2);
    }
    
}
