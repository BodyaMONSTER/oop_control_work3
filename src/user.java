public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Метод для отримання імені
    public String getName() {
        return name;
    }

    // Метод для отримання віку
    public int getAge() {
        return age;
    }

    // Метод для відображення інформації про людину
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

