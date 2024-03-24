import java.util.List;
import java.util.Scanner;

public class InputView {

    private Scanner scanner = new Scanner(System.in);
    public String getUserNumbers(){
        System.out.println("숫자를 입력해주세요 : ");
        String input = scanner.nextLine();
        return input;
    }

    public boolean validateInput(String input){
        if(validateSize(input)){
            String[] tmp=input.split("");
            for(int i=0;i<3;i++){
                validateNumber(tmp[i]);
            }
        }
        return false;
    }

    private boolean validateNumber(String input) {
        try{
            int number=Integer.parseInt(input);
            return 1<=number && number<=9;
        }catch(NumberFormatException e){
            return false;
        }
    }

    private boolean validateSize(String input){
        return input.length()==3;
    }

}
