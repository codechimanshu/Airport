package Basics;

@FunctionalInterface
interface DemoAnony{
    void meth(int a);
//    void meth2();
}

//class HimFunc implements DemoAnony{
//    @Override
//    public void meth(){
//        System.out.println("HimFunc");
//    }
//}

//class AnonyDemo implements DemoAnony{
//    public void display(){
//        System.out.println("Hello this is display");
//    }
//    @Override
//    public void meth(){
//        System.out.println("Hello this is meth");
//    }
//
//    @Override
//    public void meth2(){
//        System.out.println("Hello this is meth2");
//    }
//}

public class LambdaClass {
    public static void main(String[] args){
//        DemoAnony obj = new AnonyDemo();
//        obj.meth();

//        DemoAnony obj = new DemoAnony() {
//            @Override
//            public void meth() {
//                System.out.println("Hello this is meth");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("Hello this is meth2");
//            }
//        };
//        obj.meth();

        //-----------Lambda Expressions------------

//        DemoAnony obj = new HimFunc();
//        h.meth();

        DemoAnony obj = (a)->{System.out.println("I am method 1 from this lambda "+ a);};
        obj.meth(10);
    }
}
