import java.util.*;

public class rostering{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of employees and friendships
        int N = sc.nextInt();
        int M = sc.nextInt();

        // Build the adjacency list for friendships
        List<List<Integer>> friends = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            friends.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            friends.get(a).add(b);
            friends.get(b).add(a);
        }

        // Read the rostering value to be achieved
        int K = sc.nextInt();
        sc.close();

        // Initialize variables
        int[] currentAttendance = new int[N];
        Arrays.fill(currentAttendance, 1); // Day 1: All employees attend the office
        int cumulativeRosteringValue = N; // Day 1 contribution
        int days = 1;

        // Simulate day by day
        while (cumulativeRosteringValue < K) {
            int[] nextAttendance = new int[N];
            for (int i = 0; i < N; i++) {
                int workingFriends = 0;
                for (int friend : friends.get(i)) {
                    workingFriends += currentAttendance[friend];
                }
                // Check if at least half of the employee's friends attended
                if (workingFriends >= (friends.get(i).size() + 1) / 2) {
                    nextAttendance[i] = 1;
                }
            }

            // Update attendance and cumulative rostering value
            currentAttendance = nextAttendance;
            cumulativeRosteringValue += Arrays.stream(currentAttendance).sum();
            days++;
        }

        // Output the result
        System.out.println(days);
    }
}
