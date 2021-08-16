a.second string
   third string
   
b.NestedIf
   second string
   third string
   3 is greater than or equal to 0,
   so execution progresses to the second if statement.
   The second if statement's test fails because 3 is not equal to 0.
   Thus, the else clause executes (since it's attached to the second if statement).
 Thus, second string is displayed. The final println is completely outside of any if statement,
so it always gets executed, and thus third string is always displayed.

c.if (aNumber >= 0)
    if (aNumber == 0)
        System.out.println("first string");
    else
        System.out.println("second string");

System.out.println("third string");


d.if (aNumber >= 0) {
    if (aNumber == 0) {
        System.out.println("first string");
    } else {
        System.out.println("second string");
    }
}

System.out.println("third string");
