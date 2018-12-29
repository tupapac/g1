package g1;

import java.util.HashSet;

public class Pelicula implements Compartible{
	
	private String titulo;
    private int anho;
    private String director;
    private String genero;
    private String actor;
    private String actriz;
    private HashSet <Critica> criticas;
    private Peliculas peliculas;
    
    public Pelicula(String tit,int anho, String direc, 
            		String gen,String actor, String actriz){
      
        this.titulo = tit;
        this.anho= anho;
        this.director = direc;
        this.genero = gen;
        this.actor = actor;
        this.actriz = actriz;
        this.criticas = new HashSet <> ();
    }
    
    @Override
    public String toString(){
        return "Titulo pelicula: "+this.getTitulo()
                +"\n"+ "a�o :"+this.getAnho()
                +"\n Director: "+this.getDirector()+"\n"
                + "Genero: "+this.getGenero()+"\n"
                + "Actor/Actriz: "+this.getActor()+" " +this.getActriz();
    }
    
    
   public String getTitulo(){
       return this.titulo;
   }
    
    public int getAnho(){
       return this.anho;
   }
    
     public String getDirector(){
       return this.director;
   }
      public String getGenero(){
       return this.genero;
   }
       public String getActor(){
       return this.actor;
   }
       
       public String getActriz(){
       return this.actriz;
   }

	public Peliculas getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(Peliculas peliculas) {
		this.peliculas = peliculas;
	}

	public HashSet <Critica> getCriticas() {
		return criticas;
	}

	public void setCriticas(Critica c) {
		this.criticas.add(c);
	}
	
	public boolean equals (Object o) {
		if(this==o) 
			return true;
		if(o==null)
			return false;
		if(this.getClass()!=o.getClass())
			return false;
		
		Pelicula a= (Pelicula) o;
		return (this.getTitulo().equals(a.getTitulo()));
		
	}
	
	public int hashCode() {
		return this.getTitulo().hashCode();
	}

	@Override
	public void compartir(Usuario u) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder(this.toString());
		u.setMuro(sb);
	}

	@Override
	public void compartir(HashSet<Usuario> users) {
		// TODO Auto-generated method stub
		for(Usuario a: users) {
			StringBuilder sb=new StringBuilder(this.toString());
			a.setMuro(sb);
		}
		
	}

	
}
