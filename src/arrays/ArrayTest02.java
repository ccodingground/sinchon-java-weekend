package arrays;

public class ArrayTest02 {

	public static void main(String[] args) {
		
		int n=3;
		int[][] arr;
		arr=new int[n][n]; //arr=new int[3][3];
		
		int count=1;
		//숫자입력 1~
		for(int i=n-1; i>=0 ; i--) {//행 i 2,1,0
			for(int j=n-1; j>=0; j--) {//열 j:2,1,0
				arr[i][j]=count++;
			}
		}
		
		
		
		//출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0 ; j <arr[i].length ; j++ ) {//열의 정보
				System.out.printf("%3d ",arr[i][j]); //arr[0][0], arr[0][1], arr[0][2] 
			}
			System.out.println();
		}
		
			
		
		
		
	}
	
}
