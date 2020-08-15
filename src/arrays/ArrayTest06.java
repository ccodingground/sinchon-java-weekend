package arrays;

public class ArrayTest06 {

	public static void main(String[] args) {
		
		
		int n=4;
		int[][] arr;
		arr=new int[n][n]; //arr=new int[3][3];
		
		
		//숫자입력 1~
		int count=1;
		for(int i=0; i<arr.length ; i++ ) {
			if(i%2==0) {
				//0~증가
				for(int j=0; j<arr[i].length ; j++) { //i :0,2 일때 실행
					arr[j][i]=count++;
				}
			}else {
				//n-1~0감소
				for(int j=n-1; j>=0 ; j--) {//i:1,3 일때 실행
					arr[j][i]=count++;
				}
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
