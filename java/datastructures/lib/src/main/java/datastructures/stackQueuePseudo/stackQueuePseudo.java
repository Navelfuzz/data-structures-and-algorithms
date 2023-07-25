import java.util.Stack;

public class PseudoQueue<T> {
    private Stack<T> stackOne; // Renamed from stackPush
    private Stack<T> stackTwo; // Renamed from stackPop

    public PseudoQueue() {
        stackOne = new Stack<>();
        stackTwo = new Stack<>();
    }

    public void enqueue(T value) {
        stackOne.push(value);
    }

    public T dequeue() {
        if (stackTwo.isEmpty()) {
            while (!stackOne.isEmpty()) {
                stackTwo.push(stackOne.pop());
            }
        }
        if (stackTwo.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return stackTwo.pop();
    }

    public boolean isEmpty() {
        return stackOne.isEmpty() && stackTwo.isEmpty();
    }

    public int size() {
        return stackOne.size() + stackTwo.size();
    }
