import java.util.*;
public class Basic_Calculator2 {
    public int calculate(String s){
        Stack<Integer> stack=new Stack<>();
        int num=0;
        char op='+';
        s=s.replace(" ", ""); // remove spaces
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                num=num*10+(c-'0');
            }
            if(!Character.isDigit(c) || i == s.length()-1){
                if(op=='+')stack.push(num);
                else if(op=='-')stack.push(-num);
                else if(op=='*')stack.push(stack.pop()*num);
                else if(op=='/')stack.push(stack.pop()/num);
                op=c;
                num=0;
            }
        }
        int result=0;
        for(int val:stack)result+=val;
        return result;
        //TC->O(n)
        //SC->O(n)
    }
}
