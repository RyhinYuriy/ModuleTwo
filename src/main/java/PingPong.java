public class PingPong {
    public static void main(String[] args) {
Player pk = new Player("Computer");
Thread newPk = new Thread(pk);
newPk.start();
    }
}
