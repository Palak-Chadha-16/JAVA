public class SynsetAvg {
    public static void main(String[] args) {
        int a = 12, m = 14, j = 8;
        double avg = (a + m + j) / 3.0;
        
        System.out.println("Synsets entered for April: " + a);
        System.out.println("Synsets entered for May: " + m);
        System.out.println("Synsets entered for June: " + j);
        System.out.println("Average synsets entered: " + String.format("%.2f", avg));
    }
}