package data;

public class GreenTicket {

    private int first;
    private int second;
    private int third;
    private int result;

    public GreenTicket(int a, int b, int c) {
    this.first = a;
    this.second = b;
    this.third = c;
    this.result = this.compareNumbers();
    }

    public void showResult() {
        System.out.println("Green lottery ticket   "
                + this.first + " : "
                + this.second + " : "
                + this.third);
        System.out.println("The result: " + this.result);
        System.out.println();
    }

    public int compareNumbers () {
        int temp = 0;
        int a = this.first;
        int b = this.second;
        int c = this.third;
        if (a == b && a == c) {
            temp = 20;
        } else if (a == b || a == c || b == c) {
            temp = 10;
        } else if (a != b && a != c && b != c) {
            temp = 0;
        }
        return temp;
    }
}
