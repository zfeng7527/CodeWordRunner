package ZhiFeng;

public class CodeWordChecker implements StringChecker {
    private int min;
    private int max;
    private String symbol;
    public CodeWordChecker(int min, int max, String symbol){
        this.min = min;
        this.max=max;
        this.symbol=symbol;
    }
}