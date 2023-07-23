
    import java.util.Scanner;
public class Die {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt(); // Number of faces on the die
            int A = scanner.nextInt(); // Number Chef wants on the first toss
            int B = scanner.nextInt(); // Number Chef wants on the second toss

            int[] faces = new int[N];
            for (int i = 0; i < N; i++) {
                faces[i] = scanner.nextInt();
            }

            double probability = calculateProbability(N, A, B, faces);
            System.out.printf("%.10f\n", probability);
        }

        scanner.close();
    }

    private static double calculateProbability(int N, int A, int B, int[] faces) {
        int countA = 0;
        int countB = 0;
        int total = 0;

        for (int i = 0; i < N; i++) {
            if (faces[i] == A) {
                countA++;
            }
            if (faces[i] == B) {
                countB++;
            }
        }

        // Chef wins if A and B are on separate faces
        if (A != B) {
            return (double) (countA * countB) / (N * N);
        }

        // Chef wins if A and B are on the same face
        return (double) (countA * (countA - 1)) / (N * (N - 1));
    }
}


