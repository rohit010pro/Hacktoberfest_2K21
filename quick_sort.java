import java.util.Scanner;

public class quick_sort {
    public static int part(int []a,int s,int e){
        int pivot=a[e];
        int i=s;
        for(int j=s;s<e;j++){
            if(a[j]<=pivot){
                int temp=a[j];
                a[j]=a[i];
                i++;
            }
        }
        int temp=a[i];
        a[i]=a[e];
        a[e]=temp;
        return i;

    }
    public static void sort(int []a,int s,int e){
        if(s<e){
            int parti=part(a,s,e);
            sort(a,s,parti-1);
            sort(a,parti+1,e);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n]; // 2 9 3 7 1 8
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        sort(a,0,n);
        for(int i=0;i<n;i++)
            System.out.println(a[i]);
        long s=System.nanoTime();
        long e=System.nanoTime();
        System.out.println(e-s);
    }
}
