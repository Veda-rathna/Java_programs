public class ErrorJava {
    public static void main(String[] args) {
        int arr[] = {50,60,70,80};
        for(int i=0;i<=arr.length;i++){
            System.out.println("Element at index "+i+" is: " + arr[i]);
        }
    }
}


//It will throw an error since it checks for the fifth element of the array but it doesn't have fifth element

/*Element at index 0 is: 50
Element at index 1 is: 60
Element at index 2 is: 70
Element at index 3 is: 80
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
        at ErrorJava.main(ErrorJava.java:5)*/