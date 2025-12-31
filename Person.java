import java.util.Objects;
abstract class Person{
    private String name;
    protected Person(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public abstract void info();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    @Override
    public String toString() {
        return getClass().getSimpleName()+"{name="+name+"}";
    }

}