import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class WA {
  public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named old.Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long num = Long.parseLong(br.readLine());
        List<Long> result = new ArrayList<>();
        result.add(num);
        while(num>1){
            if(num%2==0){
                num/=2;
            } else {
                num*=3;
                num++;
            }
            result.add(num);
        }
//        result.add(1);
        for(long n:result){
            bw.write(n+" ");
        }
        bw.close();
    }

}
