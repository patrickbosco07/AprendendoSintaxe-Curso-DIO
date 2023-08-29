public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        String primeiroNome = "Joao";
        String segundoNome = "da Silva";
        System.out.println(nomeCompleto(primeiroNome,segundoNome));


    }
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }

    public static class BoletimEstudantil {
        public static void main(String[] args) {
            int mediaFinal = 6;
            if(mediaFinal<6)
                System.out.println("REPROVADO");
            else if(mediaFinal==6)
                System.out.println("PROVA MINERVA");
            else
                System.out.println("APROVADO");
        }
    }
}