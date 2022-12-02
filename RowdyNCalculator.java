import java.util.Scanner;

public class RowdyNCalculator{
     public static void main(String[]args){
          Scanner scnr = new Scanner(System.in);
          
         //printing Title
          System.out.println("UTSA - FALL 2022 - CS1083 - Section 005 - RowdyNCalculator - written by Kiahna Isadore" + "\n");
          
          int opNum; //iteration number
          int numResult;
          int value1;
          int value2;
          double dValue1;
          double dValue2;
          double dNumResult;
          char dataType;
          char opSym; //operation symbol
          String opporatorSym;
          int sumResult;
          double summResult;
          double sum = 0; // This will add the sum of all calculations for the end message
               
          
          System.out.print("Please, input the number of calculations you want to perform: ");
               int numTC = scnr.nextInt();//numTC = total calculations
                
          for(opNum = 1; opNum <= numTC; opNum++){ // how many loops dependant on num of total calculations, creating loop
               //opNum = Operation Number
               System.out.println("Operation number " + opNum);
               System.out.print("Please, select your choice of datatype of operation (i-integer,d-double): "); //prompt user
               dataType = scnr.next().charAt(0); //user inputs if integer or double
               
               if((dataType != 'i')&&(dataType != 'd')){ 
                    System.out.println("Wrong datatype");
                    continue; //jumps to next iteration if dataType is anything other than i or d
               }
               
               if(dataType == 'd'){ // iterations inside loop for any double inputs
                    System.out.print("Please input the first double value: ");
                    dValue1 = scnr.nextDouble();
            
               
                    System.out.print("Please input the character of the operation (+, -, *, /, %) : ");
                    opSym = scnr.next().charAt(0);
               
                    System.out.print("Please, input the second double value: ");
                    dValue2 = scnr.nextDouble();
               
                    if(opSym == '+'){ 
                         opporatorSym = "adding "; //setting the input symbol to a string so it can be set through out the loop
                         dNumResult = dValue1 + dValue2;
                         System.out.print("The result of " + opporatorSym + dValue1 + " by " + dValue2 + " with only 3 decimals is: ");
                         System.out.printf ("%.3f", dNumResult); // will set the result to be only 3 decimal points
                         System.out.println();
                         sum = sum + dNumResult;
                    }
                    else if(opSym == '-'){
                         opporatorSym = "subtracting ";
                         dNumResult = dValue1 - dValue2;
                         System.out.print("The result of " + opporatorSym + dValue1 + " by " + dValue2 + " with only 3 decimals is: ");
                         System.out.printf ("%.3f", dNumResult);
                         System.out.println();
                         sum = sum + dNumResult;
                    }
                    else if(opSym == '/'){
                         opporatorSym = "dividing ";
                         dNumResult = dValue1 / dValue2;
                         System.out.print("The result of " + opporatorSym + dValue1 + " by " + dValue2 + " with only 3 decimals is: ");
                         System.out.printf ("%.3f", dNumResult);
                         System.out.println();
                         sum = sum + dNumResult;
                    }
                    else if (opSym == '%'){
                         opporatorSym = "modulo operation ";
                         dNumResult = dValue1 % dValue2;
                         System.out.print("The result of " + opporatorSym + " of " + dValue1 + " by " + dValue2 + " with only 3 decimals is: ");
                         System.out.printf ("%.3f", dNumResult);
                         System.out.println();
                         sum = sum + dNumResult;
                    }
                    else if(opSym == '*'){
                         opporatorSym = "multiplying ";
                         dNumResult = dValue1 * dValue2;
                         System.out.print("The result of " + opporatorSym + dValue1 + " times " + dValue2 + " with only 3 decimals is: " );
                         System.out.printf ("%.3f", dNumResult);
                         System.out.println();
                         sum = sum + dNumResult;
                    }
                    else{
                         System.out.println("Wrong datatype");
                         continue;
                    }
                    
               }
                    
                    if(dataType == 'i'){  //iterations inside loop for any integer values
               System.out.print("Please input the first integer value: ");
               value1 = scnr.nextInt();
            
               
               System.out.print("Please input the character of the operation (+, -, *, /, %) : ");
               opSym = scnr.next().charAt(0);
               
               System.out.print("Please, input the second integer value: ");
               value2 = scnr.nextInt();
               
              if(opSym == '+'){
                    opporatorSym = "adding ";
                    numResult = value1 + value2;
                    System.out.println("The result of " + opporatorSym + value1 + " by " + value2 + " is: " + numResult);
                    sum = sum + numResult;
               }
               else if(opSym == '-'){
                     opporatorSym = "subtracting ";
                     numResult = value1 -value2;
                     System.out.println("The result of " + opporatorSym + value1 + " by " + value2 + " is: " + numResult);
                     sum = sum + numResult;
               }
               else if(opSym == '/'){
                     opporatorSym = "dividing ";
                    numResult = value1 / value2;
                    System.out.println("The result of " + opporatorSym + value1 + " by " + value2 + " is: " + numResult);
                    sum = sum + numResult;
               }
               else if (opSym == '%'){
                     opporatorSym = "modulo operation ";
                    numResult = value1 % value2;
                    System.out.println("The result of " + opporatorSym + " of " + value1 + " by " + value2 + " is: " + numResult);
                    sum = sum + numResult;
               }
               else if(opSym == '*'){
                     opporatorSym = "multiplying ";
                    numResult = value1 * value2;
                    System.out.println("The result of " + opporatorSym + value1 + " times " + value2 + " is: " + numResult);
                    sum = sum + numResult;
               }
               else{
                    System.out.println("Wrong datatype");
                    continue;
               }
                    }
               
          }
          
          
          System.out.println("Thank you for using the RowdyNCalculator!");
          System.out.print("The sum of the result of all " + numTC + " operations is: ");  
          System.out.printf ("%.3f", sum); //setting the sum of all calculations to be 3 decimals
          System.out.println();
     }
}