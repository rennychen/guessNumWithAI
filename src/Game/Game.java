package Game;

import java.util.Random;
import java.util.Scanner;
public class Game {
    private int AnsNum;
    private String Player;
    private int max = 100;
    private int min = 0;

    Random random = new Random();
    Scanner scan = new Scanner(System.in);

//    public Game(String Player){
//        this.Player = Player;
//    }

    public String getPlayer(){
        return Player;
    }

    public void setPlayer(String Player){
        this.Player = Player;
    }

    public int getNum(){
        return AnsNum;
    }

    public void setNum(){
        this.AnsNum = random.nextInt(100)+1;
    }

    public int getMax(){
        return max;
    }

    public int getMin(){
        return min;
    }

    public void gameStart(int guessNum){

        if (guessNum != AnsNum && guessNum > AnsNum){
            max = guessNum;
            System.out.println("答錯了，範圍:" +min + "~" + max +"間的整數");
            } else if (guessNum != AnsNum && guessNum < AnsNum){
            min = guessNum;
            System.out.println("答錯了，範圍:" +min + "~" + max +"間的整數");
            } else {
            System.out.println("答對了,答案是" + AnsNum);
            }

    }


}
