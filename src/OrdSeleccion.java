public class OrdSeleccion {
	int[] intArray;

	public OrdSeleccion(int _array[]){
		intArray = _array;
	}

	/**
	 * Imprimir Array
	 * @return
	 */
	public String imprimirArr () {
		String s = "";
		for (int i = 0; i < intArray.length; i++) {
			s += intArray[i] + " ";
		}

		return s;
	}

	/**
	 * Ordena el arreglo por el metodo Seleccion
	 */
	public void ordenarSeleccion() {
		for (int i = 0; i < intArray.length-1; i++) {
			int aux = i;
			for (int j = i+1; j < intArray.length; j++) {				
				if (intArray[j] < intArray[aux]) {
					aux = j;
				}
			}
			int aux2 = intArray[i];
			intArray[i] = intArray[aux];
			intArray[aux] = aux2;
		} 
	}
}