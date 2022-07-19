class bgoto{
    static int ctr=0;
    public static void main(String args[]){
        update:{
        ctr++;   
        System.out.println(ctr);
        System.out.println("n");
        if(ctr<10) break update;
        }
        System.out.println("here");
    }
}