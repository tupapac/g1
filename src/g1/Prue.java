
public class Prue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuarios sistema=new Usuarios();
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
      
       
       Usuario u=new Usuario("Juanito",123);
        sistema.registrar(u);
        Usuario u2=new Usuario("Argirito",123);
        sistema.registrar(u2);
        u.invitarAmigo(u2);
        u2.aceptarInvitacion(u);
        u.iniciarPartida(u2);
	}

}
