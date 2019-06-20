import java.util.Scanner;

public class shahadtest {
    public static void main(String[]args) {
        Scanner input=new Scanner(System.in);
        int[] a=new int[5];
        System.out.print("Enter the orders of number777");
        for(int y=1;y<a.length;y++){
            a[y]=input.nextInt();}
        for (int j=2;j<a.length;j++){
            int key=a[j];
            int i=j-1;
            while (i>=0&&a[i]>key){
                a[i+1]=a[i];
                i=i-1;
            }
            a[i+1]=key;}
        System.out.print("sorted is:");
        for(int x=0;x<a.length;x++){
            System.out.print(a[x]+" ");
            System.out.println();
        }}
}
