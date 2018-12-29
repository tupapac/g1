package g1;

import java.util.HashSet;
import java.util.Scanner;

public  class Critica implements Compartible{
	
	private String pelicula;
	private double puntuacion;
	private String texto;

    public Critica(String nombre) {
    	pelicula=nombre;
    	
        Scanner entrada;
        entrada = new Scanner (System.in);
        
        System.out.println("Puntuacion: ");
                this.puntuacion = entrada.nextDouble();
                
        System.out.println("Realice critica: ");
                this.texto = entrada.nextLine();
                    
    }
    
    public String getPelicula() {
    	return this.pelicula;
    }
    
    public double getPuntuacion(){
        return this.puntuacion;
    }
    
    public String getTexto(){
        return this.texto;
    }
    
    
    @Override
    public String toString(){
        return "Puntuacion :"+this.getPuntuacion()+"\n"
                + "Critica: "+this.getTexto();
    }

	public void compartir(Usuario u) {
		// TODO Auto-generated method stub
                StringBuilder sb=new StringBuilder(this.toString());
		u.setMuro(sb);
		
	}

    @Override
    public void compartir(HashSet<Usuario> users) {
        
        for(Usuario a: users) {
			StringBuilder sb=new StringBuilder(this.toString());
			a.setMuro(sb);
		}   
    }

  
}
