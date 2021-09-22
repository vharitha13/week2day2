package week2Day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		String[] split = text.split(" ");
		for (int i = 0; i < split.length; i++) {
			for (int j = i + 1; j < split.length; j++) {
				if (split[i].equals(split[j])) {
					count = count + 1;
					if (count > 1) {
						split[i] = "";
					}
				}
			}
		}
		for (int k = 0; k < split.length; k++) {
				System.out.print(" "+split[k]);
		}
	}
}
		/*String input="We learn java basics as part of java sessions in java week1";     //String to be inputted according to user  
	    String[] split=input.split(" ");  //Splitting every word in the sentence with the help of spaces
	    for(int i=0;i<split.length;i++)    //Outer loop for Comparison and to check if sentence is empty or not    
	    {
	      if(split[i]!=null)
	      {
	      
	      for(int j=i+1;j<split.length;j++)          //Inner loop to compare two words in a sentence to check for duplicacy
	      {
	        
	      if(split[i].equals(split[j]))          //Checking if both the compared strings are equal
	        {
	          split[j]=null;      //Deletes the duplicate words if the compared strings are equal
	        }
	      }
	      }
	    }
	    for(int k=0;k<split.length;k++)    //Displaying the String without the duplicate words  
	    {
	      if(split[k]!=null)
	      {
	        System.out.print(split[k] + " ");
	      }
	      
	    }  
	}
}*/
