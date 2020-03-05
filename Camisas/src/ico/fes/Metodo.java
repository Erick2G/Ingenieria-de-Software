/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes;

/**
 *
 * @author user
 */
public class Metodo {
    int mangaCorta, mangaLarga, formal;
    public static final int pMC=190, pML=230, pF =310;
    
    public Metodo(){
        
    }
    public void setCompra(int mangaCorta,int mangaLarga,int formal){
        this.mangaCorta = mangaCorta;
        this.mangaLarga = mangaLarga;
        this.formal = formal;
    }
    
    public float calcularPrecio(){
        float precio=0, numCamisas=0;
        precio += mangaCorta*pMC+mangaLarga*pML+formal*pF;
        numCamisas += mangaCorta+mangaLarga+formal;
        if(numCamisas >2&&numCamisas<6){
            precio = (float)(precio - (precio*(.05)));
        }else if(numCamisas>5){
             precio = (float)(precio - (precio*(.08)));
        }
        System.out.println(precio+"---------------");
        return precio;
    }
}
