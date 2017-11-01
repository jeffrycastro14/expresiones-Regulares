package sample.modelos;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Persona {

    public String nombre;
    public int edad;
    public String apellido;

    private static Persona[] listapersonas={
            new Persona("Jeffry","Castro",21),
            new Persona("Tulio", "Garcia", 21),
            new Persona("Oscar", "Diaz", 23),
            new Persona("Allaster", "Aragon", 24),
            new Persona("Yarince", "Padilla", 21),
            new Persona("Felix", "Peralta", 22),

    };


    public Persona(String nombre,String apellido, int edad) {
        this.nombre=nombre;
        this.edad=edad;
        this.apellido=apellido;
    }

    public static Persona buscarPorNombre(String nombre) {
        String nombr= "(?i)"; // esta linea Inicializo la expresion a utiliar que en este caso es la variable nombr de tipo String
        for (int a = 0; a < listapersonas.length; a++) { //aqui recorro con  un pequeño ciclo for el arreglo lista personas
          Pattern pa = Pattern.compile( nombr + nombre);//mientras recorro el arreglo  creo un objeto Parttern  donde me compilara de acuerdo al parametro que le mande
            // en este caso le mando nombr que ya lo tngo arriba declardo mas el nombre  de persona que lo traigo como un parametro
            /*El método pattern devuelve la expresión regular que hemos compilado, el método matcher crea un
             objeto Matcher a partir del patrón, el método split divide una cadena dada en partes que cumplan el
             patrón compilado y por último el

            */
          Matcher ma= pa.matcher(listapersonas[a].nombre + "  " + listapersonas[a].apellido+ " " + listapersonas[a].edad );// aqui recibo lo que ya traia en el
            // método matches compila una expresión regular y comprueba una cadena de caracteres contra ella.
            //Pattern para luego Validarlo en el if.
          if(ma.find()){// en esta linea evalua cada palabra y cada una las evalua por individual

              System.out.println(listapersonas[a].nombre + "  " + listapersonas[a].apellido+ " " + listapersonas[a].edad);// imprime la expresion que ya ha sido evaluada anteriormente

          }



            }


        return null;
    }

    public static Persona getPersona() {
        if (listapersonas.length > 0) {
            for (int d = 0; d < listapersonas.length; d++) {
                return listapersonas[d];
            }
        }
        return null;
    }


}
