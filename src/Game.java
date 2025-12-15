
import java.util.Random;
import java.util.Scanner;
public class Game {
    private int AnsNum;

    Random random = new Random();
    Scanner scan = new Scanner(System.in);

    public Game(){
        AnsNum = random.nextInt(100)+1;
    }

    public int getNum(){
        return AnsNum;
    }

    public void setNum(){
        this.AnsNum = random.nextInt(100)+1;
    }

    public void gameStart(){
        int start = 0;
        int end = 100;
        System.out.print("請輸入" +start + "~" + end +"間的整數:");
        int guessNum = scan.nextInt();
        while (true){
            if (guessNum != AnsNum && guessNum > AnsNum){
                end = guessNum;
                System.out.print("請輸入" +start + "~" + end +"間的整數:");
                guessNum = scan.nextInt();
            } else if (guessNum != AnsNum && guessNum < AnsNum){
                start = guessNum;
                System.out.print("請輸入" +start + "~" + end +"間的整數:");
                guessNum = scan.nextInt();
            } else {
                System.out.println("答對了,答案是" + AnsNum);
                break;
            }
        }

    }


}
