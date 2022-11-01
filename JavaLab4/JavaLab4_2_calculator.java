package JavaLab4;
import java.security.InvalidAlgorithmParameterException;
import javax.sound.sampled.SourceDataLine;

class InvalidOperatorException extends Exception{
    public InvalidOperatorException(String str){
        super(str);
    }
}

public class JavaLab4_2_calculator{
  
  private double num1;
  private double num2;
  private double result;

  public JavaLab4_2_calculator(){
    num1 = 0;
    num2 = 0;
    result = 0;
  }

  public double doJavaLab4_2_calculator(String op, double num1, double num2) throws InvalidOperatorException, ArithmeticException{
    this.num1 = num1;
    this.num2 = num2;
    
    switch (op){
          case "+":
              result = add();
              break;
          case "-":
              result = substract();
              break;
          case "*":
              result = muliply();
              break;
          case "/":
              if(num2 == 0) throw new ArithmeticException();
              result = divide();
              break;

          default:
              throw new InvalidOperatorException("Invalid operation enterd");

    }
    return result;
}

    public double add(){
       return this.num1 + this.num2;
    }
    public double substract(){
        return this.num1 - this.num2;
    }
    public double muliply(){
        return this.num1 * this.num2;
    }
    public double divide(){
        return this.num1 / this.num2;
    }

    public void printResult(String op){
        System.out.println(this.num1 + " " + op + " " + this.num2 + " = " + this.result);
    }
}
