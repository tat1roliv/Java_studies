package arquiteturaFactory;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author web2
 */
public class ContaLuzComercial extends ContaLuz{
    
    public void setTaxa(){
        taxa = 20.00;
    }

    public double getTaxa(){
        return this.taxa;
    }
}
