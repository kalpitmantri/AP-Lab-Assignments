import java.util.Scanner;
public class Test {


	public static void main(String args[]){
	
		int stkSize;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Size of Stack : ");
		stkSize = scan.nextInt();
		myStack StackTestObject = new myStack(stkSize); 
    
		char ch;

	    do{
	
	    	System.out.println("\nStack Operations");
	
	        System.out.println("1 for Push");
	
	        System.out.println("2 for Pop");
	
	        System.out.println("3 for Top");
	
	        System.out.println("4 for checking Empty or not");
	
	        System.out.println("5 for checking Full or not");
	        
	        System.out.println("6 for Displaying Stack");
	
	        int choice = scan.nextInt();
	
	        switch (choice)
	
	        {
	
	        case 1 : 
	
	            System.out.println("Enter Element to Push : ");
	
	            try 
	
	            {
	
	            	StackTestObject.Push(scan.next());
	
	            }
	
	            catch (Exception e)
	
	            {
	
	                System.out.println("Error : " + e.getMessage());
	
	            }                         
	
	            break;                         
	
	        case 2 : 
	
	            try
	
	            {
	
	                System.out.println("Popped Element = " + StackTestObject.Pop());
	
	            }
	
	            catch (Exception e)
	
	            {
	
	                System.out.println("Error : " + e.getMessage());
	
	            }    
	
	            break;                         
	
	        case 3 :         
	
	            try
	
	            {
	
	                System.out.println("Peek Element = " + StackTestObject.Top());
	
	            }
	
	            catch (Exception e)
	
	            {
	
	                System.out.println("Error : " + e.getMessage());
	
	            }
	
	            break;                         
	
	        case 4 : 
	
	            System.out.println("Empty Status = " + StackTestObject.Isempty());
	
	            break;                
	
	        case 5 :
	
	        	try{
	        	
	        	System.out.println("Full Status = " + StackTestObject.Isfull());
	        	
	        	}
	        	catch(Exception E){
	        	
	        		System.out.println("Error : "+ E.getMessage());
	        	
	        	}
	            break;                                        
	
	        case 6 :
	        	
	        	StackTestObject.Display();
	            
	        default : 
	
	            System.out.println("Invalid Choice\nTry Again!\n ");
	
	            break;
	
	        }
	
	        System.out.println("\nDo you want to continue (Type y or n) \n");
	
	        ch = scan.next().charAt(0);
	
	
	
	    } while (ch == 'Y'|| ch == 'y');                 
	    
	    scan.close();
	
	}
	
}
