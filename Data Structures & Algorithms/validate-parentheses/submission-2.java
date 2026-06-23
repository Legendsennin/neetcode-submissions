class Solution {
    public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();

    HashMap<Character, Character> bracketsPair = new HashMap<>();
//KEY, VALUE
    bracketsPair.put(')','(');
    bracketsPair.put('}','{');
    bracketsPair.put(']','[');
    char[] array = s.toCharArray();

for(int i=0;i<array.length;i++){

    char currentChar = array[i];

//THIS ONE CHECKS IF CURRENT CHAR IS CLOSE BRACKET (IF TRUE= CLOSE FALSE = OPEN BRACKET)
if(bracketsPair.containsKey(currentChar)){

if(stack.isEmpty()){
    return false;
}

char topElement = stack.pop();
if(topElement != bracketsPair.get(currentChar)){
    return false;
}
}
else{
    stack.push(currentChar);
}

    
}
return stack.isEmpty();

}

    }

