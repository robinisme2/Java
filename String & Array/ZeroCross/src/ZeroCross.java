/*P.83 - Q1.7 */

public class ZeroCross {
	static int SIZE = 4;
	static int max = 9;
	static int min = 0;
	public static int mapGenerator(int[][] map, boolean[] row, boolean[] col){
		int i,j,count = 0;
		for(i = 0; i < SIZE; i++){
			for(j = 0; j < SIZE; j++){
				map[i][j] = (int) (Math.random() * (max - min) + min);
				if(map[i][j] == 0){
					row[i] = true;
					col[j] = true;
					count++;
				}				
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
		return count;
	}
	public static void main(String[] args) {
		int[][] map = new int[SIZE][SIZE];
		boolean[] zeroRow = new boolean[SIZE];
		boolean[] zeroCol = new boolean[SIZE];
		mapGenerator(map,zeroRow, zeroCol);
		int i,j;
		for(i = 0; i < SIZE; i++){
			for(j = 0; j < SIZE; j++){
				if(zeroRow[i] || zeroCol[j]){
					map[i][j] = 0;
				}
			}
			System.out.println();
		}
		System.out.println();
		for(i = 0; i < SIZE; i++){
			for(j = 0; j < SIZE; j++){
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}

}
