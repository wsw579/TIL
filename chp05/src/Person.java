public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person p = new Person("John Smith");
        System.out.println(p.name); // 같은 클래스라 private인데도 출력가능
        System.out.println("이름 : " + p.getName());

        p.setName("Woo Seung Won");
        System.out.println("변경된 이름 : " + p.getName());
        System.out.println(p.name);

    }
}
