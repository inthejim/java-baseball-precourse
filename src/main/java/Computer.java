import java.util.List;

public class Computer {
    private static List<Integer> answer;

    public Computer(List<Integer> numbers){
        this.answer=numbers;
    }

    public void getHint(List<Integer> numbers){
        int[] score = checkAnswer(numbers);
        int strike=score[0];
        int ball=score[1];
        OutputView output=new OutputView();

        if(strike>0){
            output.printStrike(strike);
        }
        if(strike==3){
            output.printBall(ball);
        }
        if(ball>0){
            output.printBall(ball);
        }
    }

    private int[] checkAnswer(List<Integer> numbers){
        int ball = 0;
        int strike = 0;
        for(int i=0; i<3; i++){
            if(hasStrike(i,numbers)){
                strike++;
            }
            if(!hasStrike(i,numbers) && hasBall(i,numbers)){
                ball++;
            }
        }
        return new int[]{strike, ball};
    }

    private boolean hasStrike(int i, List<Integer> numbers){
        return answer.get(i).equals(numbers.get(i));
    }

    private boolean hasBall(int i, List<Integer> numbers){
        return answer.contains(numbers.get(i));
    }

}
