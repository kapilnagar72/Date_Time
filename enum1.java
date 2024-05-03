package Date_Time;

enum week {
    Mon, Tue, Wed, Tha, Fri, Sat, Sun;
}

public class enum1 {
    
    enum result {
        Pass, Fail, NR;
    }
    public static void main(String[] args) {
        week w = week.Fri;
        System.out.println(w);

        result r = result.Pass;
        System.out.println(r);
    }
}
