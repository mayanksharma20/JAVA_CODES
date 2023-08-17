public class Array {
    public static void main(String[] args) {
       
        /* 
        int [] marks;
        marks= new int[10];

        int [] A = new int[11];

        int [] B={23,45,677,88,965};


        marks[0]=100;
        marks[1]=98;
        marks[2]=97;
        marks[3]=55;
        marks[4]=67;
        marks[5]=23;
        System.out.println(marks[5]);
        */

        /* 
        int []marks={98,45,79,99,80};
        float []A={85.5f,45.99f,44.77f};
        String []fruits={"apple","banana","cherry"};

        //System.out.println(marks.length);
        //System.out.println(A[0]);
        //System.out.println(fruits[2]);
        for(int i=0;i<(marks.length);i++){
            System.out.println(marks[i]);
        }

        //for_Each loop;
        System.out.println("\nPrinting using FOR EACH LOOP\n");
        for (int element: marks) {
            System.out.println(element);            
        }
        */

        //2 DIMENTIONAL ARRAY
        int flats[][];
        flats=new int[2][3];
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;

        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;

        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
