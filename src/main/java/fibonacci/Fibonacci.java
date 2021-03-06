package fibonacci;

class Fibonacci {

    public String generate(int maxNumber) {

        int firstPrevious = 0;
        int secondPrevious = 1;
        String sequence = firstPrevious + ", " + secondPrevious + ", ";
        for (int i = 3; i <= maxNumber; i++) {

            int next = firstPrevious + secondPrevious;
            firstPrevious = secondPrevious;
            secondPrevious = next;
            sequence += next + ", ";
        }

        return sequence.substring(0, sequence.length() - 2);
    }

    static int numberInFibonacci(int n) {
        if (n <= 1)
            return n;
        return numberInFibonacci(n - 1) + numberInFibonacci(n - 2);
    }
}
