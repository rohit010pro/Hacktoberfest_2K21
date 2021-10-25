import java.io.*;
import java.util.*;

public class Towerofhanoi {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int t1id=Integer.parseInt(br.readLine());
        int t2id=Integer.parseInt(br.readLine());
        int t3id=Integer.parseInt(br.readLine());
        toh(n,t1id,t2id,t3id);
    }

    public static void toh(int n, int t1id, int t2id, int t3id){
        if(n==0)
        return;
        else{
            toh(n-1,t1id,t3id,t2id);
            System.out.println(n+"["+t1id+" -> "+t2id+"]");
            toh(n-1,t3id,t2id,t1id);
        }
    }

}
