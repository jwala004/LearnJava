package questions;

public class InstanceBlock {

    {
        System.out.println("Instance Block 1");
    }

    private InstanceBlock() {
        System.out.println("O argument constructor");
    }

    private InstanceBlock(int num1) {
        System.out.println("1 argument constructor");
    }

    public static void main(String[] args) {

        InstanceBlock instanceBlock = new InstanceBlock();

    }

}
