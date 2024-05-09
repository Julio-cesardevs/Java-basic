public class App {
    public static void main(String[] args) throws Exception {

        SmarteTv smarteTv = new SmarteTv();

        System.out.println(" Tv Ligada ? : " + smarteTv.ligada);
        System.out.println(" Canal atual ? : " + smarteTv.canal);
        System.out.println(" Volume atual ? : " + smarteTv.volume);
        System.out.println(" stremem atual ? : " + smarteTv.streeming);


        smarteTv.ligar();
        System.out.println(" Novo Status -> Tv Ligada ? : " + smarteTv.ligada);

        smarteTv.desligar();
        System.out.println(" Novo Status -> Tv Ligada ? : " + smarteTv.ligada);

        smarteTv.escolhaCanal();
        System.out.println("Nova Escolha de ->  Canal atual ? : " + smarteTv.canal);

        smarteTv.escolhaStreemig();
        System.out.println("Nova Escolha de ->  stremem atual ? : " + smarteTv.streeming);



        
    }
}
