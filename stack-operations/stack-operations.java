import java.util.ArrayList;

class MyStack {
    ArrayList<Integer> stack = new ArrayList<>();

    void push(int x) {
        stack.add(x);
    }

    void pop() {
        if (!stack.isEmpty()) {
            stack.remove(stack.size() - 1);
        }
    }

    int peek() {
        return stack.get(stack.size() - 1);
    }

    boolean isEmpty() {
        return stack.isEmpty();
    }

    int getSize() {
        return stack.size();
    }
}