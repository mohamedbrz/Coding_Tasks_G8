package daniel.week1;

public class divisionWithoutOperator {
    //Write a method that can divide two numbers without using division operator

    public static int divideWithoutOperator(int num1, int num2){
        int answer = 0;

        if (num2>num1){

            for (int i = num1; i <= num2; i += num1) {
                answer++;

            }

            return -answer;

        }

        for (int i = num2; i <= num1; i += num2) {
            answer++;

        }
        return answer;
    }

}
