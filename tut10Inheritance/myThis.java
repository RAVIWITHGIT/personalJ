/*  ********************************************** thus keyword **************************************
this keyword refer to class object
if we want pass class object bia method then we use this keyword , because this keyword refer to class object
*/

class firstClas {
    int adc;

    // ********** agar hum is tareeke so karate hai to vah samajh hee nahin paega ki
    // adc koi property hai ya koee parameter hai
    // public firstClas(int adc) {
    // adc = adc;
    // }

    public firstClas(int adc) {
        this.adc = adc;
    }

    public void getCall() {
        System.out.println(adc);
    }
}

public class myThis {
    public static void main(String args[]) {
        firstClas newFirstClass = new firstClas(5);
        newFirstClass.getCall();
    }
}