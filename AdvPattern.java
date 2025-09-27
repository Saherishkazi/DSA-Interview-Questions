public class AdvPattern {

    //hollow rectangular
public static void hollow_rectangular(int rows, int cols){

    for(int i =1 ; i<=rows; i++){
        for(int j = 1; j<= cols; j++){
           if (i ==1 || i ==rows || j==1 || j==cols){
                System.out.print("*");
            }
            else{
            System.out.print(" ");
            }
        }
        System.out.println();
    }
}

    

public static void rotatedHalfPyramid(int n){
    
   for(int i=1 ; i<=n; i++){
    //spaces
    for(int j=1; j<=n-i; j++){
        System.out.print(" ");
    }
    //starts
    for(int j=1; j<=i; j++){
        System.out.print("*");
    }

    System.out.println();
   }
}


public static void inverted_half_pyramid_number(int n ){
    for(int i=1; i<=n;i++){
        for(int j=1; j<=n-i+1; j++){
            System.out.print(j);
        }
        System.out.println();
    }
}


public static void floyds_triangle(int n){
 int counter = 1;
    for(int i=1; i<=n; i++){
        //how many times will counter be printed
        for(int j=1; j<=i; j++){
            System.out.print(counter +" ");
            counter++;
        }
        System.out.println();
    }
}


//0-1 triangle
public static void triangle(int n){
  for(int i=1; i<=n; i++){
    for(int j=1; j<=i; j++){
        if((i + j ) % 2==0){
            System.out.print("1" +" ");
        }
        else{
            System.out.print("0" + " ");
        }

    }
    System.out.println();
  }
}


//butterfly
public static void butterfly(int n){
  for(int i=1; i<=n; i++){
    //star
    for(int j=1; j <=i; j++){
        System.out.print("*");
    }
    //space
    for(int j=1; j <= 2*(n-i); j++){
        System.out.print(" ");
    }
    //star
    for(int j=1; j<=i; j++){
        System.out.print("*");
    }
    System.out.println();
}

  for(int i=n; i >=1; i--){
    //star
    for(int j=1; j<=i; j++){
        System.out.print("*");
    }
    //space
    for(int j=1; j <= 2*(n-i); j++){
        System.out.print(" ");
    }
    //star
    for(int j=1; j<=i; j++){
        System.out.print("*");
    }
    System.out.println();
  }
}

public static void solid_rhombus(int n){
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i; j++){
          System.out.print(" ");
        }
        for(int j=1; j<=n; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

public static void hollw_rhombus (int rows, int col){
    for(int i=1; i <=rows; i++){
        for(int j=1; j <= col-i; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=col ; j++){
            if(i==1 || i== rows|| j==1 || j==col){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}


    public static void main(String arg[]){
    //   hollow_rectangular(6, 7);
   
    //  rotatedHalfPyramid(8);

    // inverted_half_pyramid_number(5 );

    // floyds_triangle(5);


    // triangle(5);

    // butterfly(4);

    // solid_rhombus(6);

    hollw_rhombus(5, 5);




    }
    
}

