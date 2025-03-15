
import java.util.*;

class Bank {

    String bankName;
    int depositAmount;
    static int totalAmount = 0;

    void setBankName(String bankName) {
        this.bankName = bankName;
    }

    void setAmount(int depositAmount) {
        if (depositAmount < 1000) {
            System.out.println("Minimum deposit amount is 1000. Setting it to 1000.");
            this.depositAmount = 1000;
        } else {
            this.depositAmount = depositAmount;
        }
        totalAmount += this.depositAmount;
    }

    void showData() {
        System.out.println("Bank Name: " + bankName + ", Deposit Amount: " + depositAmount);
    }

    public static void findMinDeposit(Bank[] banks) {
        int min = banks[0].depositAmount;
        String minBank = banks[0].bankName;

        for (int i = 1; i < banks.length; i++) {
            if (banks[i].depositAmount < min) {
                min = banks[i].depositAmount;
                minBank = banks[i].bankName;
            }
        }
        System.out.println("Bank with minimum deposit: " + minBank + " (" + min + ")");
    }
}

public class HAQ13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank[] banks = new Bank[5];
        for (int i = 0; i < banks.length; i++) {
            banks[i] = new Bank();
            System.out.print("Enter bank name for bank " + (i + 1) + ": ");
            String bankName = sc.nextLine();
            banks[i].setBankName(bankName);

            System.out.print("Enter deposit amount for " + bankName + ": ");
            int depositAmount = sc.nextInt();
            System.out.println();
            banks[i].setAmount(depositAmount);

        }

        System.out.println("\nDeposited Amounts:");
        for (int i = 0; i < banks.length; i++) {
            banks[i].showData();
        }

        System.out.println("\nTotal Amount Deposited: " + Bank.totalAmount);
        Bank.findMinDeposit(banks);
    }
}
