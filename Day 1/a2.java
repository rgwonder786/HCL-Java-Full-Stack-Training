//Use of String
public class a2 {
    
    public static void main(String[] args) {
        
        String name = "Rahul";
        System.out.println("Hello" + name);
    }
}
/*
Note: The curly braces {} mark the beginning and the end of a block of code.

System.out.println() may look long, but you can think of it as a single command that means: "Send this text to the screen."

Here's what each part means (you will learn the details later):

-> System is a built-in Java class.
-> out is a member of System, short for "output".
-> println() is a method, short for "print line".
Finally, remember that each Java statement must end with a semicolon (;).
*/
/*
| Keyword      | Meaning                                                                                                                                                   |
| ------------ | --------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **public**   | An **access modifier**. It makes the `main()` method accessible from anywhere so that the Java Virtual Machine (JVM) can call it.                         |
| **static**   | Indicates that the method belongs to the **class**, not to any object. The JVM can invoke `main()` without creating an object of the class.               |
| **void**     | Specifies the **return type**. It means the `main()` method does **not return any Value**.                                                                |
| **main**     | The **name of the method**. The JVM looks specifically for a method named `main` to start program execution.                                              |
| **String[]** | Declares an **array of `String` objects**. It stores the command-line arguments passed to the program when it is executed.                                |
| **args**     | The **parameter name** for the `String` array. You can choose a different valid name (such as `arguments` or `a`), but `args` is the conventional choice. |

*/