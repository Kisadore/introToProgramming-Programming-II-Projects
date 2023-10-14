#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include "dicegame.h"

int main(int argc, char* argv[])
{
	// Initialize the srand() to start the random generator
	srand(time(NULL));

	// Initialize the player-1 and player-2 points to 0
	int p1Points = 0;
	int p2Points = 0;

	// Initialize all other required variables
	ROUNDTYPE roundType;
	int numRounds = 0;
	int points = 0;
	int dice = 0;
	int currentRound = 1;
	int currentPlayer = (rand() % 2) + 1;


	// Ask the user for the number of rounds to run the game
	printf("Enter the number of rounds: ");
	scanf("%d", &numRounds);

	// Call printPlayerPoints() function to print the initial player points which will be 0
	printPlayerPoints(p1Points, p2Points);

	// Set up the loop to go through all the rounds one at a time
	while(currentRound <= numRounds){
		// Print round number
		printf("\n");
		printf("ROUND %d\n", currentRound);
		printf("--------\n");

		// Call the corresponding functions to get the information for this round - type, dice, point
		dice = getRandomNumber(1,6);
		roundType = getRoundType();
		points = getRoundPoints(roundType);

		// Print current player
		// Call printRoundInfo() to print the round information
		printf("Player\t: %d\n", currentPlayer);
		printRoundInfo(roundType, dice, points);
		
		// MAIN GAME LOGIC

		
		/*Success: Player-1 (odd player) is the current player and the dice rolled is odd 
		OR Player-2 (even player) is the current player and the dice rolled is even.
		Current player gains the points
		The current player’s turn continues in the next round. */
		if((currentPlayer == 1 && dice % 2 != 0) || (currentPlayer == 2 && dice % 2 == 0)){
			if(currentPlayer == 1){
				p1Points += points;
			}
			else if(currentPlayer == 2){
				p2Points += points;
			}
		}
		/*Failure: Player-1 (odd player) is the current player and the dice rolled is even 
		OR Player-2 (even player) is the current player and the dice rolled is odd.
		Current player incurs penalty of the same number of points 
		In the next round, the current player is changed to the other player.*/
		else if((currentPlayer == 1 && dice % 2 == 0)||(currentPlayer == 2 && dice % 2 != 0)){
			if(currentPlayer == 1){
				p1Points -= points;
				currentPlayer = 2;
			}
			else if(currentPlayer == 2){
				p2Points -= points;
				currentPlayer = 1;
			}
		}


		// Call printPlayerPoints() to print the player information at the end of the round
		printPlayerPoints(p1Points, p2Points);
		currentRound++;
	}
	printf("\nGAME OVER!!\n");
	// Compare the final points for player-1 and player-2
	// Print the winner as the one with higher points
	if(p1Points > p2Points){
		printf("P1 Won\n");
	}
	else if(p2Points > p1Points){
		printf("P2 Won\n");
	}
	// Return from the main() function to end the program successfully
	return 0;
}
