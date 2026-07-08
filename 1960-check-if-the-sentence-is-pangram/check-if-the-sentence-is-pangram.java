class Solution {
    public boolean checkIfPangram(String sentence) {
HashSet alphabetsSet = new HashSet<>();

    //length of alphabets is 26

char[] alphabetsArray = sentence.toCharArray();
for (int i=0; i<alphabetsArray.length; i++){
    alphabetsSet.add(alphabetsArray[i]);
}

if(alphabetsSet.size() >=26){
    return true;
}

else{
    return false;
}
        
    }
}