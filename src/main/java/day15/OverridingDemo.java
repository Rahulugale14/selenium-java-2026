package day15;

class Bank {
    double rateOfInterest() {
        return 0;
    }
}

class ICICI extends Bank {
    double rateOfInterest() {
        return 10.5;
    }
}

class SBI extends Bank {
    double rateOfInterest() {
        return 11.5;
    }
}

public class OverridingDemo {
    public static void main (String args[]) {

        ICICI ic = new ICICI();
        System.out.println(ic.rateOfInterest());

        SBI sb = new SBI();
        System.out.println(sb.rateOfInterest());

        Bank b = new Bank();
        System.out.println(b.rateOfInterest());

    }
}
