package easy2000s;

static int n, i, j, m, K, V, b;
static Node[] node;
static int[] GroupA, GroupB, visited;

public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        node = new Node[n+1];
        for(i = 1; i <= n; i++){
        	node[i] = new Node();
        	for(j = 2; j-i <= n; j *= 2){
        		if(j <= i) continue;
        		node[i].next.add(j-i);
        	}
        }
        GroupA = new int[n+1];
    	GroupB = new int[n+1];
    	Arrays.fill(GroupA, -1);
    	Arrays.fill(GroupB, -1);
    	for(i = 1; i <= n; i++){
    		if(GroupA[i] == -1){
    			visited = new int[n+1];
    			dfs(i);
    		}
    	}
    	for(i = 1; i <= n; i++) bw.write(GroupA[i]+"\n");
        bw.close();
}

static boolean dfs(int CURR){
    	visited[CURR] = -1;
    	for(int NEXT : node[CURR].next){
    		if(GroupB[NEXT] == -1 || 
    				(visited[GroupB[NEXT]] != -1 && dfs(GroupB[NEXT]))){
    			GroupA[CURR] = NEXT;
    			GroupB[NEXT] = CURR;
    			return true;
    		}
    	}
    	return false;
}
    
static class no2205{

    	ArrayList<Integer> next;
    	
    	Node(){
    		next = new ArrayList<Integer>();
    	}
}

