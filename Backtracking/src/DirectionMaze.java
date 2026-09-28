import java.util.ArrayList;

public class DirectionMaze {
    static void main(String[] args) {
        ArrayList<String> ans = mazeDirectionList("", 3,3);
        System.out.println(ans);
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
    public static ArrayList<String> mazeDirectionList(String processed, int row , int col){
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<String>();
            list.add(processed);
            return list;
        }
        ArrayList<String> list = new ArrayList<String>();
        if(row > 1){
            list.addAll(mazeDirectionList(processed + "D", row -1 , col));
        }
        if(col > 1){
            list.addAll(mazeDirectionList(processed + "R", row, col - 1));
        }
        return list;
    }
}
