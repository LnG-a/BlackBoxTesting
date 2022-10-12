public class CheckDice {
    /**
     * Gieo 2 con xúc xắc, kiểm tra có gieo được 2 mặt giống nhau khng?
     *
     * @param dice1 số chấm của con xúc xắc 1
     * @param dice2 số chấm của con xúc xắc 2
     *
     */
    static boolean check(int dice1, int dice2){
        if (dice1<=0||dice1>=7||dice2<=0||dice2>=7) throw new IllegalArgumentException("Invalid Input");
        return dice1==dice2;
    }
}
