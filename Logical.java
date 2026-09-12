class Logical {
public static void main(String args[]) {
int x=10;
int y=19;
int a=7;
int b=5;
System.out.println(x>y && a>b);
System.out.println(x>y || b>a);
System.out.println(x>y && b>a);
System.out.println(x>y || a>b);
System.out.println(x<y && a>b);
System.out.println(x<y || a>b);
System.out.println(x!=y);
}
}