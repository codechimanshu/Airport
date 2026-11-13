package Basics;

@FunctionalInterface
interface myFunctionalInterface{
    void thisMethod();
//    void thisMethod2();
}

class NewPhone extends phone{
    @Override
    public void Time(){
        System.out.println("Time is 8PM");
    }
    @Deprecated
    public int sum(int a,int b ){
        return a+b;
    }
}
public class JavaAnnotation {
    @SuppressWarnings("deprecation")
    public static void main(String args[]){
        NewPhone np = new NewPhone();
        np.Time();
        np.sum(1,2);
    }
}
