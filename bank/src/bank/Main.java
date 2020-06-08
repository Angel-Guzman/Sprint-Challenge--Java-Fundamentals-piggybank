package bank;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\nPiggy Bank Open");

        Quarter quarter = new Quarter(" Quarter ", 1, 0.25);
        Dime dime1 = new Dime(" Dime ", 1, 0.10);
        Dollar dollar5 = new Dollar(" Dollars ", 5, 5.00);
        // Dollar dollar5a = new Dollar("$", 5, 5.00);
        Nickel nickel3 = new Nickel(" Nickels ", 3, 0.15);
        Dime dime7 = new Dime(" Dimes ", 7, 0.70);
        Dollar dollar1 = new Dollar(" Dollar ", 1, 1.00);
        // Dollar dollar1a = new Dollar(" Dollar ", 1, 1.00);
        Penny penny10 = new Penny(" Pennies ", 10, 0.10);

        List<AbstractMoney> piggyBank = new ArrayList<>();
        piggyBank.add(quarter);
        piggyBank.add(dime1);
        piggyBank.add(dollar5);
        // piggyBank.add(dollar5a);
        piggyBank.add(nickel3);
        piggyBank.add(dime7);
        piggyBank.add(dollar1);
        // piggyBank.add(dollar1a);
        piggyBank.add(penny10);

        System.out.println();
        System.out.println(piggyBank.toString());

        double bankTotal = quarter.getTotal(1) + dime1.getTotal(1) + dollar5.getTotal(1) 
        + nickel3.getTotal(1) + dime7.getTotal(1) + dollar1.getTotal(1) + penny10.getTotal(1);
        double bankTotalRounded = Math.round(bankTotal * 100.0) / 100.0;

        System.out.println("\nThe piggy bank holds $" + bankTotalRounded + 0);
        System.out.println();

        // $4
        // 7 Dimes
        // $1
        // 10 Pennies

        piggyBank.remove(quarter);
        piggyBank.remove(dime1);
        piggyBank.remove(nickel3);
        System.out.println(piggyBank.toString());

        double newBankTotal = dollar5.getTotal(1) + dime7.getTotal(1) + dollar1.getTotal(1)
        + penny10.getTotal(1);
        double newBankTotalRounded = Math.round(newBankTotal * 100.0) / 100.0;

        System.out.println("\nThe piggy bank holds $" + newBankTotalRounded + 0);
        System.out.println();

    }
}