
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare the variable num and initializing p to 0 and declaring flag variable to store the 
	int num,i,p=0,flag;
	// loop to iterate 100 numbers
	      	 for(i=1;i<=100;i++){  
	      		 // flag variable initialized to 0
	      		 flag=0;
	      		//initializing  num to 1
	      	      num=i;
	      	      // if num vallue is greater than 1 only loop starts
	      		 while(num>=1){			 
	      	      // dividing each number by num value
	      			 p=i%num;
	      			 // if p value equals zero
	      	        if(p==0){
	      	        	//increase flag value
	      	        	flag=flag+1;
	      	        }
	      	        //decrease the num value by 1
	      	        num--;
	      	    }
	      		 //flag value equals 2 i.,e if the p value equals to 0 two times
	      	        if(flag==2)
	      	        {
	      	        	//condition true i value is printed
	      	        System.out.println(i);
	      	        }
	      	 }
	     
	      	  
	      	 }
	      }
	      
	
		
	
	


	 
	
	
