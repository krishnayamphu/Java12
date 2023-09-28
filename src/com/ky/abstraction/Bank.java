package com.ky.abstraction;

public interface Bank {
    void bankInfo();
    static int getInterestRate(){
        return 7;
    }
}
