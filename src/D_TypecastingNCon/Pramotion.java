package D_TypecastingNCon;
class Names{
    String name;
    int age;

}

public class Pramotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        char c = 'c';
        System.out.println(a+b+c);
        Names name;
        name = new Names();
        name.name = "Prashant Joshi";
        name.age = 20;
        System.out.println(name.name);
        System.out.println(name.age);

    }
}
