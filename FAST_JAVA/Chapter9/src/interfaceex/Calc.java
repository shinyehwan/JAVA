package interfaceex;

import java.sql.Connection;

public interface Calc {
    
    double PI = 3.14;
    int ERROR = -999999999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divdie(int num1, int num2);

    // Connection, statement, result set
}
