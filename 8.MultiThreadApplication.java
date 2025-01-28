import java.util.Random;

class NumberGenerator extends Thread {
    private final SharedResource sharedResource;

    public NumberGenerator(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            int number = random.nextInt(100); // Generates a random integer between 0 and 99
            System.out.println("Generated Number: " + number);
            sharedResource.setNumber(number);

            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SquareCalculator extends Thread {
    private final SharedResource sharedResource;

    public SquareCalculator(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (sharedResource) {
                if (sharedResource.isEven()) {
                    int number = sharedResource.getNumber();
                    System.out.println("Square of " + number + ": " + (number * number));
                }
            }
        }
    }
}

class CubeCalculator extends Thread {
    private final SharedResource sharedResource;

    public CubeCalculator(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (sharedResource) {
                if (!sharedResource.isEven()) {
                    int number = sharedResource.getNumber();
                    System.out.println("Cube of " + number + ": " + (number * number * number));
                }
            }
        }
    }
}

class SharedResource {
    private int number;

    public synchronized void setNumber(int number) {
        this.number = number;
    }

    public synchronized int getNumber() {
        return number;
    }

    public synchronized boolean isEven() {
        return number % 2 == 0;
    }
}

public class MultiThreadApplication {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        NumberGenerator numberGenerator = new NumberGenerator(sharedResource);
        SquareCalculator squareCalculator = new SquareCalculator(sharedResource);
        CubeCalculator cubeCalculator = new CubeCalculator(sharedResource);

        numberGenerator.start();
        squareCalculator.start();
        cubeCalculator.start();
    }
}
