package g1;

import java.util.Scanner;

public final class Pregunta {

    private int id;
    private Pelicula pelicula;
    private int puntos_jugador_1 = 0;
    private int puntos_jugador_2;
    private int FALLO = 10;
    private String[] respuesta = new String[6];
    private String[] preguntas = new String[6];
    private Peliculas Catalogo = new Peliculas();
    private Partida partida;
    int contadorPista = 0;
    int numpregunta;

    private int puntosPre1;
    private int puntosPre2;
    private int puntosPre3;
    private int puntosPre4;
    private int puntosPre5;
    private int puntosPre6;

    private int puntosTotales;

    private int contadorPuntos = 0;

    private int puntos_jugador;

    public Pregunta(int id, Peliculas Catalogo) {

        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        int acierto = 50;

        switch (id) {

            case 0:

                pelicula = seleccionarPelicula(Catalogo);
                System.out.println("1. Titulo de la pelicula?");
                contadorPista = 0;
                do {

                    // puntos_jugador=acierto-puntos_jugador;
                    respuesta[0] = entrada.nextLine();
                    if (respuestacorrecta(0) == true) {
                        puntos_jugador = acierto + puntos_jugador;
                        /* Los puntos de jugador que se suman son negativos en el else por tanto se restan */
                        System.out.println("Correcto! Tienes " + puntos_jugador + " puntos por esta pregunta");

                    } else /*if(respuestacorrecta(0)==false)*/ {
                        this.ofrecerNuevaPista(contadorPista + 1);
                        contadorPista = contadorPista + 1;
                        puntos_jugador = puntos_jugador - FALLO;
                        //numpregunta=numpregunta+1; 
                        System.out.println("1. Titulo de la pelicula:?");
                        System.out.println();

                    }
                    
                    
                } while (respuestacorrecta(0) == false);
                    
                this.puntosPre1=puntos_jugador;
                    
                break;

            case 1:
                contadorPista = 0;
                numpregunta = 1;
                pelicula = seleccionarPelicula(Catalogo);
                do {
                    System.out.println();
                    System.out.println("2. Anho de la pelicula?");

                    respuesta[numpregunta] = entrada.nextLine();

                    if (respuestacorrecta(numpregunta) == false) {

                        switch (contadorPista) {
                            case 0:
                                this.ofrecerNuevaPista(contadorPista);
                                contadorPista = 2;
                                puntos_jugador = puntos_jugador - FALLO;
                                break;
                            case 2:
                                this.ofrecerNuevaPista(contadorPista);
                                contadorPista = contador + 1;
                                puntos_jugador = puntos_jugador - FALLO;
                                break;
                            case 3:
                                this.ofrecerNuevaPista(contadorPista);
                                contadorPista = contador + 1;
                                puntos_jugador = puntos_jugador - FALLO;
                                break;
                            case 4:
                                this.ofrecerNuevaPista(contadorPista);
                                contadorPista = contador + 1;
                                puntos_jugador = puntos_jugador - FALLO;
                                break;
                            case 5:
                                this.ofrecerNuevaPista(contadorPista);
                                contadorPista = contador + 1;
                                puntos_jugador = puntos_jugador - FALLO;
                                break;
                        }
                    } else {
                        puntos_jugador = acierto + puntos_jugador;
                        /* Los puntos de jugador que se suman son negativos en el if (+ * - = -) por tanto se restan */
                        System.out.println("Correcto! Tienes " + puntos_jugador + " puntos en total");

                    }
                } while (respuestacorrecta(numpregunta) == false);
                
                this.puntosPre2=puntos_jugador;
                break;

            case 2:
                contadorPista = 0;
                numpregunta = 2;

                pelicula = seleccionarPelicula(Catalogo);

                do {
                    System.out.println();
                    System.out.println("3. genero de la pelicula: " + pelicula.getTitulo() + " ?");

                    respuesta[numpregunta] = entrada.nextLine();

                    if (respuestacorrecta(numpregunta) == false) {

                        switch (contadorPista) {
                            case 0:
                                this.ofrecerNuevaPista(contadorPista);
                                contadorPista = contadorPista + 1;
                                puntos_jugador = puntos_jugador - FALLO;
                                break;
                            case 1:
                                this.ofrecerNuevaPista(contadorPista);
                                contadorPista = contador + 2;
                                puntos_jugador = puntos_jugador - FALLO;
                                break;
                            case 3:
                                this.ofrecerNuevaPista(contadorPista);
                                contadorPista = contador + 1;
                                puntos_jugador = puntos_jugador - FALLO;
                                break;
                            case 4:
                                this.ofrecerNuevaPista(contadorPista);
                                contadorPista = contador + 1;
                                puntos_jugador = puntos_jugador - FALLO;
                                break;
                            case 5:
                                this.ofrecerNuevaPista(contadorPista);
                                contadorPista = contador + 1;
                                puntos_jugador = puntos_jugador - FALLO;
                                break;
                        }
                    } else {
                        puntos_jugador = acierto + puntos_jugador;
                        /* Los puntos de jugador que se suman son negativos en el if (+ * - = -) por tanto se restan */
                        System.out.println("Correcto! Tienes " + puntos_jugador + " puntos en total");

                    }
                } while (respuestacorrecta(numpregunta) == false);
                this.puntosPre3=puntos_jugador;
                break;

            case 3:

                contadorPista = 0;
                numpregunta = 3;

                pelicula = seleccionarPelicula(Catalogo);

                do {
                    System.out.println();
                    System.out.println("4. Director de la pelicula: " + pelicula.getTitulo() + " ?");

                    respuesta[numpregunta] = entrada.nextLine();

                    if (respuestacorrecta(numpregunta) == false) {

                        switch (contadorPista) {
                            case 0:
                                this.ofrecerNuevaPista(contadorPista);
                                contadorPista = contadorPista + 1;
                                puntos_jugador = puntos_jugador - FALLO;
                                break;
                            case 1:
                                this.ofrecerNuevaPista(contadorPista);
                                contadorPista = contador + 1;
                                puntos_jugador = puntos_jugador - FALLO;
                                break;
                            case 2:
                                this.ofrecerNuevaPista(contadorPista);
                                contadorPista = contador + 2;
                                puntos_jugador = puntos_jugador - FALLO;
                                break;
                            case 4:
                                this.ofrecerNuevaPista(contadorPista);
                                contadorPista = contador + 1;
                                puntos_jugador = puntos_jugador - FALLO;
                                break;
                            case 5:
                                this.ofrecerNuevaPista(contadorPista);
                                contadorPista = contador + 1;
                                puntos_jugador = puntos_jugador - FALLO;
                                break;
                        }
                    } else {
                        puntos_jugador = acierto + puntos_jugador;
                        /* Los puntos de jugador que se suman son negativos en el if (+ * - = -) por tanto se restan */
                        System.out.println("Correcto! Tienes " + puntos_jugador + " puntos en total");
                        System.out.println();

                    }
                } while (respuestacorrecta(numpregunta) == false);
                this.puntosPre4=puntos_jugador;
                break;

            case 4:

                pelicula = seleccionarPelicula(Catalogo);
                contadorPista = 0;
                numpregunta = 4;

                do {

                    System.out.println("5. Actor de la pelicula: " + pelicula.getTitulo() + " ?");
                    respuesta[numpregunta] = entrada.nextLine();

                    if (respuestacorrecta(numpregunta) == false) {

                        switch (contadorPista) {
                            case 0:
                                this.ofrecerNuevaPista(contadorPista);
                                contadorPista = contadorPista + 1;
                                puntos_jugador = puntos_jugador - FALLO;
                                break;
                            case 1:
                                this.ofrecerNuevaPista(contadorPista);
                                contadorPista = contador + 1;
                                puntos_jugador = puntos_jugador - FALLO;
                                break;
                            case 2:
                                this.ofrecerNuevaPista(contadorPista);
                                contadorPista = contador + 1;
                                puntos_jugador = puntos_jugador - FALLO;
                                break;
                            case 3:
                                this.ofrecerNuevaPista(contadorPista);
                                contadorPista = contador + 2;
                                puntos_jugador = puntos_jugador - FALLO;
                                break;
                            case 5:
                                this.ofrecerNuevaPista(contadorPista);
                                contadorPista = contador + 1;
                                puntos_jugador = puntos_jugador - FALLO;
                                break;
                        }
                    } else {
                        puntos_jugador = acierto + puntos_jugador;
                        /* Los puntos de jugador que se suman son negativos en el if (+ * - = -) por tanto se restan */
                        System.out.println("Correcto! Tienes " + puntos_jugador + " puntos en total");

                    }
                } while (respuestacorrecta(numpregunta) == false);
                
                this.puntosPre5=puntos_jugador;
                
                break;

            case 5:
                contadorPista = 0;
                numpregunta = 5;

                pelicula = seleccionarPelicula(Catalogo);

                do {
                    System.out.println();
                    System.out.println("6. Actriz de la pelicula: " + pelicula.getTitulo() + " ?");
                    respuesta[numpregunta] = entrada.nextLine();

                    if (respuestacorrecta(numpregunta) == false) {

                        switch (contadorPista) {
                            case 0:
                                this.ofrecerNuevaPista(contadorPista);
                                contadorPista = contadorPista + 1;
                                puntos_jugador = puntos_jugador - FALLO;
                                break;
                            case 1:
                                this.ofrecerNuevaPista(contadorPista);
                                contadorPista = contador + 1;
                                puntos_jugador = puntos_jugador - FALLO;
                                break;
                            case 2:
                                this.ofrecerNuevaPista(contadorPista);
                                contadorPista = contador + 1;
                                puntos_jugador = puntos_jugador - FALLO;
                                break;
                            case 3:
                                this.ofrecerNuevaPista(contadorPista);
                                contadorPista = contador + 1;
                                puntos_jugador = puntos_jugador - FALLO;
                                break;
                            case 4:
                                this.ofrecerNuevaPista(contadorPista);
                                contadorPista = contador + 1;
                                puntos_jugador = puntos_jugador - FALLO;
                                break;
                        }
                    } else {
                        puntos_jugador = acierto + puntos_jugador;
                        /* Los puntos de jugador que se suman son negativos en el if (+ * - = -) por tanto se restan */
                        System.out.println("Correcto! Tienes " + puntos_jugador + " puntos en total");

                    }
                } while (respuestacorrecta(numpregunta) == false);
                System.out.println("");
                    
                this.puntosPre6=puntos_jugador;
                break;

        }
        puntosTotales=puntosPre1+puntosPre2+puntosPre3+puntosPre4+puntosPre5+puntosPre6;
    }

