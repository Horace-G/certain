/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos_grafiico;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author Horacio Galdamez
 */
public class administrarBarra extends Thread{// esto significa que ya no tenemos que hacer instancias de threas, ahora solo
    //se ocupa instancia de la clase
    
    private JProgressBar barra;
    private boolean vive;
    private boolean avanzar;

    public administrarBarra(JProgressBar barra) {
        this.barra = barra;
        vive=true;
        avanzar=true;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }
    
    @Override
    public void run(){
        while(vive==true){
            if(avanzar==true){
                barra.setValue(barra.getValue()+1);
                if(barra.getValue()==1000000){
                    vive=false;
                }
                try{
                Thread.sleep(50);
                }catch(InterruptedException ex){
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
            }
        }
    }
    
    
}
