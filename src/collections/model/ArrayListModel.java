package collections.model;

public class ArrayListModel {
    private String name;
    private int age;
    private String experience;
    private String[] keywords;

    public ArrayListModel(String name, int age, String experience, String[] keywords) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.keywords = keywords;
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

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String[] getKeywords() {
        return keywords;
    }

    public void setKeywords(String[] keywords) {
        this.keywords = keywords;
    }
}
