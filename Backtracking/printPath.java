public class printPath {

    public static void print(int sr, int sc, int[][] arr, String s, boolean[][] visited) {
        if (sr < 0 || sc < 0 || sr >= arr.length || sc >= arr[0].length) return;
        if (arr[sr][sc] == 0 || visited[sr][sc]) return;

        if (sr == arr.length - 1 && sc == arr[0].length - 1) {
            System.out.println(s);
            return;
        }

        visited[sr][sc] = true;

        print(sr + 1, sc, arr, s + "D", visited); 
        print(sr - 1, sc, arr, s + "U", visited); 
        print(sr, sc + 1, arr, s + "R", visited); 
        print(sr, sc - 1, arr, s + "L", visited); 
        visited[sr][sc] = false;
    }

    public static void main(String[] args) {
        int[][] maze = {
            {1, 1, 1},
            {1, 1, 1},
            {0, 1, 1}
        };

        boolean[][] visited = new boolean[maze.length][maze[0].length];
        print(0, 0, maze, "", visited);
    }
}