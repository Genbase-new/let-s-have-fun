import java.util.Scanner;
	public class TaskThree{
	  public static void main(String[] args){
	    Scanner input= new Scanner(System.in);
	    
	 int count = 1;
	 int sum=0;
	// double average=0;
	
	 while(count<=10){
	 
	    System.out.print("Enter your scores 10 times: ");
	    int scores= input.nextInt();
	    
	    if (count%2==0){
	     
	    
	    sum +=scores;
	    count+=1;
	    }
	    
	    else{
	    
	    count+=1;
	    }
	    
	   // average=sum/count;
	    
	    
	 
	 
	 
	 }
	  
	  
	  
	  System.out.printf("Sum: %d",sum);
	  
	  
	  
	  
	  }
	
	
	
	}
