// package tut11Abstract;

// ****************************************** Q1+2
abstract class pen {
    abstract void write();

    abstract void refill();
}

class Fountain extends pen {
    void write() {
        System.out.println("write");
    }

    void refill() {
        System.out.println("write");
    }

    void changeNib() {
        System.out.println("change Nib");
    }
}

// ****************************************Q3
class Monke {
    void jump() {
        System.out.println("jumping...");
    }

    void Bite() {
        System.out.println("Biting...");
    }
}

interface BasicAnimal {
    void eat();

    void sleep();
}

class Human extends Monke implements BasicAnimal {
    void speak() {
        System.out.println("hello ji");
    }

    public void eat() {
        System.out.println("eating...");
    }

    public void sleep() {
        System.out.println("sleeping...");
    }
}

// ****************************************@4
abstract class Telephone {
    abstract void ring();

    abstract void lift();

    abstract void disconnect();
}

class SmartTelephone extends Telephone {
    public void ring() {
        System.out.println("ring....");
    }

    public void lift() {
        System.out.println("lift....");
    }

    public void disconnect() {
        System.out.println("disconnect....");
    }

    public void newCamera() {
        System.err.println("click photo...");
    }
}

// *********************************** Q6
interface TvRemote {
    void on();

    void off();

    void incraseVolume();

    void decreaseVolume();
}

interface SmartTvRemote extends TvRemote {
    void connectWithWifi();

    void voiceSearch();
}

class latestRemote implements SmartTvRemote {
    public void on() {
        System.out.println("on...");
    }

    public void off() {
        System.out.println("on...");
    }

    public void incraseVolume() {
        System.out.println("on...");
    }

    public void decreaseVolume() {
        System.out.println("on...");
    }

    public void connectWithWifi() {
        System.out.println("connecting with wifi...");
    }

    public void voiceSearch() {
        System.out.println("voice searching...");
    }
}

public class practiceSet {
    public static void main(String args[]) {

        // ***************************** Q1+2
        Fountain fountainPen = new Fountain();
        // fountainPen.changeNib();

        // ************************Q3
        Human man = new Human();
        // man.jump();
        // man.speak();
        // man.eat();

        // ********************** Q4
        Telephone oldPhone = new SmartTelephone();
        // oldPhone.ring();
        // oldPhone.lift();
        // oldPhone.disconnect();

        // *********************Q5
        Monke munk = new Human();
        // munk.jump();
        // munk.Bite();

        BasicAnimal bn = new Human();
        // bn.sleep();
        // bn.eat();

        // ******************Q6
        TvRemote oldtTvRemote = new latestRemote();
        // oldtTvRemote.incraseVolume();

        latestRemote newrRemote = new latestRemote();
        // newrRemote.on();
        // newrRemote.voiceSearch();

    }

}
