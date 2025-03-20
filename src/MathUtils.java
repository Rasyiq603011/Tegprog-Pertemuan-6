// ****************************************************************
// MathUtils.java
//
// Provides static mathematical utility functions.
//
// ****************************************************************
public class MathUtils{
    //-------------------------------------------------------------
    // Returns the factorial of the argument given
    //-------------------------------------------------------------
    public static int factorial(int n){
        if (n >= 17){
            throw new IllegalArgumentException("Faktorial tidak bisa untuk angka yang lebih besar dari 16");
        }

        if (n < 0){
            throw new IllegalArgumentException("Faktorial tidak bisa untuk angka negatif");
        }

        int fac = 1;
        for (int i=n; i>0; i--){
            fac *= i;
        }
        return fac;
    }
}