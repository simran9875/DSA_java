package day22;

public class Implement2 {

	public static void main(String[] args) {
		graphs2 g = new graphs2(7);
		g.AddEdge(1, 4, 6);
		g.AddEdge(1, 2, 10);
		g.AddEdge(2, 3, 7);
		g.AddEdge(3, 4, 5);
		g.AddEdge(4, 5, 1);
		 g.AddEdge(5, 6, 4);
		 g.AddEdge(7, 5, 2);
		 g.AddEdge(6, 7, 3);
		//System.out.println(g.DFS(1, 6));
		// g.BFT();
		// System.out.println();
		// g.DFT();
		// System.out.println();
		System.out.println(g.isCycle());
//		 System.out.println(g.isConneted());
		

	}

}
