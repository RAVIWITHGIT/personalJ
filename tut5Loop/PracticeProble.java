public class PracticeProble{
    public static void main(String args[]){

        // ***********************************************
        // for(int i=4; i>=1; i--){
        //     for(int j=0; j<i; j++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }


        // ******************************************* print event number
        // int sum =0;
        // int n = 4;
        // for(int i=0; i<n; i++){
        //     sum = sum+(2*i);
        // }
        // System.out.println(sum);


        // ******************************************
        // int n = 6;
        // for(int i=1; i<=10; i++){
        //     System.out.printf("%d * %d = %d",n,i,n*i);
        //     System.out.print('\n');
        // }

        // *****************************************
        // int n = 6;
        // for(int i=10; i>=1; i--){
        //     System.out.printf("%d * %d = %d\n",n,i,n*i);
        // }


        // *************************************************8
        int n = 8;
        int sum = 0;
        for(int i=1; i<=10; i++){
            sum+=n*i;
        }
        System.out.println(sum);
    }
}