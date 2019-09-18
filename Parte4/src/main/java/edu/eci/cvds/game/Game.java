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
    private int triedNumber;
    
    public Game(){
        Random rand = new Random();
        numberGuess= rand.nextInt(10) + 1;
        tries=0;
        status="Sigue intentando Coca-Cola";
        score=100000;
        triedNumber=0;
    }
    
    public int getTries(){
        return tries;
    }
    
    public void guess(){
        tries++;
        if(triedNumber!=numberGuess){
            score-=10000;
        }else{
            status=this.getWinState();
        }
    }
    
    public void restart(){
        Random rand = new Random();
        numberGuess= rand.nextInt(10) + 1;
        tries=0;
        status="Sigue intentando Coca-Cola";
        score=100000;
        triedNumber=0;
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
    
    public int getTriedNumber(){
        return triedNumber;
    }
    
    public void setTriedNumber(int triedNumber){
        this.triedNumber=triedNumber;
    }
    
    public String getWinState(){
        return "Victoria se gano "+score + " para la pola";
    }
}
