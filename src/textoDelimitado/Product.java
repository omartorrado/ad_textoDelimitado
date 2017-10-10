/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textoDelimitado;

import java.text.NumberFormat;

/**
 *
 * @author otorradomiguez
 */
public class Product {
    private String codigo;
    private String descricion;
    private double prezo;
    
    public Product(){
        codigo=null;
        descricion=null;
        prezo=0;
    }
    
    public Product(String codigo,String descricion,double prezo){
        this.codigo=codigo;
        this.descricion=descricion;
        this.prezo=prezo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricion() {
        return descricion;
    }

    public void setDescricion(String descricion) {
        this.descricion = descricion;
    }

    public double getPrezo() {
        return prezo;
    }

    public void setPrezo(double prezo) {
        this.prezo = prezo;
    }
    
    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", descricion=" + descricion + ", prezo=" + NumberFormat.getCurrencyInstance().format(prezo) + '}';
    }
    
}
