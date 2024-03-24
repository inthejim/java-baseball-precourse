import java.util.Random;

public class Number {
    private int number;
    private static final int SMALLEST_NUMBER=1;
    private static final int LARGEST_NUMBER=9;

    public Number(int n){
        this.number=n;
    }

    private boolean validateNumber(int number){
        if(SMALLEST_NUMBER<=number && number<=LARGEST_NUMBER){
            return true;
        }
        return false;
    }
    private int generateRandomNumber(){
        int randomNumber = new Random().nextInt(10);
        return randomNumber;
    }

    public int generateNumber(){
        int newNumber = generateRandomNumber();
        if(!validateNumber(newNumber)){
            newNumber = generateRandomNumber();
        }
        return newNumber;
    }
}
