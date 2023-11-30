public class StopWatch {

    // Attributes
    private long startTime;
    private long endTime;

    // constructor
    public StopWatch() {
        this.startTime = System.nanoTime();
    }

    // Method
    public void start() {
        this.startTime = System.nanoTime();
    }

    public void stop() {
        this.endTime = System.nanoTime();
    }

    public double getElapsedTime() {
        return (this.endTime - this.startTime) / 1000000.0;
    }
}
