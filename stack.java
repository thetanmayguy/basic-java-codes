import java.util.Scanner;
class stack{
    static int top=-1;
    static boolean empty(){
        if(top==-1)
            return true;
        return false;
    }
    static boolean full(int n){
        if(top==n-1)
            return true;
        return false;
    }
    static void push(int st[],int d){
        st[++top]=d;
    }
    static int pop(int st[]){
        return (st[top--]);
    }
    static void display(int st[]){
        System.out.print("Stack contents : ");
        for(int i=top;i>=0;i--)
            System.out.print(st[i]+" ");
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,ch;
        System.out.print("n :");
        n=sc.nextInt();
        int st[]=new int[n];
        for(;;){
            System.out.println("<Menu>:-");
            System.out.println("1 :push\n2 :pop\n3 :display\n4 :exit");
            ch=sc.nextInt();
            switch(ch){
                case 1: if(full(n)){
                            System.out.println("Stack is full");
                            break;
                        }
                        System.out.print("data :");
                        int d=sc.nextInt();
                        push(st,d);
                        break;
                case 2: if(empty()){
                            System.out.println("Stack is empty");
                            break;
                        }
                        int e=pop(st);
                        System.out.println("popped itme :"+e);
                        break;
                case 3: if(empty()){
                            System.out.println("Stack is empty");
                            break;
                        }
                        display(st);
                        break;
                case 4: sc.close();
                        return;
            }
            System.out.println("--------------------------------------------------");
        }
    }
}