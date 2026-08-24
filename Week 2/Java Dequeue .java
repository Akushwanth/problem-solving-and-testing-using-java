import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();
        
        int n = in.nextInt();
        int m = in.nextInt();
        int maxUnique = 0;
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            deque.add(arr[i]);
            set.add(arr[i]);
            
            if (deque.size() == m) {
                maxUnique = Math.max(maxUnique, set.size());
                
                int removed = deque.removeFirst();
                if (!deque.contains(removed)) {
                    set.remove(removed);
                }
            }
        }
        
        System.out.println(maxUnique);
    }
}
