import java.util.Stack;

class QueueUsingTwoStacks<T> {
    private Stack<T> stackEnqueue; 
    private Stack<T> stackDequeue; 

    public QueueUsingTwoStacks() {
        stackEnqueue = new Stack<>();
        stackDequeue = new Stack<>();
    }

    public void enqueue(T item) {
        
        stackEnqueue.push(item);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        if (stackDequeue.isEmpty()) {
            transferElements();
        }

        return stackDequeue.pop();
    }

    public boolean isEmpty() {
        return stackEnqueue.isEmpty() && stackDequeue.isEmpty();
    }

    public int size() {
        return stackEnqueue.size() + stackDequeue.size();
    }

    private void transferElements() {
        while (!stackEnqueue.isEmpty()) {
            stackDequeue.push(stackEnqueue.pop());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        QueueUsingTwoStacks<Integer> queue = new QueueUsingTwoStacks<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Queue size: " + queue.size());

        System.out.println(queue.dequeue()); 
        System.out.println(queue.dequeue()); 

        queue.enqueue(4);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue()); 

        System.out.println("Is queue empty? " + queue.isEmpty()); 
    }
}