    public int getPuntosPre1() {
        return this.puntosPre1;
    }

    public void setPuntosPre1(int puntosPre1) {
        this.puntosPre1 = puntosPre1;
    }

    public int getPuntosPre2() {
        return puntosPre2;
    }

    public void setPuntosPre2(int puntosPre2) {
        this.puntosPre2 = puntosPre2;
    }

    public int getPuntosPre3() {
        return puntosPre3;
    }

    public void setPuntosPre3(int puntosPre3) {
        this.puntosPre3 = puntosPre3;
    }

    public int getPuntosPre4() {
        return puntosPre4;
    }

    public void setPuntosPre4(int puntosPre4) {
        this.puntosPre4 = puntosPre4;
    }

    public int getPuntosPre5() {
        return puntosPre5;
    }

    public void setPuntosPre5(int puntosPre5) {
        this.puntosPre5 = puntosPre5;
    }

    public int getPuntosPre6() {
        return puntosPre6;
    }

    public void setPuntosPre6(int puntosPre6) {
        this.puntosPre6 = puntosPre6;
    }

    public int getPuntosTotales() {
        return this.puntosTotales;
    }

    public void setPuntosTotales(int puntosTotales) {
        this.puntosTotales = puntosTotales;
    }

    
    
    
    
    public int getFALLO() {
        return FALLO;
    }

