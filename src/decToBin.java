public class decToBin {
    public static void binToDec (int bin){
        int mybin = bin;
        int dec = 0;
        int pow = 0;
        while (bin>0){
            int lastdig = bin % 10;
            dec = dec + (lastdig * (int)Math.pow(2, pow));
            pow++;
            bin = bin/10;
        }
        System.out.println("Decimal of "+dec+" of binary "+mybin);
    }
    public static void main(String [] args){
        binToDec(101);
    }
}
