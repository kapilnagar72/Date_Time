package Date_Time;

enum result {
    Pass, fail, Nr;
}
public class enum2 {
    public static void main(String[] args) {
        result res = result.Pass;

        switch (res) {
            case Pass:
                System.out.println("pass");
                break;
            case fail:
                System.out.println("fail");
                break;
            case Nr:
                System.out.println("Nr");
                break;
            default:
                break;
        }
    }
}
