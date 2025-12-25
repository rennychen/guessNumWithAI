package Computer;
import java.util.Random;
import Game.Game;
public class OddAI extends AI {
    Random random = new Random();

    public OddAI(String AIName,Game game){
        super(AIName,game);
    }

    @Override
    public void guessNum(){
        int max = game.getMax();
        int min = game.getMin();
        int guessNum = random.nextInt(max-min+1) + min;
        if (guessNum % 2 != 1) {
            guessNum++;
            if (guessNum > max) {
                guessNum -= 2;
            }
        }
        System.out.println("奇數電腦對手猜" + guessNum);
        game.gameStart(guessNum);

    }
}
