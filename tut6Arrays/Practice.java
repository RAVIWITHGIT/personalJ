public class Practice {
    public static void main(String args[]) {

        // ************************************** sum all array float value
        // float[] myArr = { 1.2f, 3.4f, 5.6f, 7.8f, 9.4f };
        // float sum = 0;
        // for (float element : myArr) {
        // sum += element;
        // }
        // System.out.println(sum);

        // ******************************** find value in array
        // float[] myArr = { 1.2f, 3.4f, 5.6f, 7.8f, 9.4f };
        // float findValue = 3.4f;
        // boolean isPresent = false;
        // for (float element : myArr) {
        // if (element == findValue) {
        // isPresent = true;
        // break;
        // }
        // }
        // if (isPresent) {
        // System.out.println("this value present in Array");
        // } else {
        // System.out.println("this value not present in Array");
        // }

        // ******************************************* average
        // float[] myArr = { 1.2f, 3.4f, 5.6f, 7.8f, 9.4f };
        // float sum = 0;
        // for (float element : myArr) {
        // sum += element;
        // }
        // System.out.println(sum);
        // System.out.printf("the average of this number is %f", sum / myArr.length);

        // ************************************** add two matrix array in new array, 2X3
        // int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 } };
        // int[][] matrix2 = { { 7, 8, 9 }, { 10, 11, 12 } };
        // int rowLength = matrix1.length;
        // int columnLength = matrix1[0].length;
        // int[][] resultArray = new int[rowLength][columnLength];
        // for (int i = 0; i < rowLength; i++) {
        // for (int j = 0; j < columnLength; j++) {
        // resultArray[i][j] = matrix1[i][j] + matrix2[i][j];
        // }
        // }

        // for (int i = 0; i < resultArray.length; i++) {
        // for (int j = 0; j < resultArray[0].length; j++) {
        // System.out.print(resultArray[i][j] + " ");
        // }
        // System.out.println();
        // }

        // ********************************* reverse array
        // int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        // int startIndex = 0;
        // int lastIndex = arr.length - 1;
        // for (int i = 0; i < arr.length / 2; i++) {
        // int temp = arr[startIndex];
        // arr[startIndex] = arr[lastIndex];
        // arr[lastIndex] = temp;
        // startIndex++;
        // lastIndex--;
        // }

        // *** second way
        // int length = arr.length;
        // for (int i = 0; i < arr.length / 2; i++) {
        // int temp = arr[i];
        // arr[i] = arr[length - i - 1];
        // arr[length - i - 1] = temp;

        // }

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        // ********************************************* find max value
        // int arr[] = { 1, 2, 3, 4, 8, 5, 6, 7 };
        // int maxValue = Integer.MIN_VALUE;
        // for (int i = 0; i < arr.length; i++) {
        // maxValue = Math.max(maxValue, arr[i]);
        // }
        // System.out.println(maxValue);

        // ******************************* check array is sorted
        int arr[] = { 1, 2, 3, 4, 8, 5, 6, 7 };
        boolean checkSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                checkSorted = false;
                break;
            }
        }

        if (checkSorted) {
            System.out.println("array is sorted");
        } else {
            System.out.println("array is not sorted");
        }

    }
}
