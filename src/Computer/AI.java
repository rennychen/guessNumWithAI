package Computer;
import Game.Game;

public abstract class AI {
    private String AIName;
    protected Game game;

    public AI(String AIName,Game game){
        this.AIName = AIName;
        this.game = game;
    }

    public String getName(){
        return AIName;
    }

    public abstract void guessNum();

}
