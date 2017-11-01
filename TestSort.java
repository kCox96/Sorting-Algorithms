import java.lang.reflect.Array;

/*************************************************/
/*** Simple test class for Sort class          ***/
/***                                           ***/
/*** Author: Kiana Cox   01/11/2017      ***/
/*************************************************/


public class TestSort
{
	public static void main(String[] args) 
    {
        Sort sortTest = new Sort(100);
        
       
        
        /** Read in test data into array **/
        sortTest.readIn("test1.txt");
        
        /** Display array **/
        sortTest.display(10,"Input Array 1");
        
        /*apply insertion sort to array*/
        sortTest.insertion();
        /*display sorted array*/
        sortTest.display(10, "\n\nInsertion sorted array");
        
        /*read in test data into array*/
        sortTest.readIn("test1.txt");
        /*apply quicksort to array*/
        sortTest.quick(sortTest.getLeftElement(), sortTest.getRightElement());
        /*display quicksorted array*/
        sortTest.display(10, "\n\nQuicksorted array");
        
        /*read in test data into array*/
        sortTest.readIn("test1.txt");
        /*apply newsort to array*/
        sortTest.newSort();
        /*display newsorted array*/
        sortTest.display(10, "\n\nNewsorted array");
        /** Display comparison counters **/
        System.out.println("\n\nQuicksort comparison counter: " + sortTest.compQS);
        System.out.println("\n\nInsertion sort comparison counter: " + sortTest.compIS);

        
    }

	 
