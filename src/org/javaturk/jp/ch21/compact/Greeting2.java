
import org.javaturk.jp.ch21.compact.Selam;
import org.javaturk.jp.ch21.compact.Hello;

Random random = new Random();

String start = "*** Greeting Example ***";

public void main() {
    System.out.println(start);
    saySalam();
    sayHello();
}

void saySalam() {
    Selam s = new Selam();
    int limit = random.nextInt(10);
    for (int i = 0; i < limit; i++)
        System.out.println(s.selamSoyle("Nalan"));

}

void sayHello() {
    Hello h = new Hello();
    int limit = random.nextInt(10);
    for (int i = 0; i < limit; i++)
        System.out.println(h.sayHello("Jane"));
}

 

