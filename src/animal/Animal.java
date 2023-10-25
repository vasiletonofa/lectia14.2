package animal;

class Animal {

    private String name;
    int age; // default package(accesam variabila age doar inm cadrul la acelasi packet - animal)

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Varsta nu poate fi negativa");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }


    public void setName(String name) {
        this.name = name;
    }

}
