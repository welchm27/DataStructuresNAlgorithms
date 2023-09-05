public class SingletonExample {

    // only one instance of the class exists

    // declare the constructor as private
    private static SingletonExample singleInstance = null;

    public String s;

    private SingletonExample(){
        s = "Hello I am the object of the class";
    }

    public static SingletonExample SingleExample(){
        if(singleInstance == null){
            singleInstance = new SingletonExample();
        }
        return singleInstance;
    }

    public static void main(String[] args) {
        SingletonExample S1 = SingletonExample.SingleExample();
        SingletonExample S2 = SingletonExample.SingleExample();
        SingletonExample S3 = SingletonExample.SingleExample();

        System.out.println("S1: " + S1);
        System.out.println("S2: " + S2);
        System.out.println("S3: " + S3);
    }

}   // END OF CLASS