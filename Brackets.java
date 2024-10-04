import java.util.*;
public class Brackets {
    public static void main(String[] args) {
        String str="[[({})]]";
        int flag=1;
        Stack<Character> st = new Stack<Character>();

        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)=='[' || str.charAt(i)=='(' || str.charAt(i)=='{')
            {
                st.push(str.charAt(i));
            }
            else{
                char ch = st.pop();
                if(st.isEmpty())
                {
                    if((str.charAt(i)==')' && ch=='(') || (str.charAt(i)==']' && ch=='[') || (str.charAt(i)=='}' && ch=='{'))
                    {
                        //continue;
                    }
                    
                    else
                        flag=0;
                }
                else
                    flag=0;
                    break;
            }
        }
        if(flag==1)
        System.out.println("Expression is balanced");
        else
        System.out.println("Expression is not balanced");
    }
}
