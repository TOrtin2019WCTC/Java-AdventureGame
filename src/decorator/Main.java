package decorator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
//        Character basicCharacter = new Spear(new Sword(new BasicCharacter("Bilbo")));
//        System.out.println("Name: " + basicCharacter.getName());
//        System.out.println("Might: " + basicCharacter.getMight());

        int ans = 0;

        Character basicCharacter = new BasicCharacter("Bill");

        do {
            System.out.println("1 to add shield");
            System.out.println("2 to starve");
            System.out.println("3 to add spear");
            System.out.println("4 to add sword");
            System.out.println("5 to kill character");

            ans = keyboard.nextInt();

            switch (ans) {
                case 1:
                    basicCharacter = new Shield(basicCharacter);
                    System.out.println("Name: " + basicCharacter.getName());
                    System.out.println("Might: " + basicCharacter.getMight());
                    break;
                case 2:
                    basicCharacter = new Starving(basicCharacter);
                    System.out.println("Name: " + basicCharacter.getName());
                    System.out.println("Might: " + basicCharacter.getMight());
                    break;
                case 3:
                    basicCharacter = new Spear(basicCharacter);
                    System.out.println("Name: " + basicCharacter.getName());
                    System.out.println("Might: " + basicCharacter.getMight());
                    break;
                case 4:
                    basicCharacter = new Sword(basicCharacter);
                    System.out.println("Name: " + basicCharacter.getName());
                    System.out.println("Might: " + basicCharacter.getMight());
                    break;
                default:

                    break;

            }

        } while (ans != 5);

        System.out.println("He dead..");

    }

}
