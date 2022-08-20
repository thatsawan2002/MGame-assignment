package monopoly;
// เกมเศรษฐี
public class MGame {
    private int roundCnt;
    private Die[] dice; // เป็นอาเรย์ (โจทย์กำหนดมาว่ามีลูกเต๋าสองลูก)
    private Player[] players; // โจทย์กำหนดขนาดมีว่า 2-8 คน (จำนวนชัดเจนก็ใช้อาเรย์ไปเลย)
    private Board board;

    private static final int N = 20;

    public void playGame(){
        for(roundCnt = 0; roundCnt < N; roundCnt++){
            playRound();
        }
    }

    private void playRound(){ // เรียก method takeTurn ของ player
        for (Player player: players){
            player.takeTurn();
        }
    }
}
