import org.testng.annotations.Test;

import java.io.*;
import java.util.*;

public class StringCalculator {
    @Test
    public static void main(String[] args) {
        try {
            System.out.println(CheckForValidation.checkForInput(""));
            System.out.println(CheckForValidation.checkForInput("1"));
            System.out.println(CheckForValidation.checkForInput("1,2"));
            System.out.println(CheckForValidation.checkForInput("1\n2,3")); // 3
            System.out.println(CheckForValidation.checkForInput("1,\n")); // 3
            System.out.println(CheckForValidation.checkForInput("//;\\n1;2")); // 4
//            Remove this comments but you get negative number Error message :/
//            System.out.println(CheckForValidation.checkForInput("//;\\n1;-2;-1,9")); //ERROR //5
//            System.out.println(CheckForValidation.checkForInput("//;\\n1;-2;")); // ERROR //5
            System.out.println(CheckForValidation.checkForInput("1+101"));
            System.out.println(CheckForValidation.checkForInput("1+1001")); // 6
            System.out.println(CheckForValidation.checkForInput("//[***]\\n1***2***3")); //7
            System.out.println(CheckForValidation.checkForInput("//[*][%]\\n1*2%3")); //8,9

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
