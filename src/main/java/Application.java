public class Application {
    private final static int END_VALUE=2;

    public static void main(String[] args){
        InputView input = new InputView();
        boolean play=true;
        while(play){
            GameController game=new GameController();
            while(!game.isEnded()){
                game.playTurn();
            }
            if(input.getRestartOrEnd()==END_VALUE){
                play=false;
            }
        }
    }
}
