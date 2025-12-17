package Computer;
import Game.Game;
import java.util.Random;

public class EvenAI extends AI{
    Game game = new Game();
    Random random = new Random();
    public EvenAI(String AIName){
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


