import java.util.HashMap;

public class subArraysumdivisibleByk {
    static long subarraysDivByK(int[] arr, int k) {
        HashMap<Integer, Integer> m = new HashMap<>();
        m.put(0, 1);
        long ans = 0, s = 0;
        for(int x : arr) {
            s += x;
            int r = (int)((s % k + k) % k);
            ans += m.getOrDefault(r, 0);
            m.put(r, m.getOrDefault(r, 0) + 1);
        }
        return ans;

}
}