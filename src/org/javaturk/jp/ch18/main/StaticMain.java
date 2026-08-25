
static Random random = new Random();

static String start = "*** Static Main ***";
static String selam = "Selam ";
static String hello = "Hello ";


static void main() {
    System.out.println(start);
    saySalam("Fatma");
    sayHello("John");
}

static void saySalam(String whom) {
    System.out.println(selam + whom);

}

static void sayHello(String whom) {
    System.out.println(hello + whom);
}

 

