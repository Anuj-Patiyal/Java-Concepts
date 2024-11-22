package basics.variables;
class DeclareAndInitializeVarialbe {
    // can declare variable anywhere inside the class body
    int i; // declaration of variable (int type)

    public static void main(String[] args){
        DeclareAndInitializeVarialbe var = new DeclareAndInitializeVarialbe();
        var.i=32;
        String s = "Welcome to java"; // declaration + initialization of a variable (String type)
        System.out.println(var.i);
        System.out.println(s);
    }
}
