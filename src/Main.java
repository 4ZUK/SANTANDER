public class Main extends Cliente {

    public static void main(String[] args) {
        Cliente Patrick = new Cliente("Doria", "16203840785", 0001, 123321);
//        Cliente Joao = new Cliente("das neve", "11231232", 002, 1111123, );

    //    Conta Conta1 = new Conta(500);

        Conta conta1  = new Conta(500,"",4.5,6543,2);
        conta1.novaConta(Patrick,conta1);
    }

}
