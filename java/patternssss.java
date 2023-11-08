public class patternssss {
    public static void half_pyramid_num(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }


    public static void floys_triangle(int n){
        int counter=1;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter +" ");
                counter++;

            }
            System.out.println();
        }
    }

    public static void zero_one_tri(int n){
        for(int i=1; i<=n; i++){
            for(int j=1;j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1");
                    }else{
                        System.out.print("0");
                    }
            }
            System.out.println();
        }
    }

    public static void butterfly_pattern(int n){
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int sp=1; sp<=2*(n-i); sp++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=4; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int sp=1; sp<=2*(n-i); sp++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


public static void solid_rhombus(int n){
    for(int i=1; i<=n; i++){
        for(int sp=4; sp>=i; sp--){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        for(int k=4; k>=i; k--)
        {
            System.out.print("*");
        }
        System.out.println();

    }
}

public static void hollow_rhombus(int n){
    for(int i=1; i<=n; i++){
        for(int sp=4; sp>=i; sp++){
            System.out.print(" ");
        }
        for(int k=1; k<=n; k++){
            if(i==1|| i==n||k==1||k==n){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
    public static void main(String args[]){
        // half_pyramid_num(10);
        // floys_triangle(5);
        // zero_one_tri(5);
        // butterfly_pattern(4);
        // solid_rhombus(5);
        hollow_rhombus(5);

    }
    
}
