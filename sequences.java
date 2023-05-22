class sequences {

    // initialize variables
    static int selection;

    // equation variables 
    static double a;
    static double r;
    static double n;
    static double d;
    static int tn;
    static int Sn;
    static int answer;

    public static void main(String[] args) {
        
        // loop
        while (true) {
            System.out.println("\nWhich equation do you want to use?");
            System.out.println("1. tn = a + (n-1)d \n2. tn = ar^(n - 1) \n3. Sn = n/2(2a + (n - 1)d) \n4. Sn = a(r^n - 1)/(r-1) \n5. Sn = n/2(a + tn) \n6. Solve for Sum (Sn)" );
            System.out.println("Press 7 to exit");
            System.out.print("   >  ");
            selection = In.getInt();

            if (selection == 1) {
            arithmeticSequence();
            } else if (selection == 2){
            geometricSequence();
            } else if (selection == 3){
            arithmeticSeriesWithoutTN();
            } else if (selection == 4){
            geometricSeries();
            } else if (selection == 5){
            arithmeticSeriesWithTN();
            } else if (selection == 6){
                solveSn();
            } else if (selection == 7){
                System.out.println("\nBye Bye");
                break;
            }
        }
    }

    public static void arithmeticSequence() {
        System.out.println("\nArithmetic Sequence");

        // gather variables
        System.out.println("\nWhat is your a variable?");
        a = In.getDouble();
        System.out.println("\nWhat is your n variable?");
        n = In.getDouble();
        System.out.println("\nWhat is your d variable?");
        d = In.getDouble();
        System.out.println("\nWhat is your term (tn)?");
        tn = In.getInt();

        // do math
        answer = (int) (a + (n - 1) * d);

        // print answer
        System.out.println("\nThe answer is: " + answer);
    }

    public static void geometricSequence() {
        System.out.println("\nGeometric Sequence");

        // gather variables
        System.out.println("\nWhat is your a variable?");
        a = In.getDouble();
        System.out.println("\nWhat is your r variable?");
        r = In.getDouble();
        System.out.println("\nWhat is your n variable?");
        n = In.getDouble();
        System.out.println("\nWhat is your term (tn)?");
        tn = In.getInt();
 
        // do math
        double y = n - 1;
        double x = Math.pow(r, y);
        answer = (int) (a * x);
 
        // print answer
        System.out.println("\nThe answer is: " + answer);
    }

    public static void arithmeticSeriesWithoutTN() {
        System.out.println("\nArithmetic Series without tn Variable");

        // gather variables
        System.out.println("\nWhat is your a variable?");
        a = In.getDouble();
        System.out.println("\nWhat is your r variable?");
        r = In.getDouble();
        System.out.println("\nWhat is your d variable?");
        d = In.getDouble();
        System.out.println("\nWhat is your n variable?");
        n = In.getDouble();
        System.out.println("\nWhat is your term (Sn)?");
        Sn = In.getInt();
 
        // do math
        double x = n - 1;
        double y = n / 2;
        answer = (int) (y * (2 * a + (x * d)));
 
        // print answer
        System.out.println("\nYour answer is: " + answer);
    }

    public static void geometricSeries() {
        System.out.println("\nGeometric Series");

        // gather variables
        System.out.println("\nWhat is your a variable?");
        a = In.getDouble();
        System.out.println("\nWhat is your r variable?");
        r = In.getDouble();
        System.out.println("\nWhat is your n variable?");
        n = In.getDouble();
        System.out.println("\nWhat is your term (Sn)?");
        Sn = In.getInt();
 
        // do math
        double x = n - 1;
        double y = Math.pow(r, x);

        answer = (int) ((a * y)/ (r - 1));
 
        // print answer
        System.out.println("\nYour answer is: " + answer);
    }

    public static void arithmeticSeriesWithTN() {
        System.out.println("\nArithmetic Series with tn Variable");

        // gather variables
        System.out.println("\nWhat is your a variable?");
        a = In.getDouble();
        System.out.println("\nWhat is your n variable?");
        n = In.getDouble();
        System.out.println("\nWhat is your tn variable?");
        tn = In.getInt();
        System.out.println("\nWhat is your term (Sn)?");
        Sn = In.getInt();
 
        // do math
        double x = n / 2;
        double y = a + tn;

        answer = (int) (x * y);
 
        // print answer
        System.out.println("\nYour answer is: " + answer);
    }

    public static void solveSn() {
        System.out.println("\nSolve for Sum (Sn)");

        // gather variables
        System.out.println("\nWhat is your a variable?");
        a = In.getDouble();
        System.out.println("\nWhat is your n variable?");
        n = In.getDouble();
        System.out.println("\nWhat is your d variable?");
        d = In.getInt();
        System.out.println("\nWhat is your sum (Sn)?");
        Sn = In.getInt();

        // do math 
        double x = (int) (n - 1);
        double y = (int) a * 2;

        answer = (int) (n * (y + (x * d))) / 2;

        // print answer
        System.out.println("\nYour answer is: " + answer);
    }
}