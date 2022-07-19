import java.util.Scanner;
class st{
    public String usn;
    public String name;
    public String branch;
    public long phno;
    st(String a,String b,String c,long d)
    {
        usn=a;
        name=b;
        branch=c;
        phno=d;
    }
}
class stdb{
    static void display(st db[],int n){
        System.out.println("USN    "+"Name    "+"Branch    "+"phone number");
        for(int i=0;i<n;i++){
            System.out.println(db[i].usn+"    "+db[i].name+"     "+db[i].branch+"       "+db[i].phno);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("n : ");
        int n=sc.nextInt();
        st db[]=new st[n];
        for(int i=0;i<n;i++){
            System.out.print("("+(i+1)+")"+"details : ");
            String a=sc.next();
            String b=sc.next();
            String c=sc.next();
            long d=sc.nextLong();
            db[i]=new st(a,b,c,d);
        }
        display(db,n);
        sc.close();
    }
}