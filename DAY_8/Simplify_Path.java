import java.util.*;
public class Simplify_Path {
    public String simplifyPath(String path){
        Stack<String> stack = new Stack<>();    
        String[] directories = path.split("/"); 
        for (String dir : directories){ 
            if(dir.equals(".") || dir.isEmpty()){ 
                continue;
            }
            else if(dir.equals("..")){ 
                if(!stack.isEmpty()){ 
                    stack.pop();
                }
            }
            else{ 
                stack.push(dir);
            }
        }
        return "/" + String.join("/", stack); 
        //SC->O(N)
        //TC->O(N)
    }
}
