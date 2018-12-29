package g1;

import java.util.ArrayList;



public class Peliculas {
	
	private ArrayList <Pelicula> catalogo;

    public Peliculas(){
        this.catalogo=new ArrayList <> ();
    }
    
    public void añadirPelicula(Pelicula p){
        this.catalogo.add(p);
    }
    
    
    public void verInfoPeliculas(){
        System.out.println(catalogo.toString());
    }
    
    public ArrayList getCatalogo(){
        return this.catalogo;
    }
   
}
