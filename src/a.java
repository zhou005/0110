public class a {
    public static void main(String[] args) {
        int [] b={1,2,3};
        System.out.println("传递前："+b[0]);
        change(b);
        System.out.println("传递后："+b[0]);
    }
    public static void change(int[] b ){
        b[0]=100;
    }
}
