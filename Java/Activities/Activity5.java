
package fst;

public class Abstractionactivity {

    public static void main (String[] arg) {

        MyBook b1 = new MyBook("abcd");

        System.out.println("Title of my book is - " + b1.getTitle());
        b1.setTitle("Java Testing");
        System.out.println("New Title of my book is - " + b1.getTitle());

    }
}