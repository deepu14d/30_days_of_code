public class RangeXOR {
    public static void main(String[] args) {
        int a = 3;
        int b = 8;
        int ans = rangeXOR(a, b);
        System.out.println(ans);
    }

    public static int rangeXOR(int a, int b){
        int ans = xor(b) ^ xor(a-1);
        return ans;
    }

    public static int xor(int a){
        if(a%4 == 0){
            return a;
        }
        if(a%4 == 1){
            return 1;
        }
        if(a%4 == 2){
            return a+1;
        }
        return 0;
    }

}
