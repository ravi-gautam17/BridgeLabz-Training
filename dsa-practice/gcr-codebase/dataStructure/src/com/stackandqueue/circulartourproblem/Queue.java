package stacksandqueue.circulartourproblem;

class Queue {
    private Node front, rear;

    public void enqueue(PetrolPump pump) {
        Node newNode = new Node(pump);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public PetrolPump dequeue() {
        if (front == null) return null;
        PetrolPump pump = front.data;
        front = front.next;
        if (front == null) rear = null;
        return pump;
    }

    public boolean isEmpty() {
        return front == null;
    }
}