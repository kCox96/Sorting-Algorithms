import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Scanner;

/*************************************************/
/*** Simple test class for Sort class          ***/
/***                                           ***/
/*** Author: Kiana Cox   01/11/2017      ***/
/*************************************************/


public class TestSort
{
	public static void main(String[] args) 
    {
    
    
		/*create new object for each test file*/
        Sort sortTest = new Sort(100);
        Sort sortTest1 = new Sort(100);
        Sort sortTest2 = new Sort(100);
        Sort sortTest3 = new Sort(100);
        Sort sortTest4 = new Sort(100);
        
       
        /***sorting algorithm tests***/
        
      
        /** Read in test files into array **/
        sortTest.readIn("test1.txt");
        sortTest1.readIn("test2.txt");
        sortTest2.readIn("test3.txt");
        sortTest3.readIn("test4.txt");
        sortTest4.readIn("test5.txt");
        
        
        /*allows user to choose which sorting algorithm they want to use*/
        /*loop back if user enters invalid input*/
        while(true){
       try{
        	
        
        System.out.println("\n\nEnter Array sorting type: " + "\n\nEnter 1 for Insertion Sort." + "\n\nEnter 2 for Quicksort"
        + "\n\nEnter 3 for Newsort");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        
        
        
        
        
       
        /*if user chooses option 1, display insertion sort*/
        if (choice == 1) {
        /*insertion sort tests*/	
        
        	 /** Display arrays **/
            sortTest.display(10,"Input Array 1");
            sortTest1.display(10, "\n\nInput Array 2");
            sortTest2.display(10, "\n\nInput Array 3");
            sortTest3.display(10, "\n\nInput Array 4");
            sortTest4.display(10, "\n\nInput Array 5");
        
        /*apply insertion sort to arrays*/
        sortTest.insertion();
        sortTest1.insertion();
        sortTest2.insertion();
        sortTest3.insertion();
        /*additional test on insertion sort*/
        sortTest4.insertion();
        
        /*display sorted arrays and comparison counters*/
        sortTest.display(10, "\n\nInsertion sorted array test 1: ");
        System.out.println("\n\nInsertion sort comparison counter test 1: " + sortTest.compIS);
        
        sortTest1.display(10, "\n\nInsertion sorted array test 2: ");
        System.out.println("\n\nInsertion sort comparison counter test 2: " + sortTest1.compIS);
        
        sortTest2.display(10, "\n\nInsertion sorted array test 3: ");
        System.out.println("\n\nInsertion sort comparison counter test 3: " + sortTest2.compIS);
        
        sortTest3.display(10, "\n\nInsertion sorted array test 4: ");
        System.out.println("\n\nInsertion sort comparison counter test 4: " + sortTest3.compIS);
        
        /*additional test on insertion sort*/
        sortTest4.display(10, "\n\nInsertion sorted array test 5: ");
        System.out.println("\n\nInsertion sort comparison counter test 5: " + sortTest4.compIS);
        
        /*end of insertion sort comparisons*/
        }
        /*if user chooses option 2, display quicksort*/
        else if (choice == 2){
        
        /*quicksort comparisons*/
        /** Read in test files into array **/
        sortTest.readIn("test1.txt");
        sortTest1.readIn("test2.txt");
        sortTest2.readIn("test3.txt");
        sortTest3.readIn("test4.txt");
        
        /** Display arrays **/
        sortTest.display(10,"Input Array 1");
        sortTest1.display(10, "\n\nInput Array 2");
        sortTest2.display(10, "\n\nInput Array 3");
        sortTest3.display(10, "\n\nInput Array 4");
        
        
        /*apply quicksort to arrays*/
        sortTest.quick(sortTest.getLeftElement(), sortTest.getRightElement());
        sortTest1.quick(sortTest1.getLeftElement(), sortTest1.getRightElement());
        sortTest2.quick(sortTest2.getLeftElement(), sortTest2.getRightElement());
        sortTest3.quick(sortTest3.getLeftElement(), sortTest3.getRightElement());
        
        /*display sorted arrays and comparison counters*/
        sortTest.display(10, "\n\nQuicksorted array test 1: ");
        System.out.println("\n\nQuicksort comparison counter test 1: " + sortTest.compQS);
        
        sortTest1.display(10, "\n\nQuicksorted array test 2: ");
        System.out.println("\n\nQuicksort comparison counter test 2: " + sortTest1.compQS);
        
        sortTest2.display(10, "\n\nQuicksorted array test 3: ");
        System.out.println("\n\nQuicksort comparison counter test 3: " + sortTest2.compQS);
        
        sortTest3.display(10, "\n\nQuicksorted array test 4: ");
        System.out.println("\n\nQuicksort comparison counter test 4: " + sortTest3.compQS);
        
        }
        /*end of quicksort comparisons*/
        /*if user chooses option 3, display newsort*/
        else if(choice == 3){
        /*newsort comparisons*/
        /**Read in test files into array**/
        
        sortTest2.readIn("test3.txt");
        sortTest3.readIn("test4.txt");
        sortTest4.readIn("test5.txt");
        
        /** Display arrays **/
      
        sortTest2.display(10, "\n\nInput Array 3");
        sortTest3.display(10, "\n\nInput Array 4");
        sortTest4.display(10, "\n\nInput Array 5");
        
        /*apply newsort to arrays*/
        
        sortTest2.newsort();
        sortTest3.newsort();
        sortTest4.newsort();
        
        /*display sorted arrays and comparison counters*/
        
        sortTest2.display(10, "\n\nNewsorted array test 3: ");
        System.out.println("\n\nNewsort comparison counter test 3: " + sortTest2.compNewS);
        
        sortTest3.display(10, "\n\nNewsorted array test 4: ");
        System.out.println("\n\nNewsort comparison counter test 4: " + sortTest3.compNewS);
        
        sortTest4.display(10, "\n\nNewsorted array test 5: ");
        System.out.println("\n\nNewsort comparison counter test 5: " + sortTest4.compNewS);
        
        
        
        }
        
        /*end of newsort comparisons*/
        /*if user chooses integer outside option range, ask for a valid input*/
       else if (choice < 1 || choice > 3){
    	   throw new IllegalArgumentException();
        }
         break;
         
       
    	   
       }
			
        /*if user enters non-integer value, ask for valid input*/
        catch (Exception e) {
        	System.out.println("\n\nYou have entered an invalid value. You must enter an integer value between 1 and 3. Please try again.");
        	
        }
       
        	
        	}
      
    	   
       
    
}


    
    }
    
    
    
    
    
/** End of Test class **/
