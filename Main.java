/**
 * Main
 */
import java.util.Random;
public class Main {

    static Random rnd = new Random();

    public static void main(String[] args) throws Exception {
        int fruta=0, peso=0, tamF = 0, tamM = 0, tamMen = 0, pesoF=0, pesoM=0, pesoMen=0;

        ColaCajas Cola1 = new ColaCajas();




        for (int i = 0; i <30 ; i++) {

            fruta = rnd.nextInt(3);

            do {
                peso = rnd.nextInt(10);
            } while (peso==0);
            System.out.println(peso);
            
            
            switch (fruta) {
                case 0:
                    Cola1.enqueue("Fresa", peso);
                    tamF++;
                    break;

                case 1:
                    Cola1.enqueue("Manzana", peso);
                    tamM++;
                    break;

                case 2:
                    Cola1.enqueue("Membrillo", peso);
                    tamMen++;
                    break;

            
                default:
                    break;
            }

        }
        
        
        PilaFresa pilaFresa = new PilaFresa(tamF);
        PilaManzana pilaManzana = new PilaManzana(tamM);
        PilaMembrillo pilaMebrillo = new PilaMembrillo(tamMen);



        while (!Cola1.isEmpty()) {
            
            String TipoFruta="";
            int PesoFruta = 0;

            TipoFruta= Cola1.dequeue();
            PesoFruta= Cola1.dequeuePeso();

            
            switch (TipoFruta) {
                case "Fresa":


                    pilaFresa.push(TipoFruta, PesoFruta);
                    pesoF=+PesoFruta;
                    break;

                case "Manzana":
                  
                    pilaManzana.push(TipoFruta, PesoFruta);
                    pesoM=+PesoFruta;
                    break;

                case "Membrillo":
                
                   
                    pilaMebrillo.push(TipoFruta, PesoFruta);
                    pesoMen=+PesoFruta;
                    break;
            
                default:
                    break;
            }
                
        }

        System.out.println("El peso de  " +tamF+" Fresas son:  "+pesoF);
        System.out.println("El peso de " +tamM+" Manzanas son: "+pesoM);
        System.out.println("El peso de " +tamMen+" Menbrillos son:  "+pesoMen);



        
        
            

        


    }
}