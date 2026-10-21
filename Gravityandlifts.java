// import java.util.*;

// public class Gravityandlifts {

//     static class State {
//         int row, col, cellsUsed, liftsUsed;

//         State(int row, int col, int cellsUsed, int liftsUsed) {
//             this.row = row;
//             this.col = col;
//             this.cellsUsed = cellsUsed;
//             this.liftsUsed = liftsUsed;
//         }
//     }

//     // Check if a cell is stable (either at the bottom row or has a solid cell below)
//     static boolean isStable(int x, int y, int[][] grid, int n) {
//         return x == n - 1 || grid[x + 1][y] == 1;
//     }

//     // Simulate gravity: fall straight down until hitting bottom or solid ground
//     static int[] applyGravity(int x, int y, int[][] grid, int n) {
//         while (x < n - 1 && grid[x + 1][y] == 0) {
//             x++;
//         }
//         return new int[]{x, y};
//     }

//     // BFS to find minimum steps to destination
//     public static int minStepsToDestination(int n, int m, int[][] grid, int[] start, int[] destination) {
//         start = applyGravity(start[0], start[1], grid, n);
//         destination = applyGravity(destination[0], destination[1], grid, n);

//         if (!isStable(destination[0], destination[1], grid, n)) {
//             return -1; // Destination is not reachable
//         }

//         Queue<State> queue = new LinkedList<>();
//         queue.offer(new State(start[0], start[1], 0, 0));
//         Set<String> visited = new HashSet<>();
//         visited.add(start[0] + "," + start[1]);

//         while (!queue.isEmpty()) {
//             State current = queue.poll();
//             int x = current.row, y = current.col;

//             // Reached destination
//             if (x == destination[0] && y == destination[1]) {
//                 return current.cellsUsed + current.liftsUsed;
//             }

//             // Try to go up using lifts
//             for (int i = x - 1; i >= 0; i--) {
//                 if (grid[i][y] == 1) { // There's a lift
//                     int[] newPos = applyGravity(i, y, grid, n);
//                     String key = newPos[0] + "," + newPos[1];
//                     if (!visited.contains(key)) {
//                         visited.add(key);
//                         queue.offer(new State(newPos[0], newPos[1], current.cellsUsed, current.liftsUsed + 1));
//                     }
//                 } else {
//                     break; // No lift upwards in this column
//                 }
//             }

//             // Try to move left or right if on bottom row
//             if (x == n - 1) {
//                 for (int dy : new int[]{-1, 1}) {
//                     int ny = y + dy;
//                     if (ny >= 0 && ny < m) {
//                         int[] newPos = applyGravity(x, ny, grid, n);
//                         String key = newPos[0] + "," + newPos[1];
//                         if (!visited.contains(key)) {
//                             visited.add(key);
//                             queue.offer(new State(newPos[0], newPos[1], current.cellsUsed + 1, current.liftsUsed));
//                         }
//                     }
//                 }
//             }
//         }

//         return -1; // No path found
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input grid dimensions
//         int n = sc.nextInt();
//         int m = sc.nextInt();

//         // Input grid
//         int[][] grid = new int[n][m];
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 grid[i][j] = sc.nextInt();
//             }
//         }

//         // Input start and destination coordinates
//         int[] start = {sc.nextInt(), sc.nextInt()};
//         int[] destination = {sc.nextInt(), sc.nextInt()};

//         // Get the result
//         int result = minStepsToDestination(n, m, grid, start, destination);

//         // Output the result
//         System.out.println(result == -1 ? "Impossible" : result);
//     }
// }
