package Basics.PracticeQuestions;

public class MinInArray {
    static void main() {
        int[] arr ={64,31,54,87,21,98,78};
        int temp=arr[0];
        for(int j=0;j<arr.length;j++){
            if (arr[j]<temp){
                temp=arr[j];
            }
        }
        System.out.println("The minimum number is "+temp);
    }
}
