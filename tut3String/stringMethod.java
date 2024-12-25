/* ********************************************** String Method ***************************************
string is immutable , so we can not change string . that's why all string method return new string not change in original string

 */

public class stringMethod {
    public static void main(String args[]) {
        // String name = "Ravi Lakshakar";

        // ***************************** length()
        // *****************************************
        // System.out.println(name.length());

        // ***************************** toLowerCase()
        // *****************************************
        // String getNewString = name.toLowerCase();
        // System.out.println(name);
        // System.out.println(getNewString);

        // ***************************** toUpperCase()
        // *****************************************
        // String getNewString = name.toUpperCase();
        // System.out.println(name);
        // System.out.println(getNewString);

        /*
         * **************************** trim()
         * ***********************************************
         * if you want remove space from start and end , but not remove space in between
         */
        // String name2 = " Ravi Lakshakar ";
        // String getNewString = name2.trim();
        // System.out.println(name2);
        // System.out.println(getNewString);

        /*
         * ******************************* substring()
         * **********************************
         * if you want piece of string then use substring() method
         * this method take two parameter startingIndex and endingIndex -->
         * substring(start,end)
         */
        // String getNewString = name.substring(2);
        // String getNewString2 = name.substring(2,7);
        // System.out.println(getNewString);
        // System.out.println(getNewString2);

        /*
         * ******************************** replace() **********************************
         * if you want replace character or substring
         * this method replace whole match character or substring
         */
        // String getNewString = name.replace('a','r');
        // System.out.println(name);
        // System.out.println(getNewString);

        // String getNewString2 = name.replace("vi","aaaarvi");
        // System.out.println(name);
        // System.out.println(getNewString2);

        /*
         * ********************************** startWith
         * ***********************************
         * 1.if you want check string start with specific char and substring
         * 2.get true and false result
         * 
         */
        // boolean getNewString = name.startsWith("R");
        // boolean getNewString2 = name.startsWith("Ravi");
        // System.out.println(name);
        // System.out.println(getNewString);
        // System.out.println(getNewString2);

        /*
         * ********************************** endWith
         * ***********************************
         * 1.if you want check string start with specific char and substring
         * 2.get true and false result
         * 
         */
        // boolean getNewString = name.endsWith("r");
        // boolean getNewString2 = name.endsWith("kar");
        // boolean getNewString3 = name.endsWith("rav");
        // System.out.println(name);
        // System.out.println(getNewString);
        // System.out.println(getNewString2);
        // System.out.println(getNewString3);

        /*
         * ******************************* charAt()
         * *****************************************
         * if you get character specific index
         */
        // Character getNewString = name.charAt(0);
        // System.out.println(getNewString);

        /*
         * ************************ indexOf() ******************************************
         * 1.if you get index specific string
         * 2. this method find from staring to ending
         * 3. also we can set index where do he start string
         * 
         */
        // int getNewStringIndex = name.indexOf("R");
        // int getNewStringIndex2 = name.indexOf("Lak");
        // int getNewStringIndex3 = name.indexOf("a",5);
        // System.out.println(name);
        // System.out.println(getNewStringIndex);
        // System.out.println(getNewStringIndex2);
        // System.out.println(getNewStringIndex3);

        /*
         * ************************ lastIndexOf()
         * ******************************************
         * 1.if you get index specific string
         * 2. this method find from ending to starting
         * 3. also we can set index where do he start string , in this case when give
         * index he forget after index and the starting point which index we give and go
         * givenIndex to startingIndex point.
         * 
         */
        // int getNewStringIndex = name.lastIndexOf("R");
        // int getNewStringIndex2 = name.lastIndexOf("Lak");
        // int getNewStringIndex3 = name.lastIndexOf("a",5);
        // System.out.println(name);
        // System.out.println(getNewStringIndex);
        // System.out.println(getNewStringIndex2);
        // System.out.println(getNewStringIndex3);

        /*
         * ********************************* equals() *********************************
         * 1.check string is equal to existing string
         * 2.give true and false in result
         * 3.this is case sensitive
         */

        // boolean getResult = name.equals("Ravi Lakshakar");
        // boolean getResult2 = name.equals("ravi Lakshakar");
        // System.out.println(name);
        // System.out.println(getResult);
        // System.out.println(getResult2);
        /*
         * ********************************* equalsIgnoreCase()
         * *********************************
         * 1.check string is equal to existing string
         * 2.give true and false in result
         * 3.ignore case sensitive
         */

        // boolean getResult = name.equalsIgnoreCase("Ravi Lakshakar");
        // boolean getResult2 = name.equalsIgnoreCase("ravi Lakshakar");
        // System.out.println(name);
        // System.out.println(getResult);
        // System.out.println(getResult2);

        /*
         * ********************************** Escape sequence Character
         * **********************
         * if you add new line , tab space , single quote , backslash then use \
         * (backslash) after that use
         * /n --> new line
         * /t --> tab space
         * /' --> add single quote,
         * //--> add backslash
         * `
         */

        System.out.println("hello ravi \n how are yoy");
        System.out.println("hello ravi \t how are yoy");
        System.out.println("hello \'ravi\'  how are yoy");
        System.out.println("hello \\ravi  how are yoy");

    }
}