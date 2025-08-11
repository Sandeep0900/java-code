class pen {
    String p;

    public void printTheValue() {
        System.out.print(this.p+" ");
    }

}


public class OOPS {
    public static void main(String[] arr) {
        pen p1 = new pen();
        pen p2 = new pen();

        p1.p = "Sandeep";
        p2.p = "Sharma";

        p2.printTheValue();
        p1.printTheValue();

    }
}
