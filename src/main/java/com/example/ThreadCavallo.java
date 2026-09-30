package com.example;

public class ThreadCavallo(){
    for(int i ; i<100 ; i++){
        
        try {
            int tempoSleep = random.nextInt(400) + 400; // Tra 400 e 800 ms
            Thread.sleep(tempoSleep);
        } catch (InterruptedException e) {
            System.out.println("Il thread è stato interrotto");
        }
            if (distanzaPercorsa > distanzaTotale) {
                    distanzaPercorsa = distanzaTotale;
                }
                System.out.println(nome + " ha percorso " + distanzaPercorsa + " metri.");
         
    }

}

public class cavallo implements runnable{
    private string nomecavallo;
    private int tragitto;
    private int distanza;
}

public class cavallo (string nomecavallo, int tragitto) {
    this.n = nomecavallo;
    this.t = tragitto;
    this.d = distanza;
}

