package eoz;


/**
 * Created by EvilOzzir <evilozzir@gmail.com> on 01/06/2014.
 */
public class Game {
    ///////////
    //Amounts//
    ///////////

    int Diamonds; //The total amount of Diamonds
    int tDiamonds; //The total amount of cookies earned
    int Miners; //The total amount of Miners finding Diamonds
    int Alchemist; //The amount of Alchemists transfiguring easily findable cookies into Diamond!
    int Ship; //The numbers of ships bringing diamonds from the Diamond Planet
    //////////
    //Prices//
    //////////
    int pMiners = 10;
    int pAlchemist = 10*10;
    int pShip = 10*10*10;
    ////////////////////////////////////
    //Earn Rate//TODO: Calculate rates//
    ////////////////////////////////////
    int rMiners;
    int rAlchemist;
    int rShip;

    public Game(){
        Diamonds = 0;
        Miners = 0;
        tDiamonds = 0;
        Alchemist = 0;
        Ship = 0;
    }

    /**
     * Use this constructor to change the settings of the game
     * The arrays are used to change things like:
     * [0]the initial amount,
     * [1]the price and
     * [2]the rates
     * @param D Amount of diamonds
     * @param tD Total amount of earned diamonds
     * @param M Array of settings for the Miners
     * @param A Array of settings fot the Alchemists
     * @param S Array of settings fot the Ships
     */
    public Game(int D, int tD, int[] M, int[] A, int[] S){
        //TODO: Enchance the constructor
        //Diamond Settings
        if(D>=0)Diamonds = D;
        if(tD>=0)tDiamonds = tD;
        //Miner Settings
        if(M[0]>=0)Miners = M[0];
        if(M[1]>=0)pMiners = M[1];
        if(M[2]>=0)rMiners = M[2];
        //Alchemist Settings
        if(A[0]>=0)Alchemist = A[0];
        if(A[1]>=0)pAlchemist = A[1];
        if(A[2]>=0)rAlchemist = A[2];
        //Ship Settings
        if(S[0]>=0)Ship = S[0];
        if(S[1]>=0)pShip = S[1];
        if(S[2]>=0)rShip = S[2];
    }

    public void earnDiamond(){
        Diamonds++;
        tDiamonds++;
    }

    public int getPrice(char c){
        int price;
        int basePrice;
        int amount;

        if (c=='M') {
            basePrice=pMiners;
            amount=Miners;
        }
        else if (c=='A') {
            basePrice=pAlchemist;
            amount=Alchemist;
        }
        else if (c=='S') {
            basePrice=pShip;
            amount=Ship;
        }
        else return 0;
        return (int) Math.round(basePrice*Math.pow(0.12,amount));

    }


}
