package EncryptionPack;

public class Encrypt {

    public static void main(String[] args) {
        int key = 1;
        String text = "Ifz-!ipx(t!ju!ibohjo@";
        System.out.println(text);
        char[] chars = text.toCharArray();

        for(char c: chars){
            c -= key;
            System.out.print(c);
        }




    }
}
