package g1;

import java.util.ArrayList;
import java.util.HashSet;

public class Usuario {
	private Usuarios sistema;
	private static Peliculas catalogo=new Peliculas();
	private String nombre;
	private int clave;
	private StringBuilder muro;
	private int partidas_ganadas;
	private int partidas_perdidas;
	private int partidas_empatadas;
	private ArrayList <Partida> partidas_completas;
	private ArrayList <Partida> partidas_pendientes;
	private HashSet <Usuario> solicitudes_pendientes;
	private HashSet <Usuario> amigos;
	private HashSet <Pelicula> mis_peliculas;
	private ArrayList <Partida> mis_partidas;
	
	
	public Usuario (String name, int c) {
		this.nombre=name;
		this.clave=c;
		this.muro=new StringBuilder();
		this.partidas_ganadas=0;
		this.partidas_perdidas=0;
		this.partidas_empatadas=0;
		this.partidas_completas=new ArrayList<>();
		this.partidas_pendientes=new ArrayList<>();
		this.solicitudes_pendientes=new HashSet<>();
		this.amigos=new HashSet<>();
		this.mis_peliculas=new HashSet<>();
		this.mis_partidas=new ArrayList<>();
	}
	//Get y set
	
	public Usuarios getSistema() {
		return sistema;
	}

	public void setSistema(Usuarios sistema) {
		this.sistema = sistema;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getClave() {
		return clave;
	}

	public void setClave(int clave) {
		this.clave = clave;
	}

	public StringBuilder getMuro() {
		return muro;
	}

	public void setMuro(StringBuilder muro) {
		this.muro.append(muro);
	}

	public void setSolicitudes(Usuario u) {
		this.solicitudes_pendientes.add(u);
	}

	public void setAmigos(Usuario u) {
		this.amigos.add(u);
	}
	
	public void setPeliculas(Pelicula p) {
		this.mis_peliculas.add(p);
	}
	
	public HashSet <Usuario> getSolicitudes() {
			return this.solicitudes_pendientes;
	}
	
	public void setPartidasPendientes(Partida partida) {
		this.partidas_pendientes.add(partida);
	}
	//METODOS
	public void invitarAmigo (Usuario u) {
		u.setSolicitudes(this);
		System.out.println("Petici�n enviada");
	}
	
	public void aceptarInvitacion (Usuario u) {
			this.setAmigos(u);
			u.setAmigos(this);
			this.getSolicitudes().remove(u);
			System.out.println("Amigo agregado.");
	}
	
	
	public void rechazarInvitacion (Usuario u) {
		if(!this.getSolicitudes().contains(u)) {
			System.out.println("No tienes una solicitud de ese usuario.");
		}else {
			this.getSolicitudes().remove(u);
			System.out.println("Solicitud rechazada.");
		}
	}
	
	public void compartirPelicula (Pelicula p) {
		for(Usuario u: this.amigos) {
			StringBuilder sb=new StringBuilder("Pelicula compartida por:"+this.getNombre());
			u.setMuro(sb);
		}
		p.compartir(this.amigos);//this.getAmigos()
	}
	
	public void compartirPelicula (Pelicula p, Usuario u) {
		StringBuilder sb=new StringBuilder("Pelicula compartida por:"+this.getNombre());
		u.setMuro(sb);
		p.compartir(u);
	}
	
	public void compartirCritica (Critica c) {
		c.compartir(amigos);//getAmigos()
	}
	
	public void compartirCritica (Critica c, Usuario u) {
		
                c.compartir(u);
	}
	
	public void compartirPartida (Partida p) {
		p.compartir(amigos);//this.getAmigos()
	}
	
	public void compartirPartida (Partida p, Usuario u) {
		p.compartir(u);
	}
	public void compartirTodo () {
		for(Pelicula p : this.mis_peliculas) {
			p.compartir(amigos);
			for(Critica c : p.getCriticas()) {
				c.compartir(amigos);
			}
		}
		for(Partida p: this.partidas_completas) {
			p.compartir(amigos);
		}
	}
	
	public void compartirTodo (Usuario u) {
		for(Pelicula p : this.mis_peliculas) {
			p.compartir(u);
			for(Critica c : p.getCriticas()) {
				c.compartir(u);
			}
		}
		for(Partida p: this.partidas_completas) {
			p.compartir(u);
		}
	}
	
	public void añadirPelicula (Pelicula p) {
		this.setPeliculas(p);
		catalogo.añadirPelicula(p);
		StringBuilder sb=new StringBuilder(p.toString());
		this.setMuro(sb);
	}
	
	public void añadirCritica (Critica c, Pelicula p) {
		
	/*	if(p.getTitulo()==c.getPelicula()) {
			p.getCriticas().add(c);
		}*/
		
		p.setCriticas(c);
	}
	
	public void iniciarPartida (Usuario u) {
		Partida partida=new Partida(this,u) {};
		for(int i=0;i<6;i++) {
			partida.getPreguntas()[i]=new Pregunta(i,catalogo);
			
		}
		
		this.setPartidasPendientes(partida);
		
		u.setPartidasPendientes(partida);

	}
	
	
	public void completarPartida (Partida p) {
		
	}
	
	public boolean equals (Object o) {
		if(this==o) 
			return true;
		if(o==null)
			return false;
		if(this.getClass()!=o.getClass())
			return false;
		
		Usuario a= (Usuario) o;
		return (this.getNombre().equals(a.getNombre()));
		
	}
	
	public int hashCode() {
		return this.getNombre().hashCode();
	}
}
