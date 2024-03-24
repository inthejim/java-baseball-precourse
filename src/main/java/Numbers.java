import com.sun.tools.attach.AgentInitializationException;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
    private List<Integer> numbers;
    public Numbers(){
        this.numbers= generateNumbers();
    }
    private static final int DIGIT_NUMBER = 3;
    private List<Integer> generateNumbers() {
        List<Integer> answer = new ArrayList<>();
        NumberGenerator numberGenerator = new NumberGenerator();
        for (int i = 0; i < DIGIT_NUMBER; i++) {
            int num = numberGenerator.generateNumber();
            if (!answer.contains(num)) {
                answer.add(num);
            }
        }
        return answer;
    }

    public List<Integer> getNumbers(){
        return numbers;
    }
}
