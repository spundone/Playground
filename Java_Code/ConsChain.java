class ConsChained {
    ConsChained(int data) {
        System.out.println("value passed is: " + data);
    }
}

public class ConsChain extends ConsChained {
    ConsChain(int data) {
        super(data);
    }

    public static void main(String args[]) {
        ConsChain c = new ConsChain(9000);
    }
}