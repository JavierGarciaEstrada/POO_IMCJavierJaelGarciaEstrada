public class DatosDePaciente{
private String name;
private int age;
private double weight;
private int height;
private char sex;

    public DatosDePaciente() {
    }

    public DatosDePaciente(String name, int age, double weight, int height, char sex){
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.height = height;
    this.sex = sex;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {this.sex = sex;}

    public double IMC(){
        double imc=(weight/(height * height))*10000;

        return imc;

    }
    public String compotition(double imc){
        if (imc <= 18.5){
            return "Underweight";
        }else if (imc >18.5 && imc <=24.9){
            return "Normal";
        } else if (imc >=25 && imc <=29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
}
