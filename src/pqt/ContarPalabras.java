package pqt;

public class ContarPalabras extends InicioApp{
        public int contarNumeroPalabras(String cadena) { char car2 = ' ';
        for (int i = 0;i<cadena.length();i++){ //recorro la cadena
            char car = cadena.charAt(i); //obtengo el valor de la posición de i en la cadena
            
            if (car == ' ' && car2!=' ') { // Aumento el contador de palabras
                palabras++;
            }
            car2 = car;
        }
        return palabras
                ;
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
    }        
}


