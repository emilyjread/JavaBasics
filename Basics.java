import java.util.ArrayList;
import java.util.Arrays;


public class Basics{
    //prints numbers 1-255
    public void print255(){
        for (int i=1; i<256; i++){
            System.out.println(i);
        }
          
    }

    //prints odd numbers 1-255
    public void printOdd255(){
        for (int i=1; i<256; i++){
            if (i%2==1){
                System.out.println(i);
            }
        }
    }

    //prints sum of numbers 1-255
    public int sum255(){
        int sum =0;
        for (int i=0; i<256; i++){
            sum+=i;
        }
        return sum;
    }

    //iterates through an array
    public void interateArray(int[] arr){  
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    //Find max in an array

    public int findMax(int[] arr){
        int max= arr[0];
        for (int i=0; i<arr.length; i++){
            if (arr[i]> max){
                max=arr[i];
            }
        }
        return max;
    }

    //creates new array with odd numbers

    public ArrayList<Integer> oddsArray(){
        ArrayList<Integer> newarr= new ArrayList<Integer>();
        for (int i=1; i<256; i++){
            if (i%2==1){
               newarr.add(i);
            }
        }
        return newarr;

    }

//gets average of values in an array
public int findAverage(int[] arr){
    int sum=0;
    int ave;
    for (int i=0; i<arr.length; i++){
        sum+=arr[i];
    }
    ave=sum/arr.length;

    return ave;
}

public int greaterthanY(int[] arr, int Y){
    int count=0;
    for (int i=0; i<arr.length; i++){
        if(arr[i]>Y){
            count++;

        }
    }
    return count;

}

public String squares(int[] arr){  
    for (int i=0; i<arr.length; i++){
        arr[i]=arr[i]* arr[i];
    }
    
    return Arrays.toString(arr);
}

public ArrayList<Integer>  noNegs(int[] arr){
    ArrayList<Integer> newarr= new ArrayList<Integer>();
    for (int i=0; i<arr.length; i++){
        if (arr[i]>0){
            newarr.add(arr[i]);
        }
    }
    return newarr;
}

public String maxMinAve(int[] arr){
    int max = arr[0];
    int min= arr[0];
    int sum=0;
    int[] newarr= new int[3];
    for (int i=0; i< arr.length; i++){
        sum+=arr[i];
        if (arr[i]>max){
            max=arr[i];
        }
        else if (arr[i]<min){
            min=arr[i];
        }
    }
    double ave= sum/arr.length;
    newarr[0]=max;
    newarr[1]=min;
    newarr[2]= ave;

    return Arrays.toString(newarr);
} 

}