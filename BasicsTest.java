public class BasicsTest{
    public static void main(String[] args){
        Basics basic = new Basics();
        // Print the numbers 1-255
            // basic.print255();
       
        //Print the odd numbers 1-255
            // basic.printOdd255();

        //Print the sum of the numbers 1-255
            // int sum255= basic.sum255();
            // System.out.println(sum255);
        
        //iterates through an array
            // int[] myArray = {4, 8, 8, 5, 9};
            // basic.interateArray(myArray);

        //finds max value in an array
            // int[] myArray = {4, 8, 12, 5, 9};
            // System.out.println(basic.findMax(myArray));
    
        //prints new array with odd numbers 1-255
            // System.out.println(basic.oddsArray());

        //gets average of values in an array
            // int[] array= {2,10,3};
            // System.out.println(basic.findAverage(array));
            
        //gets values in an array greater than Y
            // int[] array = {1, 3, 5, 7};
            // System.out.println(basic.greaterthanY(array, 3));

        //squares the values in an array
            // int[] arr={1,5,10,-2};
            // System.out.println(basic.squares(arr));

        //eliminates negatives
            // int[] arr={1,5,10,-2};
            // System.out.println(basic.noNegs(arr));

        //max, min, ave array
        int[] x= {1, 5, 10, -2};
        System.out.println(basic.maxMinAve(x));


    }
}