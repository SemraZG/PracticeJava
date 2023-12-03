package practice05.inheritance01;

public class Child extends Parent{

        int yas=10;//instance---class icinde ama method disinda

        public static void main(String[] args) {

            System.out.println("Parent.isim = " + Parent.isim);
            Parent.method1();
            // Math.max(1,2);

            //staticler farklı classtan class ismi. ile cagrılır
            //ancak burada extends yaptıgımız için direk cagırabildik
            System.out.println(isim);
            method2();

            Child obj1=new Child();
            System.out.println("obj1.yas = " + obj1.yas);//10
            obj1.method3();

            Parent obj2=new Parent();
            System.out.println("obj2.yas = " + obj2.yas);//30
    }
}
