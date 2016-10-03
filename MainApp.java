import java.util.Random;
import java.util.Scanner;


public class MainApp {

	public static void main(String[] args) {
		
		
				
				// =======================PROMPT TO USER INSERT N items =========================
				System.out.println("Please give the number of items (N): ");
				Scanner scnr = new Scanner(System.in);
				int N = scnr.nextInt();
				scnr.close();
				
				// Make random object.
				Random rand = new Random();
				
				//Make objects
				 BubbleSort bub = new BubbleSort();
				 InsertionSort ins = new InsertionSort();
				 HeapSort heap = new HeapSort();
				 
				
				
				//===================== ARRAYS DECLARATION ============================
				int arrayOriginal[] = new int[N];
				int arrayBubble[] = new int[N];
				int arrayInsertion[] = new int[N];
				int arrayHeap[] = new int[N];
				
				
				
//				long initialTimeArrayIns = System.currentTimeMillis();
				
				
				/*========== INSERT N RANDOMIZED INTEGERS AT ORIGINAL ARRAY ==========*/
				for(int i = 0; i <arrayOriginal.length; i++){
					int x = rand.nextInt(N)+1;
					arrayOriginal[i] = x;
//					System.out.println("print arrayOriginal["+i+"]---->" +arrayOriginal[i]);
				} // end for loop.
//				System.out.println("\n");
				
				
				
				// */=================== MAKE THREE IDENTICAL COPIES OF OriginalArray =================*/
				
				
				
				//Bubble Sort Array Copy
				 System.arraycopy(arrayOriginal, 0, arrayBubble, 0, N);
				 
				//Insertion Sort Array Copy
				 System.arraycopy(arrayOriginal, 0, arrayInsertion, 0, N);
				 
				//Insertion Sort Array Copy
				 System.arraycopy(arrayOriginal, 0, arrayHeap, 0, N);
				 
				 
				 
				 //TESTING BEFORE SORTING
				 	/*for(int j = 0; j<arrayBubble.length; j++){
					 
					 System.out.println("print bubbleArray: " +arrayBubble[j]);
				 	}
				 	
				 	System.out.println("\n");
				 
				 	for(int j = 0; j<arrayInsertion.length; j++){
						 
						 System.out.println("print InsertionArray: " +arrayInsertion[j]);
					 }
				 	
				 	System.out.println("\n");
				 	
				 	for(int j = 0; j<arrayHeap.length; j++){
						 
						 System.out.println("print HeapArray: " +arrayHeap[j]);
					 }
				 	
				 	System.out.println("\n");*/
				 
				 
				 
				 
				 //================================= SORTING AND TIMING ===========================
				 
				 
				 //====================== BUBBLESORT ================
				 
				 long initBubTime = System.currentTimeMillis();
				 //Bubble Sort
				  bub.bubbleSort(arrayBubble);
				  long finalBubTime = System.currentTimeMillis();
				  
				  long bubbleSortTime = finalBubTime - initBubTime; 
				 
				  
				//====================== INSERTIONSORT ================
				  
				  long initInsTime = System.currentTimeMillis();
				 //Insertion Sort
				  ins.insertionSort(arrayInsertion);
				  long finalInsTime = System.currentTimeMillis();
				  
				  long insertionSortTime = finalInsTime - initInsTime;
				  
				  
				//====================== HEAPSORT ================
				  long initHeapTime = System.currentTimeMillis();
				 //Heap Sort
				  heap.heapSort(arrayHeap);
				  long finalHeapTime = System.currentTimeMillis();
				  
				  long heapSortTime = finalHeapTime - initHeapTime;
				 
				  
				  
				  
				  // =============================== PRINT RESULTS ============================================
				  
				  System.out.println("INPUT                                     TIME TAKEN");
				  System.out.println(N +" elements   :  BubbleSort    took   "+bubbleSortTime+" miliseconds");
				  System.out.println(N +" elements   :  InsertionSort took   "+insertionSortTime+" miliseconds");
				  System.out.println(N +" elements   :  HeapSort      took   "+heapSortTime+" miliseconds");
				  
				 
				 /*//TESTING AFTER SORTING
				 for(int j = 0; j<arrayBubble.length; j++){
					 
					 System.out.println("print bubbleArraySORTED: " +arrayBubble[j]);
				 }
				 System.out.println("\n");
				 
				 for(int j = 0; j<arrayInsertion.length; j++){
					 
					 System.out.println("print InsertionArraySORTED: " +arrayInsertion[j]);
				 }
				 
				 System.out.println("\n");
				 
				 for(int j = 0; j<arrayHeap.length; j++){
					 
					 System.out.println("print HeapArraySORTED: " +arrayHeap[j]);
				 }
				 
				 System.out.println("\n");*/
				 
				 
	} //end main

} //end class
