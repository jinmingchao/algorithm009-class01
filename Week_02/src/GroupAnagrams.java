import java.util.*;

/**
 * @Author MingChao Jin
 * @Date 2020/5/31 14:39
 * @Description: https://leetcode-cn.com/problems/group-anagrams/
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String,List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];
            char[] c=s.toCharArray();
            Arrays.sort(c);
            s = String.valueOf(c);
            List<String> list= map.getOrDefault(s,new ArrayList<>());
            list.add(strs[i]);
            map.put(s,list);
        }
        return new ArrayList<>(map.values());
    }
}
