package basic;

public class Array {
    public static void main(String[] args) {
        int num[] = new int[3];
        num[0] = 10;
        num[1] = 20;
        num[2] = 30;

        System.out.println(num[0]);

        String[] color={"red","green","blue"};
        System.out.println(color[0]);
        System.out.println("------------------------");
        for(String item:color){
            System.out.println(item);
        }

        int a[][]={{10, 20}, {30, 40}};
        for(int i=0;i<2;i++){
            for(int j=0; j<2; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
