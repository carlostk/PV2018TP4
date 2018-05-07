/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3.dominio;

import java.io.Serializable;

/**
 *
 * @author Ale
 */
public class Calculadora implements Serializable{
    private int n2;
    private int n1;
    
    
    public int dividirOperacion()
    { int divicion=0;
            if(n1>0 && n2>0)
            {
                   divicion = n1/n2; 
            }
            else
                {if (n1==0 || n2==0)
                    
                 divicion=0;   
                 }
            return divicion;
    }
    
    public  int potenciaObtener(){
     int pot=0;
     int re=1;
        if(n1==0)
        {
        re = 0;
        }
        else
        {
            if(n2==0)
                re=1;
            else
            {if(n1 !=0 && n2 !=0)
            {      
                while(pot <=n2)
                { re= re*n1; 
               pot = pot +1;
                }
            }
                
                }
        }
     
        return re;
        
    }
    
    public int multiplicarOperacoion()
    {int multi=1;
        if(n1==0 || n2==0 )
        {
            multi =0;
        }
        else
        {if(n1!=0 && n2!=0)
        {
         multi = n1*n2;}
        }
        return multi;
    }
    public int sumarCal(){
        int suma;
        return   suma = n1 + n2; 
    }
    
    public int restarOperacion()
    {   int resta;
        return  resta =  n1-n2;
    }
    public Calculadora(){
    
    
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

   
}
