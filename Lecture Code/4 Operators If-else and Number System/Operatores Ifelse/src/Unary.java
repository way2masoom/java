
class unary {
    public static void main(String[] args) {
        // unary operator(-)
        System.out.println("Unary operator -");
        int x = 5;
        int y = -x;
        System.out.println(y);
        int z = -y;
        System.out.println(z);

        // unary operator(PreIncrement ++)
        System.out.println("Unary operatorPreIncrement(++))");
        int a = 5;
        a = a + 1;
        System.out.println("\n" + a);
        a += 1;
        System.out.println(a);
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);

        // unary operator(PreDecrement --)
        System.out.println("Unary operator PreDecrement (--)");
        int b = 5;
        b = b - 1;
        System.out.println("\n" + b);
        b -= 1;
        System.out.println(b);
        b--;
        System.out.println(b);
        --b;
        System.out.println(b);

        // Unary operator Post Increment
        System.out.println("Unary operator Post Increment(q++)");
        int p = 5;
        System.out.println("\n" + p++);
        System.out.println(p);

        // Unary operator Post Decrement
        System.out.println("Unary operator Post Decrement(q--)");
        int q = 5;
        System.out.println("\n" + q--);
        System.out.println(q);

    }
}
