package String;

public class StringMethods {

    private String name;
    private int age;

    public StringMethods(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "My name is " + getName() + " and age is " + getAge();
    }

    @Override
    public boolean equals(Object obj){
            boolean result = false;
            if(obj != null & obj instanceof StringMethods){
                StringMethods stringMethods = (StringMethods) obj;
                    if(this.getName().equals(stringMethods.getName()) && this.getAge() == stringMethods.getAge()){
                        result = true;
                    }
            }
            return result;
        }

    @Override
    public int hashCode(){
        return getName().hashCode() ^ getAge();
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
