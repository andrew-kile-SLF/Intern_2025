
class Solution{
    public static int getInt(char c){
        switch(c){ // instead of multiple if else statements
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
             case 'L' : return 50;
             case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default: return -1;

        }
    }

    public int romanToInt(String s){
        int length = s.length() , current = 0, value = 0, next= 0, i = 0; // assignming multiple variables
        while (i < length){ // kind of like a for loop
            if( i == length -1){
                value += getInt(s.charAt(i));
                return value; // ends when it is at the last letter
            }
            current = getInt(s.charAt(i)); //determines the current character
            next = getInt(s.charAt(i+1)); // determines the next character
            if(current >= next){ // to check for the special cases of 4, 9...
                value += current;
                i = i+1;
            }else{
                value += next - current; // for the special cases of 4, 9, 40..
                i = i+2;
            }
        }
        return value;

    }
}
        
