package arrays;

public class ArrayTest01 {

	public static void main(String[] args) {
		
		
		int n=10;
		int[][] arr;
		arr=new int[n][n]; //arr=new int[3][3];
		
		
		//숫자입력 1~
		int count=1;
		for(int i=0; i<arr.length ; i++ ) {
			for(int j=0; j<arr[i].length ; j++) {
				//arr[i][j]=(j+1 )+ 3*i;//0
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
