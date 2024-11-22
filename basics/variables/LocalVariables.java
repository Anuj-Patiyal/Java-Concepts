package basics.variables.local;
class LocalVariables {
/*
 * 1. Local Variables declared within a method,constructor, or block.
 * 2. Accessible only within that scope.
 * 3. Created when the scope is entered and destroyed when the scope exits.
*/

    public static void main(String[] args){
        int a; // declare a local variable of int type and given name as a

       System.out.println("Declaring an int type variable a --> " +a); // Assigning of a local variable is mandatory

        a=1; // assign value to a
        System.out.println("Assigning value to a --> " +a);

        a=a++; // modifying a's value'
        System.out.println("After modifying -->" +a);
    }
}
