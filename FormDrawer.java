import java.util.Scanner;

public class FormDrawer{
     public static final Scanner scnr = new Scanner(System.in);
     public static void main(String[] args){
          System.out.println("Fall 2022 - CS1083 - Section 005 - Project 2 - FormDrawer - written by Kiahna Isadore");
          System.out.println();
          getMenuSelection();
     }
     
     public static void showMenu(){ //Menu options to chose frrom
          System.out.println("Please, select one of the following options");
          System.out.println("0. Exit");
          System.out.println("1. Draw a Diamond");
          System.out.println("2. Draw a Rectangle");
          System.out.println("3. Draw a Triangle");
          System.out.println("4. Draw a Pattern");
     }
     
     public static void getMenuSelection(){
          showMenu();
          int numChoice = scnr.nextInt();
          
          /*Loop until a correct option is chosen
           * Then Method is called and back to Menu Selection
           */
         while((numChoice != 0) || (numChoice != 1) || (numChoice != 2) || (numChoice != 3) || (numChoice != 4)){
          if(numChoice == 0){
               System.out.println("Thank you for using the formDrawer program, Good bye!");
               break;
          }
          else if(numChoice == 1){
               diamond();
               getMenuSelection();
               break;
          }
          else if(numChoice == 2){
               rectangle();
               getMenuSelection();
               break;
          }
          else if(numChoice == 3){
               triangle();
               getMenuSelection();
               break;
          }
          else if(numChoice == 4){
               drawpattern();
               getMenuSelection();
               break;
          }
          else{
               System.out.println("Incorrect option, please try again");
               showMenu();
               numChoice = scnr.nextInt();
               continue;
          }
         }
     }
     
     public static void diamond(){
          System.out.println("Please write the char that you would like to be used to fill the diamond");
          char fillChar = scnr.next().charAt(0);
          System.out.println("Please write the char that you would like to be used as edge of the diamond");
          char edgeChar = scnr.next().charAt(0);
          System.out.println("What size do you want the diamond to be drawn?");
          System.out.println("Please insert an even number between 0 and 60");
          int size = scnr.nextInt();
          while((size < 0) || (size > 60) || (size % 2 != 0)){ //Validating users input between 0 and 60 and SO THAT ONLY AN EVEN NUMBER CAN BE ENTERED
               if(size < 0 || size > 60 || size % 2 != 0){
               System.out.println("Incorrect option, please, try again");
               System.out.println("What size do you want the diamond to be drawn?");
               System.out.println("Please insert an even number between 0 and 60");
               size = scnr.nextInt();
               continue;
               }
               else{
                    break;
               }
          }
          drawDiamond(fillChar, edgeChar, size); 
     }
     
     //Diamond Form
     
     public static void drawDiamond(char fillChar, char edgeChar, int size){
          for(int i = 0; i <= size; i += 2 ){ // First half of diamond and changing spaces to edgeChar input
               showCharNTimes(edgeChar, (size - i) / 2); 
               System.out.print('/');
               showCharNTimes(fillChar,i);
               System.out.print('\\');
               showCharNTimes(edgeChar, (size - i) / 2);
               System.out.println();
          }
          for(int i = size; i >= 0; i -= 2){ // Second Half of diamond
               showCharNTimes(edgeChar, (size - i) / 2);
               System.out.print('\\');
               showCharNTimes(fillChar,i);
               System.out.print('/');
               showCharNTimes(edgeChar, (size - i) / 2);
               System.out.println();
          }
     }
     
    public static void showCharNTimes(char c, int n){ // Printing out FillChar the size inputed
         for(int i = 1; i <= n; i++){
              System.out.print(c);
          }
     }
    
    //Rectangle Form
    
    public static void rectangle(){
         
         System.out.println("Please write the char you would like to be used as the contour of the rectangle");
         char fillChar = scnr.next().charAt(0);
         System.out.println("Do you want the rectangle to be printed as hollow?");
         
         char numHollow = scnr.next().charAt(0);
         boolean hollow = true;

         while(numHollow != 'Y' || numHollow != 'N'){ // Validating the user input for hollow and setting boolean to true or false

               if(numHollow == 'Y'){
                    hollow = true;
                    break;
               }
               else if(numHollow == 'N'){
                    hollow = false;
                    break;
               }
               else if(numHollow != 'Y' || numHollow != 'N'){ 
                   
                    System.out.println("Incorrect selection, please, try again");
                    System.out.println("Do you want the rectangle to be printed as hollow?");
                    numHollow = scnr.next().charAt(0);
                    continue;
               }
         }

  
              
         System.out.println("What size do you want the Rectangle to be drawn?");
         System.out.println("Please insert any number between 0 and 60");
         int size = scnr.nextInt();
         while((size < 0) || (size > 60)){ //Validating users input between 0 and 60 
               if(size < 0 || size > 60){
               System.out.println("Incorrect option, please, try again");
               System.out.println("Please insert any number between 0 and 60");
               size = scnr.nextInt();
               continue;
               }
               else{
                    break;
               }
          }
         drawRectangle(fillChar,size, hollow); //Calling drawRectangle()
         
         
    }
   public static void drawRectangle(char chr, int size, boolean hollow){
        
              drawRectangleLine(chr,size,hollow);            
}
    public static void drawRectangleLine(char chr, int size, boolean hollow){
         if (hollow == false){
         for(int i = 1; i <= size; i++){
              for(int j = 1; j <= size; j++){
                   System.out.print(chr);
              }
              System.out.println();
         }
         }
         else if(hollow == true){
              for(int i = 1; i <= size; i++){
                   for(int j = 1; j <= size ; j++){
                        if(j == 1 || j == size || i == 1 || i == size){ // this is setting 1st and last row & 1st and last char to print
                             System.out.print(chr);
                        }
                        else{
                             System.out.print(" ");
                        }
                   }
                   System.out.println();
              }
         }
    }
    
