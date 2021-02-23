package string;

public class SeparationAddition {

	public static void main(String[] args) {

   String s = "abc12ab21Hi79B";
   splitString (s); 
   
	}

	public static void splitString(String s) {
		 StringBuffer alpha = new StringBuffer(),
        		 num = new StringBuffer();
         
         for(int i = 0 ; i<=s.length(); i ++) {
        	 
        	 if(Character.isDigit(s.charAt(i))) 
        		 num.append(s.charAt(i));
        		 
        	 else if(Character.isAlphabetic(s.charAt(i)))
            	 alpha.append(s.charAt(i));
        
         }         
   	  System.out.println(num);
      System.out.println(alpha);	
	}   }
   
	
      
		

	



