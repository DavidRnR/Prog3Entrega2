
//***********Martín, Carlos David : 31156181 - TUDAI -2017 **************************************
//****************************Programación III*****************************************************
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
			
			//Array ordenado por metodo Selección
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

			
			//**********************Conclusión*********************************************
			// El método MergeSort es mucho más eficiente cuando aumentamos el tamaño del arreglo.
			// El método de Selección tiene una complejidad O exponencial. 
			// MergeSort tiene una complejidad n logarítmica. Cuantos mas elementos tenga el arreglo mas eficiente es. 
			// Gráficamente tendrá una curva que crece rápidamente y luego crece lentamente.
		}


}