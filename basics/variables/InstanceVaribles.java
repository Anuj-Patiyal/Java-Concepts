package basics.variables;

class InstanceVariables {
/*  Instance variables
     1. Declared within a class but outside any method.
     2. Belong to each instance of the class, meaning each object has its own copy.
     3. Also known as non-static fields or member variables.
 */

    int i; // declared an instance variable of int type and given name as i

    public static void main(String[] args){
        InstanceVariables var = new InstanceVariables();
        System.out.println(var.i+ " --> is the default value"); // 0, can print by using ref of class then dot then variable name
        var.i = 74;
        System.out.println(var.i+ " --> is the assigned/modified value");
    }
 }
