import java.util.HashSet;

public class Usuarios {
	
	private HashSet <Usuario> usuarios;
	
	public Usuarios () {
		this.usuarios=new HashSet <> ();
	}
	
	public HashSet <Usuario> getUsuarios(){
		return this.usuarios;
	}
	
	public void setUsuarios (Usuario u){
		this.usuarios.add(u);
	}
	
	public void autenticar(Usuario u) {
		this.getUsuarios().contains(u);
	}
	
	public void registrar (Usuario u) {
			usuarios.add(u);
			u.setSistema(this);
	}
}
