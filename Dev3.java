import java.util.*;
public class Dev3{
Scanner sc = new Scanner(System.in);
public static void main(String[] args){
int k=0;
int T = sc.nextInt();
int M = sc.nextInt();
int N = sc.nextInt();

int Numbers[] = new int[M*N];
for(int i=0;i<M*N;i++){

int x = sc.nextInt();
Numbers[i] = x;
}
if(!k == M*N-1){
for(int i =k; i<M-1;k++){

System.out.print(Numbers[i]);

}
}
getSpiralMatrix(k, Numbers);
}
public static  void getSpiralMatrix(int k ,int[]  Numbers){
 k = k+N;

if(!k == M*N-1){
 for(int i =k;i<M-1;i--){
System.out.print(Numbers[k]);
}
}
getSpiralMatrix(k, Numbers);


}
}

