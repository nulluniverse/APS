/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apsclasse;


import java.util.ArrayList;
import telas.IntSistema;

public class APSFOMEZERO {
    
    private static final ArrayList<ONG> listaONG = new ArrayList<>();
    private static final ArrayList<Restaurante> listaRestaurante = new ArrayList<>();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
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
