
String start = "*** Greeting Example - I ***";
String selam = "Selam ";
String hello = "Hello ";

public void main() {
    System.out.println(start);
    saySalam("Fatma");
    sayHello("John");
}

void saySalam(String whom) {
        System.out.println(selam + whom);

}

void sayHello(String whom) {
    System.out.println(hello + whom);
}

 

