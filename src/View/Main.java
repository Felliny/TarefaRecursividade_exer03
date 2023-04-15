package View;

import Controller.FatorialRecursiva;

public class Main {
    public static void main(String[] args) {
        int n= 4;
        FatorialRecursiva fat= new FatorialRecursiva();
        System.out.println("Fatorial: "+ fat.Fatorial(n));
    }
}
