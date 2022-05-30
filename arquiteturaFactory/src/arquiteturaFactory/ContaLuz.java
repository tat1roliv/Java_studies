package arquiteturaFactory;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author web2
 */
public abstract class ContaLuz {
    protected double taxa;
    abstract void setTaxa();
    abstract double getTaxa();

    public void calcularFatura(int unidadesMW){
        System.out.println(unidadesMW*taxa);
    }

}
