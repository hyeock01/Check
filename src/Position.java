import java.util.Objects;

public class Position {

    private int x;
    private int y;

    private Position(){
    }
    public Position(int x, int y) {

        if (range(x)&&range(y)){
//            System.out.println("마시쩡");
            this.x = x;
            this.y = y;
        }
        else {
            System.out.println("[" + getClass() + "] 좌표값이 잘못되었음");
            this.x = 0;
            this.y = 0;
        }
    }

    // getClass : 자신이 어떤 클래스인지 표시함

    private boolean range(int p){
//        if (0 <= x && x <= 7){
//            return true;
//        }
//        return false;
//
        return (0 <= p && p <= 7);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x && y == position.y;
    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
