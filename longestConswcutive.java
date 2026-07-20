import java.util.*;
public class longestConswcutive{
     public static int longestConsecutive(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        for(int x : nums) s.add(x);
        
        int ans = 0;
        for(int x : s) {
            if(!s.contains(x - 1)) {
                int y = x;
                while(s.contains(y)) y++;
                ans = Math.max(ans, y - x);
            }
        }
        return ans;
}
}