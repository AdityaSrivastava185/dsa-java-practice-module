public class Main {
    static void main(String[] args) {
        int ans = countPath(3,3);
        System.out.println(ans);
    }
    // Maze
    public static int countPath(int row, int col){
        if(row == 1 || col == 1){
            return 1;
        }
        int left = countPath(row - 1, col);
        int right = countPath(row, col - 1);

        return left + right;
    }
}