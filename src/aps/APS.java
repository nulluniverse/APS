/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aps;

import java.util.ArrayList;
import telas.IntSistema;

public class APS {
    
    private static ArrayList<ONG> listaONG = new ArrayList<>();
    private static ArrayList<Restaurante> listaRestaurante = new ArrayList<>();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IntSistema intSistema = new IntSistema();
        intSistema.setVisible(true);
        
        
        // Adicione alguns restaurantes de exemplo
        //Restaurante restaurante1 = new Restaurante("Restaurante1", "restaurante1@gmail.com", "Endereço 1", 123456);

    }
    
    public static void cadastrarONG(ONG ong){
        
        boolean add = listaONG.add(ong);
        
        System.out.println("ONG cadastrada com sucesso!\n\n"+ong);
    }
    public static void cadastrarRestaurante(Restaurante Restaurante){
        
        boolean add = listaRestaurante.add(Restaurante);
        
        System.out.println("Restaurante cadastrado com sucesso!\n\n"+Restaurante);
    }
    
}
