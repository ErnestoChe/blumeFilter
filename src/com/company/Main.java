package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BloomFilter bf = new BloomFilter(32);
        bf.add("0123456789");
        bf.add("1234567890");
        bf.add("2345678901");
        bf.add("3456789012");
        bf.add("4567890123");
        bf.add("5678901234");
        bf.add("6789012345");
        bf.add("7890123456");
        bf.add("8901234567");
        bf.add("9012345678");
        System.out.println(bf.isValue("2345678901"));

        byte[] a = new byte[8];
    }
}
