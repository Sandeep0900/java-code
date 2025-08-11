class Pen {
    String p;

    public void printTheValue() {
        System.out.print(this.p+" ");
    }

}


public class OOPS {
    public static void main(String[] arr) {
        Pen p1 = new Pen();
        Pen p2 = new Pen();

        p1.p = "Sandeep";
        p2.p = "Sharma";

        p2.printTheValue();
        p1.printTheValue();

    }
}
