package g1;

public class Item {
	
	private String nombreUsuario;
	private int jugadas=0;
	private int ganadas=0;
	private int perdidas=0;
	private double porcentaje_victorias;
	private int ptos=0;
	private Usuario user;
	
	public Item (String nombre,int j,int g,int p) {
		nombreUsuario=nombre;
		int empatadas=this.getJugadas()-(this.getGanadas()+this.getPerdidas());
	    user=new Usuario(null, ganadas, perdidas, empatadas, null, null, null);
            
            
            
	}
	
	public Usuario getUsuario() {
		return user;
	}
	
	public String getNombreUsuario () {
		return nombreUsuario;
	}

	public int getJugadas (){
	    
	    return jugadas;
	}

	public int getGanadas(){
	    return ganadas;
	}

	public int getPerdidas(){
	    return perdidas;
	}

	public int getPtos (){
	    return ptos;
	}

	public double getPorcentaje_victorias(){
	    return porcentaje_victorias;
	}

	public void detallePartidas(String nombre) {
		
	}
}
