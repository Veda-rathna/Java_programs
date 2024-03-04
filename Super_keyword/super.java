package Super_keyword;

class S{
    int a = 250;
}

class U extends S{
    int a = 350;
    void disp(){
        System.out.println("Value of a in class U is : " + a);
        System.out.println("Value of a in class S is : " + super.a);
    }
}

class Main{
    public static void main(String[] args) {
        U obj = new U();
        obj.disp();
    }
}
