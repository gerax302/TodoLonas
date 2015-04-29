package Notificaciones;
    
import java.util.Timer;
import java.util.TimerTask;

class TimerEx { 
    
    public static void main(String arglist[]) {
        Timer timer;
        timer = new Timer();

        TimerTask task = new TimerTask() {
            int tic=0;
            int cont=1;
            boolean uno=false;
            
            public void run(){
                if (tic%2==0)
                    System.out.println("TIC");
                else
                    System.out.println("TOC");
                tic++;
                
                if (cont>3) {
                    //System.exit(0);
                }
                if (tic%10==0) {
                    try {
//                        if(cont%2==0)
//                            Pruebas.mostrarAlerta();
//                        else
//                            Pruebas.mostrarAlerta2();
                        Pruebas.mostrarAlerta();
                        
                        cont++;
                        System.out.println("CONTEO: "+cont);
                    }
                    catch (Exception ex) {
                        System.out.println("Eeeeee");
                    }       
                }
            }
        };
        // Empezamos dentro de 10ms y luego lanzamos la tarea cada 1000ms
        timer.schedule(task, 10, 1000);
    }
}