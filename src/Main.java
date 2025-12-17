import java.awt.desktop.SystemEventListener;
import java.util.ArrayList;
import java.util.Scanner;
import Computer.*;
public class Main{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("輸入玩家名稱:");
        String player = scan.nextLine();
        Game game = new Game(player); //創建玩家名稱

        AI[] allAIPlayer = new AI[]{new OddAI("奇數電腦對手"),new EvenAI("偶數電腦對手")}; //建立電腦選手
        ArrayList<String> playerNames = new ArrayList<>(); //建立ArrayList存放玩家&電腦玩家
        playerNames.add(game.getPlayer()); //先把玩家放入ArrayList
        for(AI AIplayer:allAIPlayer){
            playerNames.add(AIplayer.getName()); //把電腦玩家放入Arraylist
        }

        System.out.print("本次參賽玩家:");
        for(String playerName: playerNames){
            System.out.print(playerName + ","); //輸出全部本次參賽玩家
        }
        System.out.println("");

        game.setNum(); //設定終極密碼答案
        int guessNum=0;
        int round = 0;

        do{
            System.out.println("本輪猜答案玩家為:" + playerNames.get(round));
            if (playerNames.get(round) == game.getPlayer()){
                round++;
                System.out.print("請輸入"+ game.getMax() + "~" + game.getMin() +"間的整數:");
                guessNum = scan.nextInt();
                game.gameStart(guessNum);
            } else{
                System.out.println("電腦猜");
//                        AI.guessNum();
                if (round < playerNames.size()-1){ //防止round數>ArrayList資料筆數
                    round++;
                } else{
                    round = 0;
                }

            }
        }while(game.getNum() != guessNum);






    }
}