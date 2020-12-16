public class B1 {
    public static void main(String[] args) {
        int i = 1;


        if (i == 1) {
            System.out.println("A");
        } else if (i == 2) {
            System.out.println("B");
        } else if (i == 3) {
            System.out.println("C");
        } else if (i == 4) {
            System.out.println("D");
        }

        switch (i) {
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            case 4:
                System.out.println("D");
                break;
            default:
                break;
        }

    }
}
