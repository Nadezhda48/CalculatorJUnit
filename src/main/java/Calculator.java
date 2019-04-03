public class Calculator implements ICalculator {

    private double[] numbers;
    private char[] signs;
    private String labelText, temp;
    private int labelLength, idInSignsArr, numPos;
    private double result;

    double getResult(){
        return result;
    }

    Calculator(String labelText){
        this.labelText = labelText;
        labelLength = labelText.length();
        numbers = new double[20];
        signs = new char[20];
        idInSignsArr = 1;
        numPos = 0;

        result = calculateResult();
    }

    public double calculateResult(){
        int pos = 0;
        int idInNumbersArr = 0;

        while(pos< labelLength){
            if(labelText.charAt(pos)=='+'){
                signs[idInSignsArr] = '+';
                idInSignsArr +=2;
                temp = labelText.substring(idInNumbersArr,pos);
                numbers[numPos]= Double.parseDouble(temp);
                numPos +=2;
                idInNumbersArr = pos+1;
            } else  if(labelText.charAt(pos)=='-'){
                signs[idInSignsArr] = '-';
                idInSignsArr +=2;
                temp = labelText.substring(idInNumbersArr,pos);
                numbers[numPos]= Double.parseDouble(temp);
                numPos +=2; idInNumbersArr = pos+1;
            }else  if(labelText.charAt(pos)=='*'){
                signs[idInSignsArr] = '*';
                idInSignsArr +=2;
                temp = labelText.substring(idInNumbersArr,pos);
                numbers[numPos]= Double.parseDouble(temp);
                numPos +=2;
                idInNumbersArr = pos+1;
            }else  if(labelText.charAt(pos)=='/'){
                signs[idInSignsArr] = '/';
                idInSignsArr +=2;
                temp = labelText.substring(idInNumbersArr,pos);
                numbers[numPos]= Double.parseDouble(temp);
                numPos +=2;
                idInNumbersArr = pos+1;
            }else{}

            pos++;
        }

        temp = labelText.substring(idInNumbersArr);
        numbers[numPos] = Double.parseDouble(temp);

        calculate();

        return numbers[0];
    }

    public void calculate(){
        for(int i = 1; i<= idInSignsArr; i+=2){
            if(signs[i]=='*'){
                numbers[i-1] = metodMultiplication(numbers[i-1], numbers[i+1]);
                changeNumPos(i+1);
                changeOpPos(i);
            }
        }
        for(int i = 1; i<= idInSignsArr; i+=2){
            if(signs[i]=='/'){
                numbers[i-1] = metodDivision(numbers[i-1], numbers[i+1]);
                changeNumPos(i+1);
                changeOpPos(i);
            }
        }
        for(int i = 1; i<= idInSignsArr; i+=2){
            if(signs[i]=='-'){
                numbers[i-1] = metodMinus(numbers[i-1], numbers[i+1]);
                changeNumPos(i+1);
                changeOpPos(i);
            }
        }
        for(int i = 1; i<= idInSignsArr; i+=2){
            if(signs[i]=='+'){
                numbers[i-1] = metodPlus(numbers[i-1], numbers[i+1]);
                changeNumPos(i+1);
                changeOpPos(i);
            }
        }
        for(int i = 1; i<= idInSignsArr; i+=2){
            if(signs[i]=='√'){
                numbers[i-1] = metodSqrt(numbers[i-1]);
                changeNumPos(i+1);
                changeOpPos(i);
            }
        }
    }

    public void changeNumPos(int pos1){
        for(int i = pos1; i< numPos; i+=2)
            numbers[i] = numbers[i+2];
    }

    public void changeOpPos(int pos1)
    {
        for(int i = pos1; i< idInSignsArr; i+=2)
            signs[i] = signs[i+2];
    }

    public double metodPlus(double firstNum, double secondNum) {

        double res = firstNum + secondNum;
        return res;
    }
    public double metodMinus (double firstNum, double secondNum){

        double res = firstNum - secondNum;
        return res;
    }
    public double metodDivision (double firstNum, double secondNum){

        double res = firstNum / secondNum;
        return res;
    }
    public double metodMultiplication (double firstNum, double secondNum){

        double res = firstNum * secondNum;
        return res;
    }
    public double metodSqrt (double firstNum){

       /* double number = sc.nextDouble();
        double t;
        double squareRoot = number/2;
        do {
            t = squareRoot;
            squareRoot = (t+(number/t))/ 2;
        }while ((t - squareRoot) != 0);
        sc.close();
        */

       double temp;
       double squareRoot = firstNum / 2;
       do {
           temp = squareRoot;
           squareRoot = (temp + (firstNum / temp)) / 2;
       } while ((temp - squareRoot) != 0);

        return squareRoot;
    }

}
