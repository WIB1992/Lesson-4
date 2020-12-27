package packege;

 public class worker {
    String name;
    String position;
    String phone;
    int salary;
    int age;

    worker(String name, String position, String phone, int salary, int age) {
    this.name = name;
    this.position = position;
    this.phone = phone;
    this.salary = salary;
    this.age = age;
}
    String getName() {
        return name;
    }
    String getPosition() {
        return position;
    }
    String getPhone() {
        return phone;
    }
    int getSalary() {
        return salary;
    }
    int getAge() {
        return age;
    }


}
