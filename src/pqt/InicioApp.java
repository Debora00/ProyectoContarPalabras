package pqt;
import java.util.Scanner;

/**
 *
 * @author debora
 */
public class InicioApp {
    /**
     *@param contador declaras el contador
     * @param letras declaras el array de letran
     * 
     */
    int [] contador;
    char [] letras;
    int palabras;
    int numCaracteresSinBlancos = 0;
    Resultados re = new Resultados();
    

    public InicioApp(){
        contador = new int[65536];
        letras = new char[65536];
        palabras = 1;
    }

    /**
     *
     * @param total es para contar el total de los caracteres
     * @return
     */
    public String textoCaracteresTotal (int total) {
        return(re.TEXTO_TOTAL_CARACTERES_SIN_BLANCOS + numCaracteresSinBlancos
            +	re.TEXTO_FINAL_TOTAL_CARACTERES_SIN_BLANCOS);
    }

    /**
     *
     * @param total
     * @return
     */
    public String textoNumeroPalabras (int total) {
        return(re.TEXTO_PALABRAS + palabras + re.TEXTO_FINAL_PALABRAS);
    }

    /**
     *
     * @param contador cuenta todos los caracteres de la frase
     * @return
     */
    public String textoTodosCaracteres (int contador[]) {
        for (int i = 0;i<letras.length;i++) { //Recorro el array y muestro todo.
            if (contador[i]>0 && letras[i] != ' ') { 
                if (contador[i]==1)
                System.out.println(re.TEXTO_LETRAS+""+letras[i]+ "-->" + contador[i] + " vez.");
                else
                System.out.println(re.TEXTO_LETRAS+""+letras[i]+ "-->" + contador[i] + " veces.");
            }
        }
        return("");
    }

    /**
     *
     * @param args
     * @param contarPalabras es para llamar a la clase.
     */
    public static void main(String[] args) { 
        Resultados re = new Resultados();
        ContarPalabras ia = new ContarPalabras(); 
        Scanner scan = new Scanner(System.in); 
        System. out.print(re.TEXTO_PEDIR_CADENA); 
        String cadena = scan.nextLine();
        System.out.println(ia.textoCaracteresTotal(ia.contarCaracteresTotal(cadena)));
        System.out.println(ia.textoNumeroPalabras(ia.contarNumeroPalabras(cadena)));
        System.out.println(ia.textoTodosCaracteres(ia.contarTodosCaracteres(cadena)));
        /*ia.mostrarResultado();*/
        scan.close();
    }
}
