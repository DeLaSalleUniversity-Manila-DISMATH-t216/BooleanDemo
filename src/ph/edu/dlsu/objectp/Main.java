package ph.edu.dlsu.objectp;

public class Main {

    private static boolean p = true;
    private static boolean q = true;

    public static void main(String[] args) {

        printAndTruthTable();
        System.out.println("");
        printOrTruthTable();
        System.out.println("");
        printXorTruthTable();

    }

    public static void printAndTruthTable() {
        System.out.println(" AND TRUTH TABLE: ");
        System.out.println("=================================");
        System.out.println("    p     |     q    |   p && q  ");
        System.out.println("=================================");
        System.out.println("  " + !p + "   |   " + !q + "  |   " + (!p && !q));
        System.out.println("  " + !p + "   |   " + q + "   |   " + (!p && q));
        System.out.println("  " + p + "    |   " + !q + "  |   " + (p && !q));
        System.out.println("  " + p + "    |   " + q + "   |   " + (p && q));
        System.out.println("=================================");
    }

    public static void printOrTruthTable() {
        System.out.println(" OR TRUTH TABLE: ");
        System.out.println("=================================");
        System.out.println("    p     |     q    |   p || q  ");
        System.out.println("=================================");
        System.out.println("  " + !p + "   |   " + !q + "  |   " + (!p || !q));
        System.out.println("  " + !p + "   |   " + q + "   |   " + (!p || q));
        System.out.println("  " + p + "    |   " + !q + "  |   " + (p || !q));
        System.out.println("  " + p + "    |   " + q + "   |   " + (p || q));
        System.out.println("=================================");
    }

    public static void printXorTruthTable() {
        System.out.println(" XOR TRUTH TABLE: ");
        System.out.println("=================================");
        System.out.println("    p     |     q    |   p XOR q  ");
        System.out.println("=================================");
        System.out.println("  " + !p + "   |   " + !q + "  |   " + (!p ^ !q));
        System.out.println("  " + !p + "   |   " + q + "   |   " + (!p ^ q));
        System.out.println("  " + p + "    |   " + !q + "  |   " + (p ^ !q));
        System.out.println("  " + p + "    |   " + q + "   |   " + (p ^ q));
        System.out.println("=================================");
    }
}
