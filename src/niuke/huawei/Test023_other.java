package niuke.huawei;

/**
 * @author Horace
 * @date 2020/2/24 - 11:47
 */
import java.util.*;
public class Test023_other {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        while(scan.hasNextLine()){
            String str=scan.nextLine();
            if(str.length()>20){
                continue;
            }
            int []max=new int[26];
            char[]ch=str.toCharArray();
            int min=Integer.MAX_VALUE;
            for(int i=0;i<ch.length;i++){
                max[ch[i]-'a']++;
                //没懂为什么不会在首次循环是运行下边语句导致min=1；
                min=min>max[ch[i]-'a']?max[ch[i]-'a']:min;

            }


            for(int i=0;i<max.length;i++){
                if(max[i]==min){

                    str=str.replaceAll(String.valueOf((char)(i+97)), "");
                }
            }
            System.out.println(str);
        }
    }
}
