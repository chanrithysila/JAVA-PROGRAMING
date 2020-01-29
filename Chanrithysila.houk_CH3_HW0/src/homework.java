
public class homework {
public static void main(String[] args) {
		
		
		// 1.	Given a string of even length, return the first half. 
		String main_string = "1234";
		String first_string = "programing";
		String before_string = "homework";
		String pre_string = "marker";
		System.out.println(main_string.substring(0,main_string.length()/2) + " is the first half of 1234.");
		System.out.println(first_string.substring(0,first_string.length()/2) + " is the first half of programing.");
		System.out.println(before_string.substring(0,before_string.length()/2) + " is the first half of homework.");
		System.out.println(pre_string.substring(0,pre_string.length()/2) + " is the first half of marker.");

        
        
        
        //2.	Make the last three digit of the string into upper case letter. 
        String s1="welcome";
        String first = s1.substring(0,1);
        String middle = s1.substring(1,s1.length()-3);
        String last = s1.substring((s1.length()-3),s1.length()).toUpperCase();
        String upperCase =first + middle + last;  
        System.out.println("From " + s1 + " to " + upperCase);
      
      
        
        //3. check the last digit of this string
      String digit = "www.google.com/";

      if (digit.contains("/")) {
          System.out.println("www.google.com/wep2020");
      } else if(digit.contains("")){
          System.out.println("this string doesn’t end with /");
      }
      
      
      
      //4. Count how many letter ‘o’ in the sentence
      String sentence = "this is the most common way.";
      
      int count = 0;
      char phrase = 'o';
      for(int a = 0; a <sentence.length(); a++){
        if(sentence.charAt(a) == phrase){
          count++;
        }
      }
      System.out.println("There are "+ count + " letter o in this is the most common way.");
      
      
      
      //5.  Replace all the words string to STRING.
      	String replace="This is the most common way of creating string.";  
		String replaceString=replace.replaceAll("string","STRING");  
		System.out.println(replaceString); 
    }
}
