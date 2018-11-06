

import org.apache.commons.lang3.ArrayUtils;

public class Calculate {
    public int add(int a, int b){
        return a + b;
    }

    public int sub(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public int divide(int a, int b){
        return a / b;
    }

    public int[] arrayCreat(){
        int a = 8, b = 2;
        int[] intArray1 = new int[add(a, b)];
        for(int i = 0; i < intArray1.length; i++){
            intArray1[i] = multiply(a, b);
        }

        int[] intArray2 = new int[sub(a, b)];
        for(int i = 0; i < intArray2.length; i++){
            intArray2[i] = divide(a, b);
        }

        int[] intArray3 = ArrayUtils.addAll(intArray1, intArray2);

        System.out.println(a+b + "个" + multiply(a, b));
        System.out.println(a-b + "个" + divide(a, b));

        return intArray3;
    }

    public void driveCalculate(int a, int b){
        System.out.println(a + "+" + b + "=" + new Calculate().add(a, b));
        System.out.println(a + "-" + b + "=" + new Calculate().sub(a, b));
        System.out.println(a + "*" + b + "=" + new Calculate().multiply(a, b));
        System.out.println(a + "/" + b + "=" + new Calculate().divide(a, b));
    }

    public int[] arrayCreat1(){
        int a = 8, b = 2;
        int[] intArray1 = new int[addPile(a, b)];
        for(int i = 0; i < intArray1.length; i++){
            intArray1[i] = multiply(a, b);
        }

        int[] intArray2 = new int[subPile(a, b)];
        for(int i = 0; i < intArray2.length; i++){
            intArray2[i] = divide(a, b);
        }

        int[] intArray3 = ArrayUtils.addAll(intArray1, intArray2);

        System.out.println(a+b + "个" + multiply(a, b));
        System.out.println(a-b + "个" + divide(a, b));

        return intArray3;
    }

    public int addPile(int a, int b){
        return 10;
    }
    public int subPile(int a, int b){
        return 6;
    }
}
