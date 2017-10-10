/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textoDelimitado;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author otorradomiguez
 */
public class textoDelimitado {
    
    public static String[] cod ={"p1","p2","p3"};
    public static String[] desc ={"parafusos","cravos","tachas"};
    public static double[] prezo ={3,4,5};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ruta="/home/local/DANIELCASTELAO/otorradomiguez/NetBeansProjects/textoDelimitado/produtos.txt";
        grabar(ruta,3);
        leer(ruta);
    }
    
    public static void grabar(String ruta,int numeroRegistros){
        try {
            PrintWriter pw=new PrintWriter(ruta);
            for(int i=0;i<numeroRegistros;i++){
                pw.print(cod[i]+"\t");
                pw.print(desc[i]+"\t");
                pw.println(prezo[i]);
            }
            pw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(textoDelimitado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void leer(String ruta){
        String linea;
        String[] atributos={};
        
        try {
            BufferedReader br=new BufferedReader(new FileReader(ruta));
            while(br.ready()){
                linea=br.readLine();
                atributos=linea.split("\t");
                Product producto=new Product(atributos[0],atributos[1],Double.parseDouble(atributos[2]));
                System.out.println(producto.toString());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(textoDelimitado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(textoDelimitado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
