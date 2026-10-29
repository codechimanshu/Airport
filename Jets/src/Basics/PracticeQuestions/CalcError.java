package Basics.PracticeQuestions;

class InvalidInputException extends Exception{
    public String toString(){
        return "Cannot add 8 and 9";
    }
    public String getmesage(){
        return "Invalid";
    }
}

class CannotDivideByZero extends Exception{
    public String toString(){
        return "Cannot divide by 0";
    }
    public String getmesage(){
        return "Invalid";
    }
}
class MaxInputException extends Exception{
    public String toString(){
        return "Input cannot be greater than 10000";
    }
    public String getmesage(){
        return "Invalid";
    }
}

class CustomClaculator{
    double sum(double a,double b)throws InvalidInputException, MaxInputException{
        if(a>10000 || b>10000){
            throw new MaxInputException();
        }
        if(a==8 || b==9){
            throw new InvalidInputException();
        }
        return a+b;
    }
    double substract(double a,double b)throws MaxInputException{
        if(a>10000 || b>10000){
            throw new MaxInputException();
        }
        return a-b;
    }
    double multiply(double a,double b)throws MaxInputException{
        if(a>10000 || b>10000){
            throw new MaxInputException();
        }
        return a*b;
    }
    double divide(double a,double b)throws CannotDivideByZero, MaxInputException{
        if(a>10000 || b>10000){
            throw new MaxInputException();
        }
        if(b==0){
            throw new CannotDivideByZero();
        }
        return a/b;
    }
}


public class CalcError {
    static void main() throws InvalidInputException, CannotDivideByZero, MaxInputException{
        CustomClaculator c = new CustomClaculator();
//        c.sum(8,9);
        c.substract(8,9);
        c.multiply(8,9);
        c.divide(8,0);
    }
}
