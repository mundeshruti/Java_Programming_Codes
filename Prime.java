package Java_Programming_Codes;

public class Prime {
    public static void main(String[] args) {
        int i=0,m=0,flag=0;
        int n=2;
        m=n/2;
        if(n==0 || n==1){
            System.out.println("not prime");
        }
        else{
            for(i=2;i<=m;i++ ){
                if(n%i==0){
                    System.out.println("not prime");
                    flag=1;
                    break;
                }

            }
            if(flag==0){
                System.out.println("prime");
            }
        }
    } 
}
