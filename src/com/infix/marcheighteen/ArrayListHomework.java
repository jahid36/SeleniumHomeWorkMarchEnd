package com.infix.MyJavaHwMarchEighteen;

import com.infix.java.util.ArrayList;

public class ArrayListHomework {

    public static void main (String [] args) {

    // This Array how you add manually.

    String[] animal = new String[4];
        animal[0] = "Dog";
        animal[1] = "Cat";
        animal[2] = "Cow";
        animal[3] = "Fox";
    System.out.println(animal [0]);

    //  ArrayList.....

    com.infix.marcheighteen.ArrayList animalList = new ArrayList();
    animalList.add("Dog");
    animalList.add("Cat");
    animalList.add("Cow");
    animalList.add("Fox");
    animalList.remove(3);
    animalList.remove("cow");

    System.out.println(animalList.contains("cow"));
    System.out.println(animalList);

}
}

