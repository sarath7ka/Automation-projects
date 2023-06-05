import org.testng.annotations.Test;

public class TesNg {


    @Test(priority = 2)
    void setup(){
        System.out.println("I am Sarath");
    }
    @Test(priority = 1)
    void test(){
        System.out.println("I am king");
    }
    @Test(priority = 3)
    void urname(){
        System.out.println("hi hkj");
    }
}
