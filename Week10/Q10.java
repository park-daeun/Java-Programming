import java.util.ArrayList;

interface IStack<T> {
    T pop();

    boolean push(T ob);
}

class MyStack<T> implements IStack<T> {
    ArrayList<T> al;

    MyStack() {
        this.al = new ArrayList<T>();
    }

    public T pop() {
        if (al.size() == 0) {
            return null;
        } else {
            return al.remove(0);
        }
    }

    public boolean push(T ob) {
        al.add(0, ob);
        return true;
    }
}

public class Q10 {
    public static void main(String[] args) {
        IStack<Integer> stack = new MyStack<Integer>();
        for (int i = 0; i < 10; i++)
            stack.push(i);
        while (true) {
            Integer n = stack.pop();
            if (n == null)
                break;
            System.out.print(n + " ");
        }
    }
}
