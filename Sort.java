/*****************************************************/
/*** Purpose:                                      ***/
/***                                               ***/
/***     Initial Author: Jason Steggles 20/09/17   ***/
/***     Extended by: Kiana Cox   Date   26/10/17         ***/
/*****************************************************/

import java.io.*;
import java.text.*;
import java.util.*;

public class Sort {

	/** Array of integers to sort **/
	private int[] A;

	/** Size of the array **/
	private int size;

	/** Number of elements actually used in array **/
	private int usedSize;

	/** Global variables for counting sort comparisons **/
	public int compIS;
	/** Global comparison count for Insertion Sort **/
	public int compQS;
	/** Global comparison count for Quicksort **/
	public int compNewS;

	/** Global comparison count for new sort **/

	/*****************/
	/** Constructor **/
	/*****************/
	Sort(int max) {
		/** Initialiase global sort count variables **/
		compIS = 0;
		compQS = 0;
		compNewS = 0;

		/** Initialise size variables **/
		usedSize = 0;
		size = max;

		/** Create Array of Integers **/
		A = new int[size];
	}

	public int getRightElement() {
		return usedSize - 1;
	}

	public int getLeftElement() {
		return 0;
	}

	/*********************************************/
	/*** Read a file of integers into an array ***/
	/*********************************************/
	public void readIn(String file) {
		try {
			/** Initialise loop variable **/
			usedSize = 0;

			/** Set up file for reading **/
			FileReader reader = new FileReader(file);
			Scanner in = new Scanner(reader);

			/** Loop round reading in data while array not full **/
			while (in.hasNextInt() && (usedSize < size)) {
				A[usedSize] = in.nextInt();
				usedSize++;
			}

		} catch (IOException e) {
			System.out.println("Error processing file " + file);
		}
	}

	/**********************/
	/*** Display array ***/
	/**********************/
	public void display(int line, String header) {
		/*** Integer Formatter - three digits ***/
		NumberFormat FI = NumberFormat.getInstance();
		FI.setMinimumIntegerDigits(3);

		/** Print header string **/
		System.out.print("\n" + header);

		/** Display array data **/
		for (int i = 0; i < usedSize; i++) {
			/** Check if new line is needed **/
			if (i % line == 0) {
				System.out.println();
			}

			/**
			 * Display an ar ray element
			 **/
			System.out.print(FI.format(A[i]) + " ");
		}
	}

	/* Sort array using insertion sort */

	public void insertion() {
		/* loop through array */
		for (int i = 1; i < usedSize; i++) {

			/* store the next value to insert into array */
			int key = A[i];
			/* current index to try */
			int j = i;

			/* check to ensure that the value does not drop off the array */
			while ((j > 0) && (key < A[j - 1])) {
				/* find correct position for key */
				A[j] = A[j - 1];
				j = j - 1;
				/* increase counter variable with each comparison */
				compIS++;
			}
			/* insert key into correct space */
			A[j] = key;

		}
		/* catch last comparison as method exits while loop */
		compIS++;
		/* print out sorted array */
		System.out.println("\n\nAfter Insertion Sort: ");
		for (int k = 0; k < usedSize; k++) {
			System.out.println(A[k] + " ");

		}

	}

	/* Sort array using quicksort */
	public void quick(int L, int R) {
		/* ensure there is more than one element in array */
		if (R > L) {
			/* split array in two */
			int pLoc = partition(L, R);
			/* sort left half */
		    quick(L, pLoc - 1);
		    
			/* sort right half */
			quick(pLoc +1, R);
			//pLoc++;
		
		}
		//System.out.println("\n\nAfter  QuickSort: ");
		//for (int i = 0; i < usedSize; i++) {
			//System.out.println(A[i] + " ");
		}
	

	   
	    
	
	//}

	/* partitions array for quicksort */
	public int partition(int L, int R) {
		/* Select pivot */
		int pivot = A[R];
		/* initialise scanning pointers */
		
		int pR = R;
		int pL = L;
		/* repeat until pointers cross */
		while (pL < pR) {
			compQS++;
			/* move left pointer */
			while (A[pL] < pivot) {
				pL++;
			}
			/* move right pointer */
			while ((A[pR] >= pivot) && (pR > L)) {
				pR--;
				//compQS++;
			}
			/* swap elements */
			//compQS++;
			if (pL < pR) {
				swap(pL, pR);
				 //L++;
				 //R--;
			}
		}
		
	 
		/* put pivot in correct position */
		swap(pL, R);
		/* return pivot position */
		return pL;
		
	}

	/* swaps elements in quicksort */
	public void swap(int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
	
	public void newSort() {
		int position = 0;
		while (position < usedSize) {
			int min = findMinFrom(position);
			for (int i = position; i < usedSize;) {

				if (A[i] == min) {
					swap(A[i], position);
					position = position+1;
				}
			}
		}
		System.out.println("\n\nAfter newsort: ");
		for (int i = 0; i < usedSize; i++) {
			System.out.println(A[i] + " ");
		}
	}

	public int findMinFrom( int position) {
		int min = A[position];
		for (int i = position; i< usedSize;){
			if(A[i]<min){
				min = A[i];
			}
		}
		return min;
		
	}
	
	
				
			
		}
	



/** End of Sort Class **/
