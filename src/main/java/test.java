public class test {
    public static int lg(int N){
        int count = 0;
        for(int i = 2; i <= N; i *= 2)
            count++;
        return count;
    }

    public static void main(String[] args) {
            StdOut.println(lg(7));
    }
}
