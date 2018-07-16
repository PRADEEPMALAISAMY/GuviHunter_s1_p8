import java.util.Scanner;

public class Hunter_8 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int ak = sc.nextInt();
	int arr[] = new int[ak];
	for (int i = 0; i < arr.length; i++) {

		arr[i]=sc.nextInt();
	}
	for(int i=0;i<ak;i++) {
		
		for(int j=0;j<ak;j++) {
			
			for(int k=j+1;k<ak;k++) {
				if(arr[k]==arr[j]) {
					break;
				}
				else if((arr[k]+arr[j])==arr[i]) {
					
					System.out.println(arr[j]+" "+arr[k]+ " "+arr[i]);
					
				}
				
			}
		}
	}
	
}
}
