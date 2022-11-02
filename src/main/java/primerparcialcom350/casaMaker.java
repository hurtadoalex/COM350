/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerparcialcom350;

/**
 *
 * @author Alex
 */
public class casaMaker {
     private CasaBuilder builder;

        public casaMaker(CasaBuilder builder)
        {
            this.builder = builder;
        }


        public void BuildCasa()
        {
            builder.contruirParedes();
            builder.colocarPuertas();
            builder.colocarVentanas();
            builder.construirTecho();
            builder.construirPiso();
            builder.construirGaraje();

        }

        public Casa getCasa()
        {
            return builder.getCasa();
        }
    
}
