import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {

        Piece a = new Piece("y",true,new Position(3,6)) {
            @Override
            protected ArrayList<Position> getValidMoveList(Piece[][] board) {
                return null;
            }
        };
        System.out.println(a.toString());
    }
}