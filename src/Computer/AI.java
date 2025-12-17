package Computer;

public abstract class AI {
    private String AIName;

    public AI(String AIName){
        this.AIName = AIName;
    }

    public String getName(){
        return AIName;
    }

    public abstract void guessNum();

}
