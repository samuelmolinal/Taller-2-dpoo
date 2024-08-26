package uniandes.dpoo.estructuras.logica;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.Collections;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre arreglos de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos arregloEnteros y arregloCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre arreglos (ie., no haga cosas como construir listas para evitar la manipulación de arreglos).
 */
public class SandboxArreglos
{
    /**
     * Un arreglo de enteros para realizar varias de las siguientes operaciones.
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private int[] arregloEnteros;

    /**
     * Un arreglo de cadenas para realizar varias de las siguientes operaciones
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private String[] arregloCadenas;

    /**
     * Crea una nueva instancia de la clase con los dos arreglos inicializados pero vacíos (tamaño 0)
     */
    public SandboxArreglos( )
    {
        arregloEnteros = new int[]{};
        arregloCadenas = new String[]{};
    }

    /**
     * Retorna una copia del arreglo de enteros, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de enteros
     */
    public int[] getCopiaEnteros( )
    {
        return this.arregloEnteros.clone();
    }

    /**
     * Retorna una copia del arreglo de cadenas, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de cadenas
     */
    public String[] getCopiaCadenas( )
    {
        return this.arregloCadenas.clone();
    }

    /**
     * Retorna la cantidad de valores en el arreglo de enteros
     * @return
     */
    public int getCantidadEnteros( )
    {
        if (this.arregloEnteros == null) {
        	return 0;
        }
    	return this.arregloEnteros.length;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de cadenas
     * @return
     */
    public int getCantidadCadenas( )
    {
    	if (this.arregloCadenas == null) {
        	return 0;
        }
    	return this.arregloCadenas.length;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param entero El valor que se va a agregar.
     */
    public void agregarEntero( int entero )
    {
        int[] arregloNuevo = new int[this.arregloEnteros.length + 1];
        for (int i = 0; i < this.arregloEnteros.length; i++) {
        	arregloNuevo[i] = this.arregloEnteros[i];
        }
        arregloNuevo[arregloNuevo.length - 1] = entero;
        this.arregloEnteros = arregloNuevo;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena )
    {
    	String[] arregloNuevo = new String[this.arregloCadenas.length + 1];
        for (int i = 0; i < this.arregloCadenas.length; i++) {
        	arregloNuevo[i] = this.arregloCadenas[i];
        }
        arregloNuevo[arregloNuevo.length - 1] = cadena;
        this.arregloCadenas = arregloNuevo;
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de enteros
     * @param valor El valor que se va eliminar
     */
    public void eliminarEntero( int valor )
    {
   
    	int conteo = 0;
    	for (int i = 0; i < this.arregloEnteros.length; i++){	
    		if (this.arregloEnteros[i] != valor) {
    			conteo++;
    		}
    		
    	}
    	int[] arregloNuevo = new int[conteo];
    	int indice = 0;
    	for (int i = 0; i < this.arregloEnteros.length; i++){	
    		if (this.arregloEnteros[i] != valor) {
    			arregloNuevo[indice] = this.arregloEnteros[i];
    			indice++;
    		}
    		
    	}
    	this.arregloEnteros = arregloNuevo;
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena )
    {
    	int conteo = 0;
    	for (int i = 0; i < this.arregloCadenas.length; i++){	
    		if (this.arregloCadenas[i] != cadena) {
    			conteo++;
    		}
    		
    	}
    	String[] arregloNuevo = new String[conteo];
    	int indice = 0;
    	for (int i = 0; i < this.arregloCadenas.length; i++){	
    		if (this.arregloCadenas[i] != cadena) {
    			arregloNuevo[indice] = this.arregloCadenas[i];
    			indice++;
    		}
    		
    	}
    	this.arregloCadenas = arregloNuevo;
    }

    /**
     * Inserta un nuevo entero en el arreglo de enteros.
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posición donde debe quedar el nuevo valor en el arreglo aumentado. Si la posición es menor a 0, se inserta el valor en la primera posición. Si la
     *        posición es mayor que el tamaño del arreglo, se inserta el valor en la última posición.
     */
    public void insertarEntero( int entero, int posicion )
    {
    	int[] nuevoArreglo = new int[this.arregloEnteros.length+1];
    	if (posicion <= 0) {
    		posicion = 0;
    		nuevoArreglo[0] = entero;
    		for (int i = 0; i < this.arregloEnteros.length; i++) {
    			nuevoArreglo[i+1] = this.arregloEnteros[i];
    		}
    	}
    	else if (posicion >= this.arregloEnteros.length-1) {
    		posicion = this.arregloEnteros.length-1;
    		nuevoArreglo[nuevoArreglo.length-1] = entero;
    		for (int i = 0; i < this.arregloEnteros.length; i++) {
    			nuevoArreglo[i] = this.arregloEnteros[i];
    			
    		}
    	}
    	else {
    		nuevoArreglo[posicion] = entero;
    		for (int i = 0; i < this.arregloEnteros.length; i++) {
    			nuevoArreglo[i+1] = this.arregloEnteros[i];
    			if (i < posicion) {
    				nuevoArreglo[i] = this.arregloEnteros[i];
    			}
    			else {
    				nuevoArreglo[i+1] = this.arregloEnteros[i];
    			}
    		}
    		
    	}
    	this.arregloEnteros = nuevoArreglo;
    }

    /**
     * Elimina un valor del arreglo de enteros dada su posición.
     * @param posicion La posición donde está el elemento que debe ser eliminado. Si el parámetro posicion no corresponde a ninguna posición del arreglo de enteros, el método
     *        no debe hacer nada.
     */
    public void eliminarEnteroPorPosicion( int posicion )
    {
    	if (posicion >= 0 && posicion <= this.arregloEnteros.length-1) {
    		int[] arregloNuevo = new int[this.arregloEnteros.length-1];
    		int indice = 0;
    		for (int i = 0; i < this.arregloEnteros.length; i++) {
    			if (i != posicion) {
    				arregloNuevo[indice] = this.arregloEnteros[i];
    				indice++;
    			}
    			
    		}
    		this.arregloEnteros = arregloNuevo;
    	}
    }

    /**
     * Reinicia el arreglo de enteros con los valores contenidos en el arreglo del parámetro 'valores' truncados.
     * 
     * Es decir que si el valor fuera 3.67, en el nuevo arreglo de enteros debería quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */
    public void reiniciarArregloEnteros( double[] valores )
    {
    	if (this.arregloEnteros == null || this.arregloEnteros.length != valores.length) {
            this.arregloEnteros = new int[valores.length];
        }

        for (int i = 0; i < valores.length; i++) {
            this.arregloEnteros[i] = (int) valores[i];
        }
    }

    /**
     * Reinicia el arreglo de cadenas con las representaciones como Strings de los objetos contenidos en el arreglo del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Un arreglo de objetos
     */
    public void reiniciarArregloCadenas( Object[] objetos )
    {
    	if (this.arregloCadenas == null || this.arregloCadenas.length != objetos.length) {
            this.arregloCadenas = new String[objetos.length];
        }

        for (int i = 0; i < objetos.length; i++) {
            this.arregloCadenas[i] = objetos[i] != null ? objetos[i].toString() : "null";
        }
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posición había un valor negativo, después de ejecutar el método debe quedar el mismo valor muliplicado por -1.
     */
    public void volverPositivos( )
    {
    	for (int i = 0; i < this.arregloEnteros.length; i++) {
    		if (this.arregloEnteros[i] < 0) {
    			this.arregloEnteros[i] = this.arregloEnteros[i]* -1;
    		}
		}
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores queden organizados de menor a mayor.
     */
    public void organizarEnteros( )
    {
    	int[] arregloNuevo = new int[0];
    	Arrays.sort(this.arregloEnteros);
    	arregloNuevo = this.arregloEnteros;
    }

    /**
     * Modifica el arreglo de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas( )
    {
    	String[] arregloNuevo = new String[0];
    	Arrays.sort(this.arregloCadenas);
    	arregloNuevo = this.arregloCadenas;
    }

    /**
     * Cuenta cuántas veces aparece el valor recibido por parámetro en el arreglo de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    public int contarApariciones( int valor )
    {
    	int conteo = 0;
    	for (int i = 0; i < this.arregloEnteros.length; i++){	
    		if (this.arregloEnteros[i] == valor) {
    			conteo++;
    		}
    		
    	}
    	return conteo;
    	
    }

    /**
     * Cuenta cuántas veces aparece la cadena recibida por parámetro en el arreglo de cadenas.
     * 
     * La búsqueda no debe diferenciar entre mayúsculas y minúsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */
    public int contarApariciones( String cadena )
    {
    	String cadenaMin = cadena.toLowerCase();
        int conteo = 0;
        for (String cadenas : arregloCadenas) {
            if (cadenas.toLowerCase().equals(cadenaMin)) {
                conteo++;
            }
        }
        return conteo;
    }

    /**
     * Busca en qué posiciones del arreglo de enteros se encuentra el valor que se recibe en el parámetro
     * @param valor El valor que se debe buscar
     * @return Un arreglo con los números de las posiciones del arreglo de enteros en las que se encuentra el valor buscado. Si el valor no se encuentra, el arreglo retornado
     *         es de tamaño 0.
     */
    public int[] buscarEntero( int valor )
    {
    	int conteo = 0;
    	for (int i = 0; i < this.arregloEnteros.length; i++){	
    		if (this.arregloEnteros[i] == valor) {
    			conteo++;
    		}
    		
    	}
    	if (conteo == 0) {
    		int[] arregloNuevo = new int[0];
    		return arregloNuevo;
    	}
    	else {
    		int[] arregloNuevo = new int[conteo];
    		int indice = 0;
    		for (int i = 0; i < this.arregloEnteros.length; i++){	
        		if (this.arregloEnteros[i] == valor) {
        			arregloNuevo[indice] = i;
        			indice++;
        		}
        		
        	}
    		return arregloNuevo;
    		
    	}
    }

    /**
     * Calcula cuál es el rango de los enteros (el valor mínimo y el máximo).
     * @return Un arreglo con dos posiciones: en la primera posición, debe estar el valor mínimo en el arreglo de enteros; en la segunda posición, debe estar el valor máximo
     *         en el arreglo de enteros. Si el arreglo está vacío, debe retornar un arreglo vacío.
     */
    public int[] calcularRangoEnteros( )
    {
        if (this.arregloEnteros.length == 0) {
        	int[] arregloNuevo = new int[0];
        	return arregloNuevo;
        }
        else {
        	int[] arregloNuevo = new int[2];
        	int minimo = 0;
        	int maximo = 0;
        	for (int i = 0; i < this.arregloEnteros.length; i++){	
        		if (this.arregloEnteros[i] > maximo) {
        			maximo = this.arregloEnteros[i];
        		}
        		
        	}
        	minimo = maximo;
        	for (int i = 0; i < this.arregloEnteros.length; i++){	
        		if (this.arregloEnteros[i] < minimo) {
        			minimo = this.arregloEnteros[i];
        		}
        		
        	}
        	arregloNuevo[0] = minimo;
        	arregloNuevo[1] = maximo;
        	return arregloNuevo;
        	
        }
    }

    /**
     * Calcula un histograma de los valores del arreglo de enteros y lo devuelve como un mapa donde las llaves son los valores del arreglo y los valores son la cantidad de
     * veces que aparece cada uno en el arreglo de enteros.
     * @return Un mapa con el histograma de valores.
     */
    public HashMap<Integer, Integer> calcularHistograma( )
    {
        HashMap<Integer, Integer> histograma = new HashMap<>();
        for (int valor : this.arregloEnteros) {
            if (histograma.containsKey(valor)) {
                histograma.put(valor, histograma.get(valor) + 1);
            } else {
            	
                histograma.put(valor, 1);
            }
        }
        return histograma;
    }

    /**
     * Cuenta cuántos valores dentro del arreglo de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos( )
    {
    	HashMap<Integer, Integer> histograma = this.calcularHistograma();
    	int conteo = 0;
    	
    	for (Map.Entry<Integer, Integer> entrada: histograma.entrySet()){	
    		Integer llave = entrada.getKey();
    		Integer valor = entrada.getValue();
    		if (valor > 1) {
    			conteo++;
    		}
    	}
        return conteo;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica si son iguales, es decir que contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los arreglos son idénticos y false de lo contrario
     */
    public boolean compararArregloEnteros( int[] otroArreglo )
    {
        if (this.arregloEnteros.length != otroArreglo.length) {
        	return false;
        }
        else {
        	for (int i = 0; i < this.arregloEnteros.length; i++){	
        		if (this.arregloEnteros[i] != otroArreglo[i]) {
        			return false;
        		}
        		
        	}
        	return true;
        }
 
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica que tengan los mismos elementos, aunque podría ser en otro orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos en los dos arreglos son los mismos
     */
    public boolean mismosEnteros( int[] otroArreglo )
    {
    	HashMap<Integer, Integer> histograma = new HashMap<>();
        for (int i = 0; i < this.arregloEnteros.length; i++){	
    		if (histograma.containsKey(this.arregloEnteros[i])) {
    			histograma.put(this.arregloEnteros[i], histograma.get(this.arregloEnteros[i]+1));
    			
    		}
    		else {
    			histograma.put(this.arregloEnteros[i], 1);
    			
    		}
    		
    	}
        
        HashMap<Integer, Integer> histogramaOtroArreglo = new HashMap<>();
        for (int i = 0; i < otroArreglo.length; i++){	
    		if (histogramaOtroArreglo.containsKey(otroArreglo[i])) {
    			histogramaOtroArreglo.put(otroArreglo[i], histograma.get(otroArreglo[i]+1));
    			
    		}
    		else {
    			histogramaOtroArreglo.put(otroArreglo[i], 1);
    			
    		}
    		
    	}
        for (int i = 0; i < otroArreglo.length; i++){	
        	if (!histograma.containsKey(otroArreglo[i])) {
        		return false;
        	}    	
        }
        
        for (int i = 0; i < this.arregloEnteros.length; i++){	
        	if (!histogramaOtroArreglo.containsKey(this.arregloEnteros[i])) {
        		return false;
        	}    	
        }
        
        return true;
        
        
        
    }

    /**
     * Cambia los elementos del arreglo de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en el arreglo deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en el arreglo
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros( int cantidad, int minimo, int maximo )
    {
        this.arregloEnteros = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            this.arregloEnteros[i] = (int) (Math.random() * (maximo - minimo + 1)) + minimo;
        }
    }

}
