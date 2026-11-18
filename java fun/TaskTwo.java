import java.util.Scanner;
	public class TaskTwo{
	  public static void main(String[] args){
	    Scanner input= new Scanner(System.in);
	    
	 int count = 1;
	 int sum=0;
	
	 while(count<=10){
	 
	    System.out.print("Enter your scores 10 times: ");
	    int scores= input.nextInt();
	    
	    sum +=scores;
	    count+=1;
	    
	    double average=sum/count;
	    
	    
	 
	 
	 
	 }
	  
	  
	  
	  System.out.printf("Average: %f",average);
	  
	  
	  
	  
	  }
	
	
	
	
	}
