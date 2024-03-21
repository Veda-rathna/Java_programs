package String_Handling;

interface Drawable{
    public void draw();
}

class With_lambda1{
    public static void main(String[] args) {
        int x = 10;
        Drawable d1 = ()-> 
        {
                System.out.println("The width is " + x);
        };

        d1.draw();
    }
}