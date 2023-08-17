import java.util.Scanner;
public class ArrayPracticeSet {
    
    /* 
    static void PrintArray(int [][] matrix){
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){                
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        System.out.println("");      
    }
    */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*
        //problem 1
        float [] marks={88.5f , 66.5f ,44.69f ,26.96f ,89.20f};
        
        float sum=0;
        for(int i=0;i<marks.length;i++){
            sum=sum + marks[i];
        }
        System.out.println(sum);
        */

        /* 
        //QUESTION 2 "Given array is peresent or not"

        int [] marks={88, 66,44 ,26 ,89};
        int k=sc.nextInt();
        boolean isInArray=false;
        for (int i : marks) {
            if(k==i){
                isInArray=true;
                break;
            }
        }

        if(isInArray){
            System.out.println("present");
        }
        else 
            System.out.println("NOT present");
        */

        /* 
        //QUESTION 3 "aVERAGE OF A NUMBER "
        float [] marks={88.5f , 66.5f ,44.69f ,26.96f ,89.20f};
        
        float sum=0;
        float avg;
        for(int i=0;i<marks.length;i++){
            sum=sum + marks[i];
        }
        avg=sum/marks.length;
        System.out.println("Average is "+avg);
        */

        /* 
        //question 4 matrix
        int [][] mat1={{1,2,3},{4,5,6}};
        int [][] mat2={{2,6,13},{3,7,1}};
        int [][] result={{0,0,0},{0,0,0 }};
        
        PrintArray(mat1);
        PrintArray(mat2);

        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[i].length;j++){
                result[i][j]=mat1[i][j]+mat2[i][j];
            }            
        }
        
        PrintArray(result);
        */


        /* 
        //REVERSE OF AN ARRAY(using reverse loop)
        int [] marks={100, 99,98 ,97 ,96};
        for(int i=marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }
        
        //USING SWAPING

        int [] array={100, 99,98 ,97 ,96,95};
        int l=array.length;
        int n=l/2;
        
        for(int i=0;i<n;i++){
            int swap=array[i]; 
            array[i]=array[l-i-1];  
            array[l-i-1]=swap;     
        }
        
        for (int element : array) {
            System.out.println(element);
        }
        */

        /* 
        //MAX OF AN ARRAY
        int [] array={100, 99,98,102 ,97 ,96 ,95,11,12345};
        int max=0;
        for(int element: array){
            if(element>max){
               max=element;
            }
        }
        System.out.println("Max element is "+max);
        */
        /* 
        //minimum OF AN ARRAY
        int [] array={5,100, 99,98,102 ,97 ,96 ,95,11,12345};
        int min=array[0];
        for(int element: array){
            if(element<min){
               min=element;
            }
        }
        System.out.println("Min element is "+min);
        */

        //GIVEN ARRAY IS SORTED OR NOT
        boolean isSorted=true;
        int []arr={1,2,3,4,5,6};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Array is Sorted");
        }
        else
            System.out.println("Array is NOT SORTED");
    }
}
