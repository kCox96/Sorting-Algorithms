import java.lang.reflect.Array;

/*************************************************/
/*** Simple test class for Sort class          ***/
/***                                           ***/
/*** Author: Jason Steggles    20/09/2017      ***/
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
        //sortTest.insertion(); 
        
        //sortTest.readIn("test1.txt");
        sortTest.quick(sortTest.getLeftElement(), sortTest.getRightElement());
        //sortTest.newSort();
        
        /** Display comparison counters **/
        System.out.println("Quicksort comparison counter: " + sortTest.compQS);
        System.out.println("\n\nInsertion sort comparison counter: " + sortTest.compIS);

        
    }

	 
    
} /** End of Test class **/
