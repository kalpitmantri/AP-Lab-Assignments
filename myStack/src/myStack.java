import java.util.*;

class myStack implements stack{
	int size;
	int top=0;
	String str[];
	//Constructor
	public myStack(int Size){
		size = Size; 
	}
	// To Add in Stack
	public void Push(String _str){
		if(top>size){
			throw new IndexOutOfBoundsException("Overflow Exception");
		}
		if(top<=size){
			str[top++] = _str;
		}
		
	}
	// To delete top element from Stack
	public String Pop(){
		if(Isempty()){
			throw new NoSuchElementException("Underflow Exception");
		}
		return str[top--];
	}
	// To Return top element from Stack
	public String Top(){
		if(Isempty()){
			throw new NoSuchElementException("Underflow Exception");
		}
		return str[top];
	}
	
	//To return true if stack is empty
	public boolean Isempty(){
		if (top==0){
			return true;
		}
		return false;
	}
	
	//To return true if stack is full
	public boolean Isfull(){
	
		if (top == size){
			return true;
		}
		return false;
	}
	public String toString(){
		this.Display();
	return "";
	}
	public void Display(){
		if(Isempty()){
			throw new NoSuchElementException("Underflow Exception");
		}
		for(int i=top;i>0;--i){
			System.out.println(" "+ str[i]);
		}
	}
}
