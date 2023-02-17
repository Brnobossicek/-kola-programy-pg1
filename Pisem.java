public class Pisem extends Thread {
    String s;
    int c;
    int q;

    public Pisem(String s, int c) {
        this.s = s;
        this.c = c;
    }

        @Override
        public void run () {
            int x = 0;
            while (true) {
                if (x == s.length()) {
                    x = 0;
                } else {
                    for (int o = 0; o < x; o++) {
                        System.out.print(" ");
                    }
                    try {
                        System.out.print(s.charAt(x));
                        System.out.print("\r");
                        Thread.sleep(c);
                    } catch (InterruptedException e) {
                        System.out.println("nejde");
                        return;
                    }
                    x++;
                }
            }
        }

}
