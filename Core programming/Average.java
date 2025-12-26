public class Average {
    public static void main(String[] args) {
        int maths = 94;
        int physics = 95;
        int chemistry = 96;
        int totalMarks = 300; // 100 marks each for Maths, Physics, Chemistry

        int sum = maths + physics + chemistry;
        double averagePercent = (sum * 100.0) / totalMarks;

        System.out.println("Sam’s average mark in PCM is " + averagePercent);
    }
}
