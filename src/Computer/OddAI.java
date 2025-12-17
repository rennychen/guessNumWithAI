package Computer;
import java.util.Random;
import Game.Game;
public class OddAI extends AI {
    Game game = new Game();
    Random random = new Random();

    public OddAI(String AIName){
        super(AIName);
    }

    @Override
    public void guessNum(){
        int max = game.getMax();
        int min = game.getMin();
        int guessNum = random.nextInt(max)+min;
        if (guessNum % 2 != 1 ){
            guessNum++;
            if (guessNum>max){
                guessNum -= 2 ;
            }
        }
        game.gameStart(guessNum);

    }
}
