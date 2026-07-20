import java.util.*;

public class rottenOranges {
	public static int count(int[][] grid) {
		Queue<int[]> q = new LinkedList<>();
		int fresh = 0, time = 0;
		int n = grid.length, m = grid[0].length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (grid[i][j] == 2) q.offer(new int[]{i, j});
				else if (grid[i][j] == 1) fresh++;
			}
		}
		int[] dr = {-1, 1, 0, 0};
		int[] dc = {0, 0, -1, 1};
		while (!q.isEmpty() && fresh > 0) {
			for (int s = q.size(); s > 0; s--) {
				int[] x = q.poll();
				for (int k = 0; k < 4; k++) {
					int nr = x[0] + dr[k], nc = x[1] + dc[k];
					if (nr >= 0 && nr < n && nc >= 0 && nc < m && grid[nr][nc] == 1) {
						grid[nr][nc] = 2;
						fresh--;
						q.offer(new int[]{nr, nc});
					}
				}
			}
			time++;
		}
		return fresh == 0 ? time : -1;
	}
}
