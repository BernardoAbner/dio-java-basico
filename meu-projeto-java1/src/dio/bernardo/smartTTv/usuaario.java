package dio.bernardo.smartTTv;

public class usuaario {
    public static void main(String[] args) throws Exception {

        SmaaartTv smartTv = new SmaaartTv();
        
        System.out.println("Canal atual: "+ smartTv.canal);

        smartTv.mudarCanal(13);

        System.out.println("Canal atual: "+ smartTv.canal);

        smartTv.abaixarVolume();
        smartTv.abaixarVolume();
        smartTv.abaixarVolume();
        smartTv.aumentarVolume();


 
         System.out.println("A TV está ligada? " + smartTv.ligada);
         System.out.println("Canal atual: " + smartTv.canal);
         System.out.println("Volume atual " + smartTv.volume);
         
         smartTv.ligar();
         System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

         smartTv.desligar();
         System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);

         smartTv.aumentarVolume();
         System.out.println("Novo status de volume ");

    
    }
}
