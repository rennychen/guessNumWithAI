public class Main{
    public static void main(String[] args){

    Game guessNum = new Game(); //創建遊戲，產生隨機數字

    System.out.println(guessNum.getNum());
    guessNum.gameStart();
    }
}