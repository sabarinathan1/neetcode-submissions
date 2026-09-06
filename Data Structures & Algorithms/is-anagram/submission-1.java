class Solution {
    public boolean isAnagram(String s, String t) {
        /*
        if(s.length() != t.length()){
            return false;
        }
        char arrs[] = s.toCharArray();
        char arrt[] = t.toCharArray();
        Arrays.sort(arrs);
        Arrays.sort(arrt);
        for(int i = 0; i < arrs.length; i++) {
            if(arrs[i] != arrt[i]) {
                return false;
            }
        }
        return true;
        */
         if (s.length() != t.length()) return false;
    
    int[] count = new int[26];
    
    for (int i = 0; i < s.length(); i++) {
        count[s.charAt(i) - 'a']++;
        count[t.charAt(i) - 'a']--;
    }
    
    for (int c : count) {
        if (c != 0) return false;
    }
    
    return true;
    }
}
