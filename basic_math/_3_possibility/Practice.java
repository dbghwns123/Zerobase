package basic_math._3_possibility;

// Practice
// 약수 구하기, 두 수의 최대공약수와 최소공배수 구하기
// 활용) 1~10의 수 중 A의 약수 또는 B의 약수인 경우의 수
// 활용) 1~10의 수 중 A의 약수이면서 B의 약수인 경우의 수

import java.util.ArrayList;

public class Practice {

    //  약수
    public ArrayList getDivisor(int num) {
        ArrayList result = new ArrayList();
        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0) {
                result.add(i);
            }
        }
        result.add(num);

        return result;
    }

    //  최대 공약수
//  GCD: the Greatest Common Denominator
    public int getGCD(int numA, int numB) {
        int gcd = -1;

        ArrayList<Integer> divisorA = this.getDivisor(numA);
        ArrayList<Integer> divisorB = this.getDivisor(numB);

        for (int i1 : divisorA) {
            for (int i2 : divisorB) {
                if (i1 == i2) {
                    if (i1 > gcd) {
                        gcd = i1;
                    }
                }
            }
        }

        return gcd;
    }

    //  최소 공배수
//  LCM: the Lowest Common Multiple
    public int getLCM(int numA, int numB) {
        int lcm = -1;
        int gcd = this.getGCD(numA, numB);

        if (gcd != -1) {
            lcm = numA * numB / gcd;
        }


        return lcm;
    }

    public static void main(String[] args) {

//      Test code
        int number1 = 10;
        int number2 = 6;

        Practice p = new Practice();
        ArrayList l1 = p.getDivisor(number1);   // 10: 1, 2, 5, 10
        ArrayList l2 = p.getDivisor(number2);   // 6: 1, 2, 3, 6
        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);

        System.out.println("최대 공약수: " + p.getGCD(number1, number2));
        System.out.println("최대 공배수: " + p.getLCM(number1, number2));
    }
}
