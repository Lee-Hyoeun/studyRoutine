package ecote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class util1_2 {
	  private int inputNumber;  //N
	    private int divideNumber; //K
	    private int count;

	    public static void main(String[] args) {
	        util1_2 problem3 = new util1_2();
	        System.out.println(problem3.solve());
	    }


	    public int solve(){

	        setInput();
	        calculate();

	        return count;
	    }

	    private void calculate() {

	        while (inputNumber != 1){

	            if(inputNumber < divideNumber) {
	                count += inputNumber -1;
	                break;
	            }

	            int remain = inputNumber % divideNumber;
	            
	            if(remain == 0){
	                divide();
	                continue;
	            }
	            subtract(remain);
	        }
	    }

	    private void subtract(int remain) {
	        count += remain;
	        inputNumber -= remain;
	    }

	    private void divide() {
	        inputNumber /= divideNumber;
	        count++;
	    }


	    public void setInput() {
	        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
	            int[] vars = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	            inputNumber = vars[0];
	            divideNumber = vars[1];

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
