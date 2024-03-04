package Multiple_Classes;

class First {
    public void podu(){
        System.out.println("Wammala nan dhan");
    }
    public void wakkali(String s){
        System.out.println("Wakkalli "+s);
    }
}

class Second {
    public static void main(String[] args) {
        First first = new First();
        first.wakkali("Oombu");
        first.podu();
    }    
}
