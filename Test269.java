package banana;

import static banana.Logic.*;

public class Test269 {
	public static void main( String[] args ) {
		
		// ��ٸ��� ����� ����.
		int[][] map = {
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
		};
		
		map[0][4] = 1;
		map[4][5] = map[5][4] = 1;
		map[4][8] = 1;
		map[8][16] = 1;
		map[5][9] = 1;
		map[9][12] = 1;
		map[9][13] = map[13][9] =  1;
		map[12][14] = 1;
		map[14][17] = 1;
		map[2][6] = 1;
		map[6][10] = 1;
		map[10][13] = 1;
		map[13][15] = 1;
		map[15][18] = 1;
		map[10][11] = map[11][10] = 1;
		map[3][7] = 1;
		map[7][11] = 1;
		map[11][19] = 1;
		map[14][15] = map[15][14] = 1;
		map[6][7] = map[7][6] = 1;
		map[8][12] = map[12][8] = 1;
		
		
		boolean[] visited = new boolean[20];

		visit( 2, visited, map );    // 3������ ����
	}
}

class Logic {
	/*
		visit(0)
			visited : 0
			visit(2)
				visited : 2
				visit(3)
					visited : 3
					visit(6)
						visited : 6
							���ȣ�� �� �� ����. ���� ���� �ö�����, break�� ����.(��)
	*/

	public static void visit(int spot, boolean[] visited, int[][] map){
		visited[spot] = true;
		System.out.println("visit :" + spot);
		
		if( i == 13){    // �� ��ġ�� ���� �����ϴٰ� �Ѵ�. ������ �𸣰���..
						System.out.println("��ź ����");
						break;
					}
		
		for(int i=0; i<map[spot].length; i++){
			if(map[spot][i] != 0){
				if(visited[i] == false){
					visit(i, visited, map);
					break;    // �̷��� �������� 4�� �ߴ��� �� ���.
				}
			}
		}
	}

}

/*
	Ư�� ���̿� �����ϸ� ��ź�� ������ �Ϸ��� ��� �ؾ� �ұ�?
*/