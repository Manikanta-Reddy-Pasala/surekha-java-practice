package com.learning.conditionalAssignment;

public class ForLoopInArraySwitchExample {
    public static void main(String[] args) {
        double[] leftValue = {100.0d, 25.0d, 34.0d, 26.0d};
        double[] rightValue = {20.0d, 30.0d, 15.0d, 21.0d};
        char[] opCodes = {'a', 's', 'm', 'd'};
        double[] result = new double[opCodes.length];

        for (int i = 0; i <opCodes.length; i++){
            switch (opCodes[i]) {
                case 'a':
                    result[i] = leftValue[i] + rightValue[i];
                    break;
                case 's':
                    result[i] = leftValue[i] - rightValue[i];
                    break;
                case 'm':
                    result[i] = leftValue[i] * rightValue[i];
                    break;
                case 'd':
                    result[i] = leftValue[i] / rightValue[i];
                    break;
                default:
                    System.out.println("invalid opCode " + opCodes[i]);
                    result[i] = 0.0d;
                    break;
            }

        }

        for (double newResult : result){
            System.out.println(newResult);
        }

    }
}
