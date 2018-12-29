package g1;

import java.util.ArrayList;

import javax.swing.*;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuarios sistema=new Usuarios();
		boolean salir = false;
		int opcion;
		String menuPrincipal;
		do {
			menuPrincipal= "------PELICULAS------ \n"
					+ "1.Acceder al sistema\n"
					+ "2.Registrar nuevo usuario \n"
					+ "3.Guardar todo en un archivo serializado \n"
					+ "4.Recuperar informacion de un archivo serializado \n"
					+ "5.Salir";
			opcion=Integer.valueOf(JOptionPane.showInputDialog(menuPrincipal));
			switch(opcion) {
			case 1:
				String nombre;
				int clave;
				nombre=JOptionPane.showInputDialog("Nombre usuario:\n");
				clave=Integer.valueOf(JOptionPane.showInputDialog("Clave usuario:"));
				Usuario u=new Usuario(nombre,clave);
				if(sistema.getUsuarios().contains(u)) {
					sistema.autenticar(u);
					JOptionPane.showMessageDialog(null, "Usuario correcto");
					menuUsuario(u);
					
				}else {
					JOptionPane.showMessageDialog(null, "El usuario no est� registrado");
				}
				break;
			case 2:
				nombre=JOptionPane.showInputDialog("Nombre usuario:\n");
				clave=Integer.valueOf(JOptionPane.showInputDialog("Clave usuario:"));
				Usuario u1=new Usuario(nombre,clave);
				if(sistema.getUsuarios().contains(u1)) {
					JOptionPane.showMessageDialog(null, "El nombre de usuario ya existe");
				}else {
					sistema.registrar(u1);
					JOptionPane.showMessageDialog(null, "Usuario registrado");
				}
				
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				salir=true;
				break;
			}
		}while(salir!=true);
		
		
		
	}
	
	private static void menuUsuario(Usuario u) {
		
		boolean exit = false;
		int opcion1;
		String menuSecundario;
		
		do {
			menuSecundario= "------Menu Usuario------ \n"
					+ "1.Ver la lista completa de pel�culas, con toda su informaci�n, incluyendo sus cr�ticas.\n"
					+ "2.Ver su propio muro. \n"
					+ "3.A�adir una pel�cula a la lista. \n"
					+ "4.A�adir una cr�tica a cualquier pel�cula. \n"
					+ "5.Enviar una solicitud de amistad.\n"
					+ "6.Aceptar una solicitud de amistad.\n"
					+ "7.Compartir pel�culas y/o cr�ticas con un amigo concreto y/o con todos sus amigos. \n"
					+ "8.Iniciar una partida. \n"
					+ "9.Completar una partida pendiente. \n"
					+ "10.Ver la clasificaci�n actual.\n"
					+ "11.Ordenar la clasificaci�n por cualquiera de los dos criterios establecidos. \n"
					+ "12.Elegir un usuario de la clasificaci�n y mostrar el detalle de sus partidas.\n"
					+ "13.Imprimir la clasificaci�n en un archivo de texto.\n"
					+ "14.Compartir el resultado de una partida jugada, con un amigo concreto y/o con todos sus amigos. \n"
					+ "15.Compartir toda su informaci�n (pel�culas, cr�ticas y partidas) con un amigo concreto y/o con todos sus amigos. \n"
					+ "16.Cerrar Sesion \n";
			opcion1=Integer.valueOf(JOptionPane.showInputDialog(menuSecundario));
			
			switch(opcion1) {
				case 1:
					break;
				case 2:
					JOptionPane.showMessageDialog(null, u.getMuro());
					break;
				case 3:
					String titulo,director,genero,actor,actriz;
					int anho;
					titulo=JOptionPane.showInputDialog("Introduzca titulo de la pelicula:\n");
					anho=Integer.valueOf(JOptionPane.showInputDialog("Introduzca el a�o de la pelicula:"));
					director=JOptionPane.showInputDialog("Introduzca el director de la pelicula:\n");
					genero=JOptionPane.showInputDialog("Introduzca genero de la pelicula:\n");
					actor=JOptionPane.showInputDialog("Introduzca actor de la pelicula:\n");
					actriz=JOptionPane.showInputDialog("Introduzca actriz de la pelicula:\n");

					Pelicula p=new Pelicula(titulo,anho,director,genero,actor,actriz);
					u.añadirPelicula(p);
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					break;
				case 8:
					break;
				case 9:
					break;
				case 10:
					break;
				case 11:
					break;
				case 12:
					break;
				case 13:
					break;
				case 14:
					break;
				case 15:
					break;
				case 16:
					exit=true;
					break;
			}
		}while(exit!=true);	
	}
}
