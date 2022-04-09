public class Main {
    public static void main(String[] args) {
        PachetFactory pachetFactory = new PachetFactory();

        PachetTuristic pachetTuristic1 = pachetFactory.getShape("PachetTransport");
        pachetTuristic1.make();

        PachetTuristic pachetTuristic2 = pachetFactory.getShape("PachetCazare");
        pachetTuristic2.make();

        PachetTuristic pachetTuristic3 = pachetFactory.getShape("PachetComplet");
        pachetTuristic3.make();

    }
}
