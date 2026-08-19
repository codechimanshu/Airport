package Basics.PracticeQuestions;

public class SortArray {
    static void main() {
        int []arr={1,2,3,4,6,5};
        boolean x = true;
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i]>arr[i+1]){
                x=false;
                break;
            }
        }
        if(x){
            System.out.println("Sorted array");
        }
        else{
            System.out.println("Not sorted array");
        }
    }
}
