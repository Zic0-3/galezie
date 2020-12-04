package com.company;

public class Main {
    static void zmien(int[] tab, int a, int b){
        int x = tab[a];
        tab[a] = tab[b];
        tab[b] = x;
    }

    static void piszElemnty(int[] tab){
        for(int i=0; i<8; i++){
            System.out.println(tab[i]);
        }
    }

    public static void main(String[] args) {
        int[] tablica = {2,4,5,7,7,2,4,1,9};
        zmien(tablica, 0, 2);
        piszElemnty(tablica);
    }
}