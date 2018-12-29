package g1;

import java.util.HashSet;

public class Partida implements Compartible{
	private int identificador=0;
	private int ptos_jugador1,ptos_jugador2;
	private String resultado_final;
	private Usuario ganador;
	private Usuario user1;
	private Usuario user2;
	private Pregunta [] preguntas;
	
	
	public void visualizar (){
		System.out.println("Soy el rey del mambo");
		
	}
	
	 public Partida (Usuario u1, Usuario u2){  
		 this.identificador+=1;
		 this.user1=u1;
		 this.user2=u2;
		 this.preguntas=new Pregunta [6];
	 }
         
	 
	 public Pregunta [] getPreguntas() {
		 return this.preguntas;
	 }
         
	@Override
	public void compartir(Usuario u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void compartir(HashSet<Usuario> users) {
		// TODO Auto-generated method stub
		
	}


}
