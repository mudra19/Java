import java.util.*; 
import java.io.*;

class Signity {

  public static String FindIntersection(String[] strArr) {
    // code goes here  


    String[] first= strArr[0].split(",");
   
    String[] second =strArr[1].split(",");
    StringBuffer output = new StringBuffer();
    for(int i=0;i<=first.length-1;i++){

      for(int j=0;j<=second.length -1;j++)
      {
    	  if(Integer.parseInt(second[j].trim()) > Integer.parseInt(first[i].trim())) {
    		  break;
    	  }

      if((first[i]).equals(second[j]))
      {
        output.append(first[i]);
        break;
      }

      }
    }

    return output.toString();
  }

  public static void main (String[] args) {  
   
  String str=  FindIntersection(new String[] {"1, 3, 9, 10, 17, 18", "1, 4, 9, 10"});
  System.out.println(str);
    


  }

}