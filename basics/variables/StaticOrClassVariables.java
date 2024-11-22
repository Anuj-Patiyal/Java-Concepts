package basics.variables;
class StaticOrClassVariables {
/* Class or Instance variables
    1.Declared within a class using the static keyword.
    2.Belong to the class itself, not to individual objects.
    3.Shared by all instances of the class.
 */
    static String s = "Welcome to java";
    public static void main(String[] args){
        System.out.println(s);
    }
 }
