package computer;
import game.Game;
import java.util.Random;

public class EvenAI extends AI{
    Random random = new Random();
    public EvenAI(String AIName,Game game){
        super(AIName,game);
    }

    @Override
    public void guessNum(){
        int max = game.getMax();
        int min = game.getMin();
        int guessNum = random.nextInt(max-min+1) + min;
        if (guessNum % 2 != 0) {
            guessNum++;
            if (guessNum > max) {
                guessNum -= 2;
            }
        }
        System.out.println("偶數電腦對手猜" + guessNum);
        game.gameStart(guessNum);
    }
}


