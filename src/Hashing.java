public class Hashing {
    public static void main(String[] args) {
        int keyMod10 = Math.abs((("Gino").hashCode()%10 % 29));
        System.out.println(keyMod10);
       // int hashkey =
       // System.out.println("Pax".hashCode());System.out.println(Math.abs("Pax".hashCode() % 10)% 29);
    }
}
