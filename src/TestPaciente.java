public class TestPaciente {
    public static void main(String[] args) {

        DatosDePaciente paciente1 = new DatosDePaciente("javier", 18, 50, 175, 'm');

        System.out.println("El paciente: " + paciente1.getName());
        System.out.println("Con edad de " + paciente1.getAge() + " años");
        System.out.println("De sexo: " + paciente1.getSex());
        System.out.println("Con un peso de: " + paciente1.getWeight());
        System.out.println("Y midiendo: " + paciente1.getHeight() + " cm de altura");
        System.out.println("Teniendo un IMC de: " + paciente1.IMC());
        System.out.println("Entra en la categoria de: " + paciente1.compotition(paciente1.IMC()) + " Segun su  IMC");


    }
}