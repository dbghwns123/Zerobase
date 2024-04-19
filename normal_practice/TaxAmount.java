package normal_practice;

import java.util.Scanner;

public class TaxAmount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[과세금액 계산 프로그램]");
        System.out.print("연소득을 입력해 주세요.:");
        int annualIncome = scanner.nextInt();

        taxCalculator(annualIncome);
    }

    public static void taxCalculator(int annualIncome) {
        if (annualIncome <= 12000000) {
            taxCalculator_1(annualIncome);
        } else if (annualIncome > 12000000 && annualIncome <= 46000000) {
            taxCalculator_2(annualIncome);
        }
    }

    public static void taxCalculator_1(int annualIncome) {     //1200이하
        double tax = annualIncome * 0.06;
        System.out.println(annualIncome + " *  6% = \t" + tax);
    }
    public static void taxCalculator_2(int annualIncome) {     //1200 초과, 4600 이하
        int income = 0;
        double tax = 0;
        System.out.println(12000000 + " *  6% = \t" + 12000000 * 0.06);
        income = annualIncome - 12000000;
        tax = income * 0.15;
        if (income > 0)
            System.out.println(income + " *  15% = \t" + tax);
    }

    public static void progressiveTax(int annualIncome) {
        double pgsTax;
        if (annualIncome <= 12000000) {
            pgsTax = 0;
            System.out.print("[누진공제 계산에 의한 세금]:\t" + pgsTax);
        } else if (annualIncome > 12000000 && annualIncome <= 46000000) {
            pgsTax = annualIncome * 0.15 - 1080000;
            System.out.print("[누진공제 계산에 의한 세금]:\t" + pgsTax);
        } else if (annualIncome > 46000000 && annualIncome <= 88000000) {
            pgsTax = annualIncome * 0.24 - 5220000;
            System.out.print("[누진공제 계산에 의한 세금]:\t" + pgsTax);
        } else if (annualIncome > 88000000 && annualIncome <= 150000000) {
            pgsTax = annualIncome * 0.35 - 14900000;
            System.out.print("[누진공제 계산에 의한 세금]:\t" + pgsTax);
        } else if (annualIncome > 150000000 && annualIncome <= 300000000) {
            pgsTax = annualIncome * 0.38 - 19499999;
            System.out.print("[누진공제 계산에 의한 세금]:\t" + pgsTax);
        } else if (annualIncome > 300000000 && annualIncome <= 500000000) {
            pgsTax = annualIncome * 0.4 - 25400000;
            System.out.print("[누진공제 계산에 의한 세금]:\t" + pgsTax);
        } else if (annualIncome > 500000000 && annualIncome <= 1000000000) {
            pgsTax = annualIncome * 0.42 - 35400000;
            System.out.print("[누진공제 계산에 의한 세금]:\t" + pgsTax);
        } else {
            pgsTax = annualIncome * 0.45 - 65400000;
            System.out.print("[누진공제 계산에 의한 세금]:\t" + pgsTax);
        }


    }
}
