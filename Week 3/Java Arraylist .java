import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();  // number of lists
        
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int d = in.nextInt();  // number of elements in this list
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                list.add(in.nextInt());
            }
            lists.add(list);
        }
        
        int q = in.nextInt();  // number of queries
        for (int i = 0; i < q; i++) {
            int x = in.nextInt();  // list number
            int y = in.nextInt();  // index
            
            try {
                System.out.println(lists.get(x - 1).get(y - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
