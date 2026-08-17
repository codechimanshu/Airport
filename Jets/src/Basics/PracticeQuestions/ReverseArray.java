package Basics.PracticeQuestions;

public class ReverseArray {
    static void main() {
        int [] arr={1,2,3,4,5,6};

//        int [] revarr =new int [arr.length];
//        for (int i=arr.length-1;i>=0;i--){
//            System.out.print(arr[i]+" ");
//        }

        int temp;
        for(int i =0 ;i<(arr.length/2);i++){
            temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
