class Solution {
    public boolean isAnagram(String s, String t) {


HashMap <Character, Integer> set1 = new HashMap<>();
HashMap <Character, Integer> set2 = new HashMap<>();

char[] array1 = s.toCharArray();
char[] array2 = t.toCharArray();

if (s.length() != t.length()) {
    return false; // Exit immediately!
}


for(int i=0; i<array1.length;i++){
 set1.put(array1[i],set1.getOrDefault(array1[i], 0) + 1);
}

for(int i=0; i<array2.length;i++){
 set2.put(array2[i],set2.getOrDefault(array2[i], 0) + 1);
}

if(set1.equals(set2)){
    return true;

}
else{
    return false;
}
 


    }
}
