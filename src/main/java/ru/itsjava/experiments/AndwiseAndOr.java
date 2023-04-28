package ru.itsjava.experiments;

public class AndwiseAndOr {
    public static void main(String[] args) {

        int x = 254;
        System.out.println("x decimal: " + x);
        String binaryX = Integer.toBinaryString(x);
        System.out.println("x binary: " + binaryX);
        System.out.println("Integer.parseInt(binaryX) = " + Integer.parseInt("1000", 2));
        System.out.println("Integer.parseUnsignedInt(binaryX) = " + Integer.parseUnsignedInt(binaryX,10));
        System.out.println("(x & 0xff) = " + (x & 0xff));
    }
}
