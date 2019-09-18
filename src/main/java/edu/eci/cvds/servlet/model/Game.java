/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.servlet.model;

/**
 *
 * @author 2146124
 */
public class Game {
    private int numberGuess;
    private int tries;
    private boolean status; 
    
    public Game(){
        tries=0;
        status=false;
    }
    
    public void setNumberGuess(int numberGuess){
        this.numberGuess=numberGuess;
    }
    
    public int getNumberGuess(){
        return numberGuess;
    }
}
