/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.game;

import java.util.Random;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
/**
 *
 * @author 2146124
 */
@ManagedBean(name = "game")
@ApplicationScoped
public class Game {
    private int numberGuess;
    private int tries;
    private String status;
    private int score;
    
    public Game(){
        Random rand = new Random();
        numberGuess= rand.nextInt(10) + 1;
        tries=0;
        status="Sigue intentando Coca-Cola";
        score=100000;
    }
    
    public void setNumberGuess(int numberGuess){
        this.numberGuess=numberGuess;
    }
    
    public int getTries(){
        return tries;
    }
    
    public void guess(int value){
        tries++;
        if(value!=numberGuess){
            score-=10000;
        }else{
            status="Victoria";
        }
    }
    
    public void restart(){
        Random rand = new Random();
        numberGuess= rand.nextInt(10) + 1;
        tries=0;
        status="Sigue intentando Coca-Cola";
        score=100000;
    }
    
    public String getStatus(){
        return status;
    }
    
    public int getScore(){
        return score;
    }
    
    public int getNumberGuess(){
        return numberGuess;
    }
    
    public String getWinState(){
        String ans=(status.equals("Victoria"))? "Victoria, puntaje " + score:"Sigue intentando Coca-Cola";
        return ans;
    }
}