    public void setFALLO(int FALLO) {
        this.FALLO = FALLO;
    }

    /*  
    public Pregunta(int clave1, int clave2,Peliculas Catalogo){
       
    Pregunta pre = new Pregunta(Catalogo);
       Pregunta pre1 = pre;
      // Pregunta pre2 = pre;
       
       clave1= pre.puntos_jugador;
       clave2 = pre1.puntos_jugador;
       
       puntos_jugador_1=clave1;
       puntos_jugador_2=clave2;
        
    } */
    public int getpuntos_jugador() {
        return this.puntos_jugador;
    }

    public int getpuntos_jugador_1() {
        return this.puntos_jugador_1;
    }

    public int getpuntos_jugador_2() {
        return this.puntos_jugador_2;
    }

    public int getId() {
        return this.id;
    }

    public Pelicula getPelicula() {
        return this.pelicula;
    }

    private void ofrecerNuevaPista(int contadorPista) {
        // aleatorio de 5 para los 5 datos
        // para la pista hacer un if != del numero aleatorio
        // para no soltar una pista q sea lo q este preguntando
        // titulo, año, genero, director, actor, actriz 
        String[] pista = new String[6];
        pista[0] = pelicula.getTitulo();
        pista[1] = Integer.toString(pelicula.getAno());
        pista[2] = pelicula.getGenero();
        pista[3] = pelicula.getDirector();
        pista[4] = pelicula.getActor();
        pista[5] = pelicula.getActriz();

        // int aleatorio = (int) (Math.random()*5)+1;
        switch (contadorPista) {
            case 0:
                System.out.println("Pista :" + pista[contadorPista]);
                break;
            case 1:
                System.out.println("Pista :" + pista[contadorPista]);
                break;

            case 2:
                System.out.println("Pista :" + pista[contadorPista]);
                break;
            case 3:
                System.out.println("Pista :" + pista[contadorPista]);
                break;

            case 4:
                System.out.println("Pista :" + pista[contadorPista]);
                break;

            case 5:
                System.out.println("Pista :" + pista[contadorPista]);
                break;
        }

    }

    private Pelicula seleccionarPelicula(Peliculas film) {
        int aleatorio = (int) (Math.random() * film.getCatalogo().size());
        // for(int i=0; i<film.length;i++){
        this.pelicula = (Pelicula) film.getCatalogo().get(aleatorio);
        return this.pelicula;
    }

    private boolean respuestacorrecta(int numpregunta) {
        String[] pista = new String[6];
        pista[0] = this.pelicula.getTitulo();
        pista[1] = Integer.toString(this.pelicula.getAno());
        pista[2] = this.pelicula.getGenero();
        pista[3] = this.pelicula.getDirector();
        pista[4] = this.pelicula.getActor();
        pista[5] = this.pelicula.getActriz();

        String[] respuesta = new String[6];

        if (this.respuesta[numpregunta].equals(pista[numpregunta])) {
            return true;
        } else {
            return false;
        }

    }

}
