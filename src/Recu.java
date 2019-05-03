public class Recu {

    public static void main(String[] args){
        System.out.println("hohoi");
        System.out.println(rec_sum(1000));
    }

    private static int rec_sum(int n){
        if (n == 0) return 0;
        return n + rec_sum(n-1);
    }
}
