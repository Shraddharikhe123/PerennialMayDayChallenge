import java.util.*;
class EquilibriumIndex { 
    int equilibrium(int arr[], int n) 
    { 
        int i, j; 
        int leftsum, rightsum; 
  
           for (i = 0; i < n; ++i) { 
  
             leftsum = 0;   
            for (j = 0; j < i; j++) 
                leftsum += arr[j]; 
  
               rightsum = 0; 
            for (j = i + 1; j < n; j++) 
                rightsum += arr[j]; 
  
                if (leftsum == rightsum) 
                return i; 
        } 
  
    
        return -1; 
    } 
    
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        EquilibriumIndex equi = new EquilibriumIndex(); 
         int T = sc.nextInt();
         int N = sc.nextInt();
	int arr[] = new int[N];
         for(int i=0;i<N;i++){
		int x = sc.nextInt();
             arr[i] =x;
		
}
        int arr_size = arr.length; 
        System.out.println(equi.equilibrium(arr, arr_size)); 
    } 
} 
