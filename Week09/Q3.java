import java.util.Scanner;

abstract class Calc {
    protected int a;
    protected int b;

    protected void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    };

    abstract public int calculate();
}

class Add extends Calc {
    public Add(int op1, int op2) {
        setValue(op1, op2);
    }

    @Override
    public int calculate() {
        return a + b;
    }

}

class Sub extends Calc {
    public Sub(int op1, int op2) {
        setValue(op1, op2);
    }

    @Override
    public int calculate() {
        return a - b;
    }
}

class Mul extends Calc {
    public Mul(int op1, int op2) {
        setValue(op1, op2);
    }

    @Override
    public int calculate() {
        return a * b;
    }
}

class Div extends Calc {
    public Div(int op1, int op2) {
        setValue(op1, op2);
    }

    @Override
    public int calculate() {
        return a / b;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 operands & operator >>> ");
        int operand1 = sc.nextInt();
        char operator = sc.next().charAt(0);
        int operand2 = sc.nextInt();
        int res = 0;

        if (operator == '+') {
            Add add = new Add(operand1, operand2);
            res = add.calculate();
        } else if (operator == '-') {
            Sub sub = new Sub(operand1, operand2);
            res = sub.calculate();
        } else if (operator == '*') {
            Mul mul = new Mul(operand1, operand2);
            res = mul.calculate();
        } else if (operator == '/') {
            Div div = new Div(operand1, operand2);
            res = div.calculate();
        }
        System.out.println(res);

        sc.close();
    }
}