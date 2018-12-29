/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g1;

/**
 *
 * @author Argiro
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pelicula pel = new Pelicula("Rick",2015,"direccion","ficcion","morty","jue");
        Peliculas catalogo = new Peliculas();
        Pelicula pel2 = new Pelicula("Luffy",1990,"weast blue","dibujos","Zoro","Robin");
        
        Pelicula pel3 = new Pelicula("Nami",1995,"east blue","anime","sanji","Summer");
        
        Pelicula pel4 = new Pelicula("Ussop",1996,"north blue","manga","nariz","Maria");
        
        Pelicula pel5 = new Pelicula("Franky",1989,"blue","caricatura","robot","cuadrado");
        
        Pelicula pel6 = new Pelicula("Brook",1899,"red blue","animacion","calavera","laboom");
        
        
        
        catalogo.añadirPelicula(pel);
        catalogo.añadirPelicula(pel6);
        catalogo.añadirPelicula(pel2);
        catalogo.añadirPelicula(pel3);
        catalogo.añadirPelicula(pel4);
        catalogo.añadirPelicula(pel5);

       // Pregunta pre = new Pregunta (catalogo);
       //pre.seleccionarPelicula(catalogo);
       
       //Pregunta pre1 = new Pregunta (catalogo);
     //  Pregunta pre2=pre1;
       
     //  int jugador1 = pre1.getpuntos_jugador();
       int jugador2 = pre2.getpuntos_jugador();
      // 
    // System.out.println("Puntos jugador 1: "+jugador1+""
             + "\n Puntos jugador 2"+jugador2);
       
        
    }
    
}
