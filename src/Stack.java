public class Stack {
    char[] stack = new char[256];
    int top_index = -1;

    Stack(){

    }

    int getSize(){
        return top_index + 1;
    }

    void Push(char ch){
         stack[++top_index] = ch;
    }

    char Pop(){
        char ch = stack[top_index];
        stack[top_index--] = '\0';
        return ch;
    }

    char Top(){
        return stack[top_index];
    }

    boolean isEmpty(){
        return top_index == -1;
    }


    boolean isFull(){
        return top_index == 255;
    }
}


