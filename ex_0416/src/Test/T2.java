package Test;

class T2 extends T1{
    int a = 55;

    void function(int i){
        System.out.print(super.a);
    }
    void function(){
        System.out.print(super.a + a);
    }
    void function(double i){
        System.out.print(a);
    }
    public static void main(String[] args) {
        T2 t = new T2();
        t.function(1);
        t.function();  
        t.function(1.0);
    }
}