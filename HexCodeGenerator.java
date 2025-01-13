import java.util.Scanner;
import java.lang.*;

public class HexCodeGenerator
  {
    // initialise array for input
    private static int [] arr = new int[3];
    
        public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          StringBuilder sb = new StringBuilder();
          
          // add hashtag to beginning of the string
          sb.append("#");

          // populate array with input, if integer is under 9, can be added to string
          int x = 0;
          while(x != 3){
              arr[x] = sc.nextLine();
              if(arr[x] > 9)
                // call hexer method to convert to hexcode
                {
                  sb.append(hexer(arr[x]));
                }
              else{
                  sb.append("0" + arr[x]);
                }
              x++;
              }
        System.out.println(sb);
          
          // figures out and returns hex
          public static String hexer(int base10){
              // get first remainder and convert
            int divA = base10 % 16;
            String strA = "";
              if(divA > 9)
                {
                  switch(divA){
                    case 10:
                      strA = "a";
                      break;
                    case 11:
                      strA = "b";
                      break;
                    case 12:
                      strA = "c";
                      break;
                    case 13:
                      strA = "d";
                      break;
                    case 14:
                      strA = "e";
                      break;
                    case 15:
                      strA = "f";
                      break;
                  }
                }
              else{
                  strA = String.valueOf(divA);
                }

            // get what is left and convert
            int divB = base10 / 16;
            String strB = "";
              if(divB > 9)
                {
                  switch(divB){
                    case 10:
                      strB = "a";
                      break;
                    case 11:
                      strB = "b";
                      break;
                    case 12:
                      strB = "c";
                      break;
                    case 13:
                      strB = "d";
                      break;
                    case 14:
                      strB = "e";
                      break;
                    case 15:
                      strB = "f";
                      break;
                  }
                }
              else{
                  strB = String.valueOf(divB);
                }
            String hexVal = strB + strA;
            return hexVal;
              }
          sc.close();
      }
    }
