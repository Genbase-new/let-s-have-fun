import java.util.Scanner;
	public class TaskNine{
	  public static void main(String[] args){
	    Scanner input= new Scanner(System.in);
	    
	 int count = 1;
	 int sum=0;
	double average=0;
	
	 while(count<=10){
	 
	    System.out.print("Enter your 10 scores from 0-100: ");
	    int scores= input.nextInt();
	      if(scores>0 && scores<100){
	      sum +=scores;
	      average=sum/count;
	           }
	     
	              count++;
	
	                  }
	    
	 
	 
	 
	  
	  
	 //  System.out.printf("Sum: %d",sum);
	  
	 System.out.printf("Average: %f",average);
	  
	  
	  
	  
	  }
	
	
	
	}
