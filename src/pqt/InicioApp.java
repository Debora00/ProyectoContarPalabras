package pqt;
import java.util.Scanner;

public class InicioApp {
    int [] contador;
    char [] letras;
    int palabras;
    int numCaracteresSinBlancos = 0;
    /*final String TEXTO_LETRAS= "Las letras que se repiten son:"; 
    final String TEXTO_PALABRAS= "Se han ingresado ";
    final String TEXTO_FINAL_PALABRAS= " palabras.";
    final String TEXTO_TOTAL_CARACTERES_SIN_BLANCOS= "Se han introducido un total de ";
    final String TEXTO_FINAL_TOTAL_CARACTERES_SIN_BLANCOS= " caracteres(sin contar los blancos).";
    static final String TEXTO_PEDIR_CADENA= "Introduzca un conjunto de caracteres: ";*/
    
    public InicioApp(){
        contador = new int[65536];
        letras = new char[65536];
        palabras = 1;
    }

   /* public int contarNumeroPalabras(String cadena) { char car2 = ' ';
        for (int i = 0;i<cadena.length();i++){ //recorro la cadena
            char car = cadena.charAt(i); //obtengo el valor de la posición de i en la cadena
            
            if (car == ' ' && car2!=' ') { // Aumento el contador de palabras
                palabras++;
            }
            car2 = car;
        }
        return palabras;
    }
    public int contarCaracteresTotal(String cadena){
        for (int i = 0;i<cadena.length();i++){ //recorro la cadena
            char car = cadena.charAt(i); //obtengo el valor de la posición de i en la cadena
            
            if (car != ' ')
                numCaracteresSinBlancos++; //Aumento el contador de caracteres no blancos
        }
        return numCaracteresSinBlancos;
    }

    public int[ ] contarTodosCaracteres(String cadena) { 
        for (int i = 0;i<cadena.length();i++){ //recorro la cadena
            char car = cadena.charAt(i); //obtengo el valor de la posición de i en la cadena
            int ascii = car; //
            contador[ascii]++; //añado uno al contador de ese caracter letras[ascii] = car; 
                               //copio el caracter, es innecesario, pero por claridad lo dejo
        }
        return contador;
    }*/

    public String textoCaracteresTotal (int total) {
        return(TEXTO_TOTAL_CARACTERES_SIN_BLANCOS + numCaracteresSinBlancos
            +	TEXTO_FINAL_TOTAL_CARACTERES_SIN_BLANCOS);
    }

    public String textoNumeroPalabras (int total) {
        return(TEXTO_PALABRAS + palabras + TEXTO_FINAL_PALABRAS);
    }

    public String textoTodosCaracteres (int contador[]) {
        for (int i = 0;i<letras.length;i++) { //Recorro el array y muestro todo.
            if (contador[i]>0 && letras[i] != ' ') { 
                if (contador[i]==1)
                System.out.println(TEXTO_LETRAS+""+letras[i]+ "-->" + contador[i] + " vez.");
                else
                System.out.println(TEXTO_LETRAS+""+letras[i]+ "-->" + contador[i] + " veces.");
            }
        }
        return("");
    }

    public static void main(String[] args) { 
        InicioApp ia = new InicioApp(); 
        Scanner scan = new Scanner(System.in); 
        System. out.print(TEXTO_PEDIR_CADENA); 
        String cadena = scan.nextLine();
        System.out.println(ia.textoCaracteresTotal(ia.contarCaracteresTotal(cadena)));
        System.out.println(ia.textoNumeroPalabras(ia.contarNumeroPalabras(cadena)));
        System.out.println(ia.textoTodosCaracteres(ia.contarTodosCaracteres(cadena)));
        /*ia.mostrarResultado();*/
        scan.close();
    }
}
