package basicExtraKnowledge.Array;

public class ArrayPartFirst {
    public static void main(String args[]) {
        int number[] = { 1, 2, 3, 4, 5 };
        System.out.println(number); /*
                                     * output ==> [I@1372ed45 , [ mean array and I mean Integer and all rest value
                                     * (@1372ed45) is random value
                                     */

        double mydoble[] = { 2.34, 5.66 };
        System.out.println(mydoble); /*
                                      * output ==> [D@797badd3 , [ mean array and D mean double and all rest value
                                      * (@797badd3) is random value
                                      */

        float myfloat[] = { 2.34f, 5.66f };
        System.out.println(myfloat); /*
                                      * output ==> [F@3f200884 , [ mean array and F mean float and all rest value
                                      * (@3f200884) is random value
                                      */

        // foreach and enhances for loop . this is same but different pronunciation

        // ******************************** give array size different - different way
        int arr[] = new int[5];
        System.out.println(arr.length);

        int arr2[] = new int['A']; // unicode number of 'A' is 65
        System.out.println(arr2.length);

        int arr3[] = new int[(int) 2.4f];
        System.out.println(arr3.length);

        /*
         * ******************************** give max size to array
         * 1. max size depends on data type
         * int size is 4 byte (1 byte --> 8 bits) , mean 32 bit
         * byte --> Range: -128 to 127
         * short --> Range: -32,768 to 32,767
         * int --> Range: -2,147,483,648 to 2,147,483,647
         * long --> Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
         */

        // ** this is depends upon computer memory , in my case give outOfMemoryError
        // int arr4[] = new int[2147483647];
        // System.out.println(arr4.length);

        /*
         * ***********************************************************************
         * 1. it is not compulsory that if you create array then you give same data type
         * value in array
         * 2. if data type which have large size you can store min size data type value
         * 3. exa --> double size larger apart from other data type size
         * 4. min size data type changed to double , this is implicit conversion mean
         * automatic
         * 5. two type of conversion --> implicit and explicit type conversion (do
         * manually)
         */

        double arr5[] = { 'c', 34, 3.41f, 555677778 };
        for (double d : arr5) {
            System.out.println(d);
        }

    }
}
