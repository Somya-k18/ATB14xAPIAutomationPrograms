package org.example.ex_02_RA_Concepts;

public class APITesting_Lab03_BuilderPattern {
    public APITesting_Lab03_BuilderPattern step1(){
        System.out.println("step 1");
        return this;
    }
    public APITesting_Lab03_BuilderPattern step2(){
        System.out.println("step 2");
        return this;
    }
    public APITesting_Lab03_BuilderPattern step3(String param){
        System.out.println("step 3");
        return this;
    }

    public static void main(String[] args) {
        APITesting_Lab03_BuilderPattern bp = new APITesting_Lab03_BuilderPattern();
        bp.step1().step2().step3("somya");
    }
}
