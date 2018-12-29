package g1;

import java.util.HashSet;

public interface Compartible {
	 
	public abstract void compartir ( Usuario u);
	    
	public abstract void compartir (HashSet <Usuario> users);
	
}
