package String_Handling;

interface Drawable1{
    public void draw();
}

class Without_lambda{
    public static void main(String[] args) {
        int x = 10;
        Drawable1 d1 = new Drawable1() {
            public void draw(){
                System.out.println("The width is " + x);
            }
        };

        d1.draw();
    }
}