public class Programmer {
    private  String name;
    private int age;
    private String email;
  public void coding(){
      System.out.println("prograammer writing code");
  }
  public  void coding(String a){
      System.out.println(a);
  }

    public Programmer(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public Programmer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
