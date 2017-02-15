package slavik.sendbox.test_java.constructor;

/**
 * Created by Слава on 10.01.2017.
 */
public class ConstructorInConstructor {

    ConstructorInConstructor(){

    }

    ConstructorInConstructor(int a, String b){
        this();
    }

    ConstructorInConstructor(int a,String  b, int c){
        this(a,b);
        //this(); must not  initialization twice
    }

    void constructorInMethod(){
        //this(); only constructor
    }

}
