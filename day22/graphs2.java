package day22;
import java.util.*;
public class graphs2 {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public graphs2(int v) {
		this.map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}
	}

	public void AddEdge(int v1, int v2, int cost) {

		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public boolean BFS(int src, int dis) {
		LinkedList<Integer> qq = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		qq.add(src);
		while (!qq.isEmpty()) {
			int r = qq.remove();
			if (visited.contains(r)) {
				continue;
			}
			visited.add(r);
			if (r == dis) {
				return true;
			}
			for (int side : map.get(r).keySet()) {
				if (!visited.contains(side)) {
					qq.add(side);
				}
			}

		}
		return false;

	}

	public boolean DFS(int src, int dis) {
		Stack<Integer> st = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		st.push(src);
		while (!st.isEmpty()) {
			int r = st.pop();
			if (visited.contains(r)) {
				continue;
			}
			visited.add(r);
			if (r == dis) {
				return true;
			}
			for (int nbrs : map.get(r).keySet()) {
				if (!visited.contains(nbrs)) {
					st.push(nbrs);
				}
			}

		}
		return false;

	}

	public void BFT() {
		LinkedList<Integer> qq = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			
			qq.add(src);
			while (!qq.isEmpty()) {
				int r = qq.remove();
				if (visited.contains(r)) {
					continue;
				}
				visited.add(r);
				System.out.print(r + " ");
				for (int sides : map.get(r).keySet()) {
					if (!visited.contains(sides)) {
						qq.add(sides);
					}
				}

			}
			
		}

	}

	public void DFT() {

		Stack<Integer> st = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			st.push(src);
			while (!st.isEmpty()) {
				int r = st.pop();
				if (visited.contains(r)) {
					continue;
				}
				visited.add(r);
				System.out.print(r + " ");
				for (int sides : map.get(r).keySet()) {
					if (!visited.contains(sides)) {
						st.push(sides);
					}
				}

			}
		}

	}

	public boolean isCycle() {
		LinkedList<Integer> qq = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			qq.add(src);
			while (!qq.isEmpty()) {
				int r = qq.remove();
				System.out.println("r"+r);
				System.out.println("keyset:"+map.get(r).keySet());
				System.out.println("queue:"+qq);
				System.out.println("visited:"+visited);
				if (visited.contains(r)) {
					return true; 
				}
				visited.add(r);
				for (int sides : map.get(r).keySet()) {
					if (!visited.contains(sides)) {
						qq.add(sides);
					}
				}

			}
		}
		return false;

	}

	public boolean isConneted() {
		LinkedList<Integer> qq = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		int count = 0;
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			count++;
			qq.add(src);
			while (!qq.isEmpty()) {
				int r = qq.remove();
				if (visited.contains(r)) {
					continue;
				}
				visited.add(r);
				for (int sides : map.get(r).keySet()) {
					if (!visited.contains(sides)) {
						qq.add(sides);
					}
				}

			}
		}
		return count == 1;

	}
}
