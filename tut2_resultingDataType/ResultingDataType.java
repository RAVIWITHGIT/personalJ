/*
result = byte+short ==> integer
result = short+int ==> integer
result = long+float ==> float
result = integer+float ==> float
result = character+integer ==> integer
result = character+short ==> integer
result = long+double ==> double
result = float+double ==> double

 */





public class ResultingDataType{
    public static void main(String args[]){
        System.out.println('a'+1);
        Character b = 'a'+1;
        System.out.println(b);
        Character c= 'a';
        System.out.println(++c);
    }
}