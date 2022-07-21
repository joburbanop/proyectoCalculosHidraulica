/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hidraulica;

/**
 *
 * @author 
 */
public class Hidraulica {

    /*----------------
     * Metodos y Constantes
     *-------------------*/
    
    private final static double GRAVEDAD=981;
    
    private double caudal;
    
    private double anchoCanal;
    
    private double profundidad;
    
    private double velocidad;
    
    private double fr1;
    
    private double y2;
    
    private double velocidad2;
    
    private double e1;
    
    private double e2;
    
    /*---------------
     * Metodos
     *--------------*/
    
    public Hidraulica(double caudal, double anchoCanal, double profundidad) {    
        this.caudal = caudal;
        this.anchoCanal = anchoCanal;
        this.profundidad = profundidad;
    }

    
    
    /**
     * constante
     * @return GRAVEDAD
     */
    public static double getGRAVEDAD() {
        return GRAVEDAD;
    }
    
       public double calcularVelocidad()
    {
        velocidad=(caudal)/(anchoCanal*profundidad);
        double roundVelocidad=Math.round(velocidad*1000.0)/1000.0;
        velocidad=roundVelocidad;
        return roundVelocidad;
    }
    
    public double FR1()
    {
        double raiz=getGRAVEDAD()*profundidad;
        fr1=((velocidad)/(Math.sqrt(raiz)));
        double fr1round=Math.round(fr1*1000.0)/1000.0;
        return fr1round;
    }
    public double Y2()
    {
        double raiz=1+8*(Math.pow(fr1,2));
        y2=((0.5)*(Math.sqrt(raiz)-1))*profundidad;
        double y2Round=Math.round(y2*1000.0)/1000.0;
        y2=y2Round;
        return y2;
    }
    
    public double velocidad2()
    {
        velocidad2=(caudal)/(anchoCanal*y2);
        return Math.round(velocidad2*1000.0)/1000.0;
    }
    
    public double E1()
    {   
        e1=profundidad+(Math.pow((caudal/anchoCanal), 2)/(2*Hidraulica.getGRAVEDAD()*(Math.pow(profundidad,2))));
        return Math.round(e1*1000.0)/1000.0;
    }
        
    public double E2()
    {   
        e2=y2+(Math.pow((caudal/anchoCanal),2)/(2*Hidraulica.getGRAVEDAD()*(Math.pow(y2,2))));
        return Math.round(e2*1000.0)/1000.0;
    }
    public double nRH()
    {   
        double nRH=e2/e1;
        return Math.round(nRH*1000.0)/1000.0;
    }
    
    public double nE()
    {   
        double ne=(4*profundidad*y2)/(Math.pow(profundidad+y2, 2));
        return Math.round(ne*1000.0)/1000.0;
    }
    
    public double l1()
    {
        double l1=9.75*profundidad*Math.pow((fr1-1), 1.01);
        return Math.round(l1*1000.0)/1000.0;
    }
    public double l2()
    {   
        double l2= 6*(y2-profundidad);
        return  Math.round(l2*1000.0)/1000.0;
    }
    public double l3()
    {
       double l3= 2.5*(1.9*y2-profundidad);
       return  Math.round(l3*1000.0)/1000.0;
    }

    public double peridaEnergia()
    {
        double perdida=(Math.pow((y2-profundidad), 2)/(4*profundidad*y2));
        return Math.round(perdida*1000.0)/1000.0;
    }
}