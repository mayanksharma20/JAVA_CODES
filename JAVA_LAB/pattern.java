class pattern{
    public void pyramid(int n){
        int count=1;
        for (int i=0; i<n; i++) //outer loop for number of rows(n) 
            {for (int j=n-i; j>1; j--) //inner loop for spaces
            { 
                System.out.print(" "); //print space
            }  
            for (int j=0; j<=i; j++ ) //inner loop for number of columns
            { 
                System.out.print(" "+count); //print star
                count++;
            }  
            System.out.println(); //ending line after each row
            
        } 
    }
    public static void main(String[] args) {
        int n=5;
        pattern p1=new pattern();
        p1.pyramid(n);
    }
}