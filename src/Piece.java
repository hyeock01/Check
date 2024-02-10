import java.util.ArrayList;

public abstract class Piece {

//    public position
//    public     완전공개의 접근제한자
//    private    완전비공개의 접근제한자
//    protected  자기자손을 제외한 모두에게 비공개인 접근제한자

//    abstract(추상적인) : 필수적으로 메소드 오버라이딩이 요구됨

//   함수 : [생성제한자] [(나머지 키워드 전부)] [리턴타입(생성자에서만 생략)] [함수이름]() (변수)
//   프로퍼티 : 객체(오브젝트)안에 데이터를 저장하는 공간(변수)
//   변수를 선언하는 공간에 따라 변수의 라이프타임이 정해짐 이 성격에 맞춰 설계를 해야함

    protected String type;
    protected boolean isWhite;
    protected Position position;

    public Piece(String type, boolean isWhite, Position position) {
        this.type = type;
        this.isWhite = isWhite;
        this.position = position;
    }

    public boolean move(Position dest, Piece[][] board){
        return false;
    }

//  객채(a)와 객채(b)를 비교할 때 사용하는 함수 a.equals(b)

    /**
     * 움직임이 유효한지 검사를 한다
      * @param dest 목적지 좌표값
     * @param board 게임의 현재 보드판 상황
     * @return 목적지가 유효한가
     */
    private boolean isValidMove(Position dest, Piece[][] board){

        boolean result = false;

        ArrayList<Position> validMoveList = getValidMoveList(board);
        for (Position position : validMoveList){
            if (dest.equals(position)){
                result = true;
                break;
            }
        }
        return result;
    }

    protected abstract ArrayList<Position> getValidMoveList(Piece[][] board);

    private boolean isInRange(int x, int y){
        return (0 <= x && x < 8 && 0 <= y && y <8);
    }

//    toString : 이 객체를 스트링으로 설명하세요

    @Override
    public String toString() {
        return this.position + ". " + this.type;
    }

    public String getType() {
        return type;
    }

    public Position getPosition() {
        return position;
    }
}
