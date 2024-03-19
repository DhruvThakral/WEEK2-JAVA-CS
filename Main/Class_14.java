package Main;
//                          Multiple Inheritance through interfaces

interface M{
    int x = 10;
    void fun();
}

interface N{
    int x = 20;
    void fun();
}

class C implements M,N // Multiple inheritance in Java
{
    public void fun(){
        System.out.println("Hello, I'm function in C");
        System.out.println(M.x); //Ambiguity resolved using fully Qualified Name
    }
}

interface O extends M,N  //Multiple inheritance through Interfaces 
{
    void fun();
}

class D implements O{
    public void fun(){
        System.out.println("Hello, I'm function in D");
    }
}

class WEEK2{
    public static void main(String args[]){
        C c = new C();
        c.fun();
    }
}