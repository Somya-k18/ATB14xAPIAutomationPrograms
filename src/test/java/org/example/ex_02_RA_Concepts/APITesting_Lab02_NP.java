package org.example.ex_02_RA_Concepts;

public class APITesting_Lab02_NP {
    public void step1(){
        System.out.println("step 1");
    }
    public void step2(){
        System.out.println("step 2");
    }
    public void step3(String param){
        System.out.println("step 3");
    }

    public static void main(String[] args) {
        APITesting_Lab02_NP np = new APITesting_Lab02_NP();
        np.step1();
        np.step2();
        np.step3("somya");
    }
}
