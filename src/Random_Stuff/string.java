package Random_Stuff;

public class string {

    /*public static void main(String[] args) {
        String str1="Java Program";  //String Object that will be created in the pool
        System.out.println(str1);

        String str2= new String("Java");  //Here we are using the Constructor to create the object.
        System.out.println(str2);

        char c[] = {'J','A','V','A'}; //Character Array Constructor for Object Creation
        String str3= new String(c);
        System.out.println(str3);

        byte b[] = {99,106,117,120}; //Byte Array Constructor for Object Creation
        String str4= new String(b);
        System.out.println(str4);

    }*/


    /*public static void main(String[] args) {
        String str1="Java Program";  //String Object that will be created in the pool

        System.out.println(str1.length()); //Length of the String

        System.out.println(str1.toLowerCase()); //It will convert everything into lowercase
        //Internally this will happen in this way str2 = str1.toLowerCase() and str2 will be printed.
        //To change it completely we can do this str1 = str1.toLowerCase(), here we are not modifying we are just changing the reference.
        //str1 = str1.toLowerCase();

        /*System.out.println(str1);

        System.out.println(str1.toUpperCase());

        System.out.println(str1.trim()); //Removes front and trailing white spaces

        System.out.println(str1.substring(2)); //Print new Random_Stuff.string starting from the given index

        System.out.println(str1.substring(2, 10));  //Print new Random_Stuff.string starting from the given index to the last given index

        System.out.println(str1.replace('J', 'K'));  //Replace the given character by the new character

        System.out.println(str1.isBlank());

        System.out.println(str1.endsWith("Program"));

        System.out.println(str1.startsWith("Java"));

        System.out.println(str1.endsWith("m"));

        System.out.println(str1.startsWith("J"));*/

       /*  System.out.println(str1.startsWith("J", 5));

        System.out.println(str1.charAt(8));

        System.out.println(str1.indexOf("g"));

        System.out.println(str1.indexOf("va"));

        System.out.println(str1.indexOf("a",4)); //Here this will start looking after the 4th index place.

        System.out.println(str1.lastIndexOf("v")); //It search from the right hand side

    }*/

    /*public static void main(String[] args) {
        String str1 = "JAVA";
        String str2 = "java";
        String str3 = "python";
        String str4 = "python";

        System.out.println(str3.equals(str4));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

    }*/

    /*public static void main(String[] args) {
        String str1 = "java";
        String str2 = " java";

        String str3 = new String(" java");

        System.out.println(str1.equals(str2)); //Here we are checking the content is the same
        System.out.println(str1==str2); //Here we are checking if they are sharing the same references

        System.out.println(str1.equals(str3));
        System.out.println(str1==str3);

        System.out.println(str1.concat(str2));

        System.out.println(str2 + str3 );
    }*/

    public static void main(String[] args) {
        String str = "programmer@gmail.com";
        int i;
        System.out.println(str.length());

        System.out.println(str.contains("@gmail.com"));

        System.out.println(i=str.indexOf('@'));

        System.out.println(str.substring(0, i));

        System.out.println(str.substring(i+1, str.length()));


    }

}


