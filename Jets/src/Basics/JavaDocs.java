package Basics;

/**
 * This calss is to demonstrate what javadoc is  and how it is used in the java industry
 *This is <i>italic</i> word<p>This is a new paragraph</p>
 * @author Himanshu Haldkar
 * @version 0.1
 * @since 2005
 * @see <a href="https://docs.oracle.com/en/java/14/docs/api/index,html" target="_blank">Java Docs</a>
 */

public class JavaDocs {
    public void add(int a, int b) {
        System.out.println("The sum is "+ a+b);
    }

    static void main() {
        System.out.println("This is my main Method");
    }
}
