package inheritance;

public class Constructor {
    public static void main(String[] args) {
        A a = new A();
    }
}

class A extends B{
    public A(){
        System.out.println("class A");
    }
}

class B extends C{
    public B(){
        System.out.println("class B");
    }
}

class C{
    public C(){
        System.out.println("class C");
    }
}