    // Triangle Form
    
    public static void triangle(){
         System.out.println("What size do you want the Traingle to be drawn?");
         System.out.println("Please insert an even number between 0 and 60");
         int size = scnr.nextInt();
         
         while((size < 0) || (size > 60) || (size % 2 != 0)){ //Validating users input between 0 and 60 and SO THAT ONLY AN EVEN NUMBER CAN BE ENTERED
               if(size < 0 || size > 60 || size % 2 != 0){
               System.out.println("Incorrect option, please, try again");
               System.out.println("What size do you want the Traingle to be drawn?");
               System.out.println("Please insert an even number between 0 and 60");
               size = scnr.nextInt();
               continue;
               }
               else{
                    break;
               }
          }
         drawTriangle(size);
    }
    
    public static void drawTriangle(int width){
         int space_out = width/2-1;
         int space_in=0;
         for(int i = 0; i < width / 2; i++){
              for(int j = 0; j < space_out; j++)
                   System.out.print(" ");
                   System.out.print("/");
                  
                   
                   for(int j = space_in; j > 0; j--)
                   System.out.print(" ");
                   System.out.print("\\");
                   System.out.println();
                   space_out--;
                   space_in += 2;
              }
              
         
         for(int i = 0; i < width; i++){
              System.out.print("-");
         }
         System.out.println();
    }
    
    // Pattern Form
    
    public static void drawpattern(){
          Scanner scnr = new Scanner(System.in);
         
        System.out.println("Input the first letter to be used in the pattern");
        System.out.println("Please input a letter between A and Z");
        
        char c1 = scnr.next().charAt(0);
        //if c1 is not between A-Z, print error message and return
        while( c1 < 'A' || c1 > 'Z'){
        if (c1 < 'A' || c1 > 'Z') {
            System.out.println("Incorrect selection, please, try again");
            System.out.println("Input the first letter to be used in the pattern");
            System.out.println("Please input a letter between A and Z");
            c1 = scnr.next().charAt(0);
        }
            else{
                 break;
            }
        }
        System.out.println("Input the second letter to be used in the pattern");
        System.out.println("Please input a letter between A and Z, and that is different from the first pattern letter (" + c1 + ")");
        char c2 = scnr.next().charAt(0);
        while(c1 > c2 || c1 == c2 || c2 < 'A' || c2 > 'Z'){
             if (c1 > c2 || c1 == c2 || c2 < 'A' || c2 > 'Z'){
            System.out.println("Incorrect selection, please, try again");
            System.out.println("Input the second letter to be used in the pattern");
            System.out.println("Please input a letter between A and Z, and that is different from the first pattern letter (" + c1 + ")");
            c2 = scnr.next().charAt(0);
            continue;
        }
        else{
             break;
        }
        }
        
        System.out.println("Do you want the pattern to be printed in ascending order? (Y/N)?");
        char order = scnr.next().charAt(0);
        //if input is not Y or N, print error message and return
        while(order != 'Y' || order != 'N'){
             if(order == 'Y' || order == 'N'){
                  break;
             }
             else if(order != 'Y' || order != 'N'){
            System.out.println("Incorrect option, please, try again");
            System.out.println("Do you want the pattern to be printed in ascending order? (Y/N)?");
            order = scnr.next().charAt(0);
            continue;
             }
        }
        drawPattern(c1, c2, order == 'Y');
    }

    public static void drawPattern(char char1, char char2, boolean ascending) {
        //check if ascending is true
        if(ascending){
             for(char i = char1; i <= char2; i++){
                  for(char j = char1; j <= i; j++){
                       System.out.print(" ");
                  }
                  for(char k = i; k <= char2; k++){
                       System.out.print(k);
                       
                  }
                  System.out.println();
             }
        }
        else{
             for(char i = char2; i >= char1; i--){
                  for(char j = char2; j >= i; j--){
                       System.out.print(" ");
                  }
                  for(char k = i; k >= char1; k--){
                       System.out.print(k);
                  }
                  System.out.println();
             }
        }
    }
}

    
    





