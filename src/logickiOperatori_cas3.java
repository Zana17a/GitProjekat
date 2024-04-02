public class logickiOperatori_cas3 {
    public static void main(String[] args) {
     System.out.println("Logicki operatori: ");
     int x = 10;
     int y = 20;
     y++;

     boolean res = ((x>9&&x!=25&&y>19&& x!=10) || y!=20 && y==10 || (x==1 && x==2 && x==3) || true);
     System.out.println(res);

    }
}
