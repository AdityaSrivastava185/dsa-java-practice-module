public class DirectionMaze {
    static void main(String[] args) {
        mazeDirections("", 3,3);
    }
    public static void  mazeDirections(String processed, int row, int col){
        if(row == 1 && col == 1) {
            System.out.println(processed);
            return;
        }
        if(row > 1){
            mazeDirections(processed + 'D', row - 1, col);
        }
        if(col > 1){
            mazeDirections(processed + 'R', row, col - 1);
        }
    }
}
