import java.util.*;
import java.awt.*;
import java.util.Random;
public class SyncedForms {
	//initialize global scanner
	public static final Scanner scnr = new Scanner(System.in);
	
	public static void main(String[] args) { 
		//Prints first line and calls drawSyncedForms
		System.out.println("UTSA - Fall 2022 - CS1083 - Section 005 - Project 3 - SyncedForms - written by Kiahna Isadore");
		drawSyncedForms();
	}
	public static void drawSyncedForms() { 
		//Prompts the user, calls methods, and initialize variables/arrays
		int[] xArrayPos= new int[9];
		int[] yArrayPos = new int[9];
		Color[] colorArray = new Color[9];
		DrawingPanel panel = new DrawingPanel(400,400);
		char shapeDisplay;
		int numFormsDisplay;
		
		System.out.print("What form will be shown (C-ircle, S-quare)?");
		shapeDisplay = scnr.next().charAt(0);
		
		System.out.print("How many forms you want to show (max 9)?");
		numFormsDisplay = scnr.nextInt();
	
		initialPosition(xArrayPos, yArrayPos, numFormsDisplay);
		initialColor(colorArray, numFormsDisplay);
		
		System.out.print("How many times you want the forms to move (max 500)?");
		int numMovements = scnr.nextInt();
		
		moveForms(panel,shapeDisplay, xArrayPos, yArrayPos, colorArray, numFormsDisplay, numMovements);
		
		//Showing Graphic Signature
		Graphics pen = panel.getGraphics();
		
		pen.setColor(Color.GREEN);
		pen.drawRect(20,200,360,40);
		pen.setColor(Color.BLACK);
		pen.fillRect(20,200, 360,40);
		pen.setColor(Color.GREEN);
		pen.drawString("UTSA - FALL 2022 - CS1083 - Section 005 - Project 3 -",22,215);
		pen.drawString("SyncedForms - written by Kiahna Isadore" , 22,235);
		
	}
	public static void initialPosition(int[] INITIAL_XPOSITION, int[] INITIAL_YPOSITION, int numForms) {
		//Assign x and y Positions
		Random rand = new Random();
        for (int i = 0; i < numForms; i++) {
        	int pos = rand.nextInt(9);
            
        	switch(pos) {
        	case 0:
        		INITIAL_XPOSITION[i] = 75;
        		INITIAL_YPOSITION[i] = 75;
        		break;
        	case 1:
        		INITIAL_XPOSITION[i] = 275;
        		INITIAL_YPOSITION[i] = 75;
        		break;
        	case 2:
        		INITIAL_XPOSITION[i] = 275;
        		INITIAL_YPOSITION[i] = 275;
        		break;
        	case 3:
				INITIAL_XPOSITION[i] = 75;
				INITIAL_YPOSITION[i] = 275;
				break;
        	case 4:
				INITIAL_XPOSITION[i] = 175;
				INITIAL_YPOSITION[i] = 175;
				break;
        	case 5:
				INITIAL_XPOSITION[i] = 75;
				INITIAL_YPOSITION[i] = 175;
				break;
        	case 6:
        		INITIAL_XPOSITION[i] = 275;
        		INITIAL_YPOSITION[i] = 175;
        		break;
        	case 7:
        		INITIAL_XPOSITION[i] = 175;
        		INITIAL_YPOSITION[i] = 75;
        		break;
        	default:
        		INITIAL_XPOSITION[i] = 175;
        		INITIAL_YPOSITION[i] = 275;
        		break;
        	}
        }
	}
	public static void initialColor(Color[] colorsArray, int numForms) { 
		// Assign colors for different Forms
		Random rand = new Random();
        for (int i = 0; i < numForms; i++) {
            int colorIndex = rand.nextInt(9);
            switch (colorIndex) {
                case 0:
                    colorsArray[i] = Color.GREEN;
                    break;
                case 1:
                    colorsArray[i] = Color.GRAY;
                    break;
                case 2:
                    colorsArray[i] = Color.YELLOW;
                    break;
                case 3:
                    colorsArray[i] = Color.RED;
                    break;
                case 4:
                    colorsArray[i] = Color.ORANGE;
                    break;
                case 5:
                    colorsArray[i] = Color.PINK;
                    break;
                case 6:
                    colorsArray[i] = Color.DARK_GRAY;
                    break;
                case 7:
                    colorsArray[i] = Color.BLUE;
                    break;
                case 8:
                    colorsArray[i] = Color.BLACK;
                    break;
            }
        }
    }
	public static void moveForms(DrawingPanel d, char shape, int[] xPos, int[] yPos, Color[] colorArr, int numForms, int numMovements) {
		//loop through all number of movements
		for(int j = 0; j < numForms; j++) {
			showForm(d, shape, xPos[j],yPos[j],colorArr[j], 50);
			
		}
		
		for(int i = 0; i < numMovements; i++) {
			//int nextMovements = scnr.nextInt(); Would use without Extra Credit
			Random rand = new Random();
			int nextMovements = rand.nextInt(8); // setting all movements to be random
				for(int k = 0; k < numForms; k++) {
					moveForm(xPos, yPos, k, nextMovements);
					showForm(d, shape, xPos[k],yPos[k],colorArr[k], 50);
				}
				d.sleep(50);
			}
	}
	public static void moveForm(int[] xPos, int[] yPos, int VALUE_MODIFY_FORM, int VALUE_ORIENTATION) {
		//modify x and y positions
	
		switch(VALUE_ORIENTATION) {
		case 0:
			yPos[VALUE_MODIFY_FORM] -= 25;
			break;
		case 1:
			yPos[VALUE_MODIFY_FORM] -= 25;
			xPos[VALUE_MODIFY_FORM] += 25;
			break;
		case 2:
			xPos[VALUE_MODIFY_FORM] += 25;
			break;
		case 3:
			yPos[VALUE_MODIFY_FORM] += 25;
			xPos[VALUE_MODIFY_FORM] += 25;
			break;
		case 4:
			yPos[VALUE_MODIFY_FORM] += 25;
			break;
		case 5:
			yPos[VALUE_MODIFY_FORM] += 25;
			xPos[VALUE_MODIFY_FORM] -= 25;
			break;
		case 6:
			xPos[VALUE_MODIFY_FORM] -= 25;
			break;
		case 7:
			yPos[VALUE_MODIFY_FORM] -= 25;
			xPos[VALUE_MODIFY_FORM] -= 25;
			break;
		default:
			break;
	}
}
	
	public static void showForm(DrawingPanel p, char shape, int xPos, int yPos, Color colors, int sizeForm) {
		//Display forms
		Graphics g = p.getGraphics();
		
		if(shape == 'C') {
			g.setColor(Color.BLACK);
			g.fillOval(xPos, yPos, sizeForm, sizeForm);
			g.setColor(colors);
			g.fillOval(xPos+1, yPos+1, sizeForm-2, sizeForm-2 );
		}
		else if(shape == 'S') {
			g.setColor(Color.BLACK);
			g.fillRect(xPos, yPos, sizeForm , sizeForm );
			g.setColor(colors);
			g.fillRect(xPos+1 , yPos+1, sizeForm-2, sizeForm-2);
		}
	}
	
}
