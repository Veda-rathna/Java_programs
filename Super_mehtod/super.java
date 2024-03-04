package Super_mehtod;

class S{
    void disp(){
        System.out.println("Parent class");
    }
}

class U extends S{
    public static void main(String[] args) {
        U obj = new U();
        obj.disp();
    }
    
    void disp(){
        super.disp();
        System.out.println("Child Class");
    }
}


