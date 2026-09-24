public class binoddevwn{
    public static void oddorEven(int n){
        int bitmask = 1;
        if((n & bitmask)== 0){
            System.out.println("even");

        }else{
           System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        oddorEven(3);
    }
}