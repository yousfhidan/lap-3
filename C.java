public class C {
    public static void main(String[] args) {
        int x=10;
       int y=1;
        for (int i=1;i<=x;i++)
            if(i>0){
                y=y*i;
            }
        System.out.println("the product of the first ten=="+y);
    }
}
