import java.util.Scanner;

class Tax0 {
    double taxcalc(double sal) {
        return 0.0;
    }
}

class Tax1 {
    double taxcalc(double sal) {
        return 0.05 * (sal - 300000.0);
    }
}

class Tax2 {
    double taxcalc(double sal) {
        return 15000.0 + (0.1 * (sal - 600000.0));
    }
}

class Tax3 {
    double taxcalc(double sal) {
        return 45000.0 + (0.15 * (sal - 900000.0));
    }
}

class Tax4 {
    double taxcalc(double sal) {
        return 90000.0 + (0.2 * (sal - 1200000.0));
    }
}

class Tax5 {
    double taxcalc(double sal) {
        return 150000.0 + (0.3 * (sal - 1500000.0));
    }
}

public class Taxcalculator {
    public static void main(String[] args) {
        double sal, tax = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your annual income");
        sal = sc.nextDouble();
        
        if (sal <= 300000) {
            Tax0 tx = new Tax0();
            tax = tx.taxcalc(sal);
        } else if (sal <= 600000) {
            Tax1 tx = new Tax1();
            tax = tx.taxcalc(sal);
        } else if (sal <= 900000) {
            Tax2 tx = new Tax2();
            tax = tx.taxcalc(sal);
        } else if (sal <= 1200000) {
            Tax3 tx = new Tax3();
            tax = tx.taxcalc(sal);
        } else if (sal <= 1500000) {
            Tax4 tx = new Tax4();
            tax = tx.taxcalc(sal);
        } else {
            Tax5 tx = new Tax5();
            tax = tx.taxcalc(sal);
        }

        System.out.println("Your annual tax is: " + tax);
    }
}
