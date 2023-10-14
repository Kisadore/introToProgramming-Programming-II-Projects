#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include "dicegame.h"

void printPlayerPoints(int p1, int p2){
    printf("P1\t: %d\n", p1);
    printf("P2\t: %d\n", p2);

}

int getRandomNumber(int min, int max){
    int totNum = (max - min) + 1;
    return (rand() % totNum) + min; 
}

ROUNDTYPE getRoundType(){
    int ranNum = getRandomNumber(0,9);
    if(ranNum < 2){
        return BONUS;
    }
    else if(ranNum < 5){
        return REGULAR;
    }
    else{
        return DOUBLE;
    }
}

int getRoundPoints(ROUNDTYPE roundType){
    int points = 0;
    switch(roundType){
        case BONUS:
            points = 200;
            break;
        case REGULAR:
            points = 10 * getRandomNumber(1, 10);
            break;
        case DOUBLE:
            points = 20 * getRandomNumber(1, 10);
            break;
    }
    return points;
}

void printRoundInfo(ROUNDTYPE t, int dice, int points){
    switch(t){
        case BONUS:
            printf("Type\t: BONUS\n");
            break;
        case REGULAR:
            printf("Type\t: REGULAR\n");
            break;
        case DOUBLE:
            printf("Type\t: DOUBLE\n");
            break;
    }

    printf("Dice\t: %d\n", dice);
    printf("Points\t: %d\n", points);
}
