package herencias.elmainsito;

public class shitTest {
    public static void main(String[] args) {

        double s1 = 3;
        double s2 = 4;
        double s3 = 5;

        double S = (s1 + s2 + s3) / 2;
        double area = Math.sqrt(S * (S - s1) * (S - s2) * (S - s3));

        System.out.println(area);
    }
}
