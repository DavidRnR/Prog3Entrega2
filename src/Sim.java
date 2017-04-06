
//***********Mart�n, Carlos David : 31156181 - TUDAI -2017 **************************************
//****************************Programaci�n III*****************************************************
public class Sim {
	
	//**********************Main*****************************************
		public static void main(String[] args) {				
		
			 //Cargo el arreglo con valores aleatorios
			int[] arrayRamdom = new int [100];
			for (int i = 0; i < arrayRamdom.length; i++) {
				arrayRamdom[i] = (int) Math.floor(Math.random() * 101);
			}
			
			 //Copio el array. Ordeno arrayRamdom con Seleccion y arrayRamdom2 con MergeSort
			int[] arrayRamdom2 = arrayRamdom;
			
			//Array ordenado por metodo Selecci�n
			OrdSeleccion sel = new OrdSeleccion(arrayRamdom);
			
			long startTime = System.nanoTime();
			
			sel.ordenarSeleccion();
			
			long endTime = System.nanoTime();
			
			System.out.println("Seleccion sort tiempo "+(endTime - startTime) + " ns");	
			
			
			//Array ordenado por metodo MergeSort
			MergeSort merge = new MergeSort();
			
			long startTime2 = System.nanoTime();
			
			merge.sort(arrayRamdom2);
			
			long endTime2 = System.nanoTime();
			System.out.println("Merge sort tiempo "+(endTime2 - startTime2) + " ns");	

			
			//**********************Conclusi�n*********************************************
			// El m�todo MergeSort es mucho m�s eficiente cuando aumentamos el tama�o del arreglo.
			// El m�todo de Selecci�n tiene una complejidad O exponencial. 
			// MergeSort tiene una complejidad n logar�tmica. Cuantos mas elementos tenga el arreglo mas eficiente es. 
			// Gr�ficamente tendr� una curva que crece r�pidamente y luego crece lentamente.
		}


}