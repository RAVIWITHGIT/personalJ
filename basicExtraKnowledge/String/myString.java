/*
 * ******************************************** String
 * ************************************
 * we can create String 4 way
 * first --> String variableName = new String();
 * second --> String variableName = "";
 * third --> StringBuffer variableName = new StringBuffer();
 * four --> StringBuilder variableName = new StringBuilder();
 */

public class myString {
    public static void main(String args[]) {
        // **************** first , this is immutable
        String str = new String("ravi");
        str.concat("lakshakar");
        System.out.println(str);

        // **************** second , this is immutable
        String str2 = "ravi";
        str2.concat("lakshakar");
        System.out.println(str2);

        // **************** third , this is mutable
        StringBuffer str3 = new StringBuffer("ravi");
        str3.append("lakshakar ");
        System.out.println(str3);

        // **************** four , this is mutable
        StringBuilder str4 = new StringBuilder("ravi");
        str4.append(" lakshakar ");
        System.out.println(str4);

        // **************************************************************************
        // ************* StringBuilder capacity and StringBuffer Capacity by default ,
        // mean without give any String
        StringBuilder str5 = new StringBuilder();
        StringBuffer str6 = new StringBuffer();
        System.out.println(str5.capacity());
        System.out.println(str6.capacity());

        // ********* after give String
        StringBuilder str7 = new StringBuilder("ravi");
        StringBuffer str8 = new StringBuffer("lakshakar");
        System.out.println(str7.capacity());
        System.out.println(str8.capacity());

        // ********* set capacity
        // StringBuilder str9 = new StringBuilder(100);
        // StringBuffer str10 = new StringBuffer(200);
        // System.out.println(str9.capacity());
        // System.out.println(str10.capacity());

        // *********** after append , by default give capacity is 16 , same with
        // StringBuilder
        // StringBuilder str9 = new StringBuilder();
        // str9.append("ram");
        // System.out.println(str9.capacity());

        // *********** after append, same with StringBuilder
        // StringBuilder str9 = new StringBuilder();
        // str9.append("ram");
        // System.out.println(str9.capacity());
        // str9.append(" lakshakar");
        // System.out.println(str9.capacity());

        // *********** length
        StringBuilder str9 = new StringBuilder("ravi");
        System.out.println(str9.length());

        // ****************************** reverse() method ******************
        System.out.println(str9.reverse());

    }
}
