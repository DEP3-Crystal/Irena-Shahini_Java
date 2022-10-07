import java.io.*;
public class Hashcode {
        public static void main(String args[]) {
            String a = "100";
            String b = "100";
            if(a.equals(b))
            {
                System.out.println("Equal variables:");
                System.out.println(a.hashCode() + "\n" + b.hashCode());
            }

            String c = "100";
            String d = "500";

            if(!c.equals(d))
            {
                System.out.println("\nUn-equal variables:");
                System.out.println(c.hashCode() + "\n" + d.hashCode());
            }
            String Str = new String("We are learning hashCode in Java");
            System.out.println("Hashcode for Str :" + Str.hashCode() );
        }

}
