package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
            Random r = new Random();
            r.nextInt();

            int r1 = r.nextInt(108);
            System.out.println("Ваш возраст: " + r1);
        }
    }

