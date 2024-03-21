package String_Handling;

interface Drawable{
    public void draw();
}

class Without_lambda{
    public static void main(String[] args) {
        int x = 10;
        Drawable d1 = new Drawable() {
            public void draw(){
                System.out.println("The width is " + x);
            }
        };

        d1.draw();
    }
}