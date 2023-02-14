package ru.netology.sqr;

import java.sql.SQLOutput;

public class SQRService {
    int count =0;
    public int sqrtCeil (int number, int number2) {
        for ( int i = 10; i <= 99; i++ ) {
            if ( i * i >= number && i * i <=number2 ) {
                 count++;
                    }
       }
            return count;
    }
}
