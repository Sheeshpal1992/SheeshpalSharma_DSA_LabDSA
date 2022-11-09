
import java.util.Scanner;
import java.util.Stack;

public class Brackets_Balancing {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input string");
		String input = sc.next();
		isBrackets_Balancing(input);
	}
	
	public static void isBrackets_Balancing(String s){	
		
		Stack<Character>stack = new Stack<>();
		for (int i = 0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c =='('||c=='{'||c=='['){
				stack.push(c);
			}else {
					if(stack.isEmpty()){
						System.out.println("not balanced");
						return;
						}
					char top = stack.peek();
					if((top=='('&& c==')')||(top=='{'&&c=='}')||(top=='['&&c==']')) {
						stack.pop();
					}
				}
			}
				if(stack.isEmpty()) {
					System.out.println("balanced");
				}else {
					System.out.println("not balanced");
					
			}
		}
	}
		
	
