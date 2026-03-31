// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if(s.length()!=t.length()){
//             return false;
//         }
//             HashMap<Character,Integer> countS= new HashMap<>();
//              HashMap<Character,Integer> countT= new HashMap<>();
//              for(int i=0;i<s.length();i++){
                
//              }
//     }
// }

// class Solution{
//     public boolean isAnagram(String s,String t){
//          if(s.length()!=t.length()){
//             return false;
//         }
//         int[] count=new int[26];
//         for(int i=0;i<s.length();i++){
//             count[s.charAt(i)-'a']--;
//             count[t.charAt(i)-'a']++;
//         }
//         for(int i:count){
//             if(i!=0){
//                 return false;
//             }
//         }return true;
//     }
// }

class Solution{
    public boolean isAnagram(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> s1=new HashMap<>();
        HashMap<Character,Integer> s2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            s1.put(s.charAt(i),s1.getOrDefault(s.charAt(i),0)+1);
            s2.put(t.charAt(i),s2.getOrDefault(t.charAt(i),0)+1);
        }return s1.equals(s2);

    }
}