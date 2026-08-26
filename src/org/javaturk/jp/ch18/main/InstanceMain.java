
// This is static and it can be reached from instance methods
static String start = "*** Instance Main ***";
String selam = "Selam ";
String hello = "Hello ";

void main() {
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

