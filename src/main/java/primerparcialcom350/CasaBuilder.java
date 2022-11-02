/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerparcialcom350;

/**
 *
 * @author Alex
 */
abstract class CasaBuilder {
    protected  Casa casa;

        public Casa getCasa()
        {
            return casa;
        }

        public void createCasa()
        {
             casa = new Casa();
        }

        public abstract void contruirParedes();
        public abstract void colocarPuertas();
        public abstract void colocarVentanas();
        public abstract void construirTecho();
        public abstract void construirPiso();
        public abstract void construirGaraje();
        
       
    
}
