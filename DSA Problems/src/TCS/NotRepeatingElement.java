package TCS;

import java.util.HashSet;

public class NotRepeatingElement {


    static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    public static int firstNonRepeating(int arr[], int n)
    {

        // Complete the function
        HashSet<Integer> set = new HashSet<>();
        int[] temp = new int[n];
        for(int i=0;i<n;i++){
            temp[i] = arr[i];
        }

        bubbleSort(temp);

        for(int i=0;i<n;i++)
        {
            System.out.print(temp[i]+" ");
        }
        for(int i=0;i<n-1;i++){
            System.out.println("----------------------");
            System.out.println(temp[i]);
            System.out.println(temp[i+1]);
            System.out.println("-------------------");
            if(temp[i]==temp[i+1]){
                System.out.println(set.add(temp[i]));
               // set.t
            }
        }

        System.out.println(set);
        for(int i=0;i<n;i++){
            if(!set.contains(arr[i])){
              //  return arr.l;
            }
        }
        return 0;


    }


    public static void main(String[] args) {


        int arr[] = {-1 ,2, -1,-1, -1, 3, 2};
        System.out.println(firstNonRepeating(arr,7));


    }
}
