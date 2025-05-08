class Monitor {
    public void connect(VGA connector) {
        System.out.println("Monitor expecting VGA cable...");
        connector.connectWithVGA();
        System.out.println("Connected successfully.");
    }
}
