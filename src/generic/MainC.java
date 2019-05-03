package generic;

public class MainC {
    public static void main(String[] args){
        GenericsC<String> g1 = new GenericsC<>();
        GenericsC<Integer> g2 = new GenericsC<>();

        g1.setT("hh");
        System.out.println(g1.getT());

        g2.setT(3);
        System.out.println(g2.getT());
    }
}
