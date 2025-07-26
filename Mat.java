package hello;

public class Mat {
	public static void printSpiral(int a[][]) {
		int top=0;
		int bottom=2;
		int left=0;
		int right=2;
		while(top<=bottom&&left<=right) {
			for(int  i=left;i<=right;i++) {
				System.out.print(a[top][i]+" ");
			}	
			top++;
			for(int i=top;i<=bottom;i++) {
				System.out.print(a[i][right]+" ");
			}
			right--;
			if(top<=bottom) {
				for(int i=right;i>=left;i--) {
					System.out.print(a[bottom][i]+" ");
				}
				bottom--;
			}
			if(left<=right) {
				for(int i=bottom;i>=top;i--) {
					System.out.print(a[i][left]+" ");
				}
				left++;
			}
		}
	}

  
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Spiral order:");
        printSpiral(matrix);
    }

}
