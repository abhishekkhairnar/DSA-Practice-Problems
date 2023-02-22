package Strings;

public class PreetyPrinting {
    public static void main(String[] args) {
        float a = 3.134324f;
        System.out.printf("formatted value is %.2f",a);
        System.out.println();
        System.out.printf("My name is %s and i am a %s","abhishek","developer");
    }
}

// Format Specifier	Conversion Applied
// %%	Inserts a % sign
// %x %X	Integer hexadecimal
// %t %T	Time and Date
// %s %S	String
// %n	Inserts a newline character
// %o	Octal integer
// %f	Decimal floating-point
// %e %E	Scientific notation
// %g	Causes Formatter to use either %f or %e, whichever is shorter
// %h %H	Hash code of the argument
// %d	Decimal integer
// %c	Character
// %b %B	Boolean
// %a %A	Floating-point hexadecimal