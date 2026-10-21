package backTracking;
 public class mazePath {

    public static int countPaths(int[][] maze, int row, int col) {

        // Out of bounds
        if (row >= maze.length || col >= maze[0].length) {
            return 0;
        }

        // Blocked cell
        if (maze[row][col] == 0) {
            return 0;
        }

        // Destination reached
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            return 1;
        }

        // Move Right
        int right = countPaths(maze, row, col + 1);

        // Move Down
        int down = countPaths(maze, row + 1, col);

        return right + down;
    }

    public static void main(String[] args) {

        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}
        };

        int paths = countPaths(maze, 0, 0);

        System.out.println("Number of paths from start to destination: " + paths);
    }
}

