package Basics.PracticeQuestions;

public class CelTOFaren {

    static float CtoF(float n ){
        float f = (n*9/5)+32;
        return f;
    }

    static void main(){
        System.out.println(CtoF(25.5f));
    }
}
