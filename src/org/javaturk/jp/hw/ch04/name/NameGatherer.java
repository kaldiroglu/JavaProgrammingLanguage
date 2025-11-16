import org.javaturk.jp.hw.ch04.name.A;
import org.javaturk.jp.hw.ch04.name.B;
import org.javaturk.jp.hw.ch04.name.C;

String allNames;

void main(){
    gatherNames();
    IO.println("Names: " + allNames);
}

void gatherNames(){
    A a = new A();
    allNames = a.name();

    B b = new B();
    allNames = allNames + b.name();

    C c = new C();
    allNames = allNames + c.name();
}