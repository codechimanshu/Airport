package Basics.PracticeQuestions;

public class MaxInArray {
    static void main() {
        int[] arr ={64,31,54,87,21,98,78};
        int temp=0;
        for(int j=0;j<arr.length;j++){
            if (arr[j]>temp){
                temp=arr[j];
            }
//            else{
//                continue;
//            }
        }
        System.out.println("The maximum number is "+temp);
    }
}
