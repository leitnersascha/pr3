package at.campus02.pr3.threads.uebungen.ue4;

class PrintDemo {
    public void printCount(Thread thread) {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.print(thread.getName());
                System.out.println(" - Counter   ---   "  + i );
            }
        }catch (Exception e) {
            System.out.println("Thread  interrupted.");
        }
    }
}