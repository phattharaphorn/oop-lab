public class Queue {

    // Attributes
    private int[] elements;
    private int size = 0;

    // Constructors
    Queue() {
        this.elements = new int[8];
    }

    Queue(int size) {
        this.elements = new int[size];
    }

    // Methods
    public void enqueue(int v) {
        if (this.size == this.elements.length) {
            int[] tmp = new int[this.elements.length * 2];
            System.arraycopy(this.elements, 0, tmp, 0, this.elements.length);
            this.elements = tmp;
        }
        this.elements[this.size] = v;
        this.size++;
    }

    public int dequeue() {
        int tmp = this.elements[0];
        for (int i = 0; i < this.size - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.size--;
        return tmp;
    }

    public boolean empty() {
        return (this.size == 0);
    }

    public int getSize() {
        return this.size;
    }
}