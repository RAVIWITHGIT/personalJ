/* *********************************************** Array ******************************************
we can create array in two way
first --> int [] myArr = {1,2,3,4,5}
          int [] myArr = new Int[5]; 

second --> int myArr[];
          int  myArr[] = new Int[5]; 


 */

public class Arrays {
    public static void main(String args[]) {
        float[] myArr = { 1.2f, 3.5f, 8.4f, 7.8f, 6.5f };

        // traverse array element using for loop
        for (int i = 0; i < myArr.length; i++) {
            System.out.println(myArr[i]);
        }

        // traverse array element using forEach loop
        // for(float element : myArr){
        // System.out.println(element);
        // }

    }
}