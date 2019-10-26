package pl.com.grzegorz.gebala.app;

public class LibraryApp {
    private static final String appName = "Biblioteka v1.0";

    public static void main(String[] args) {
        System.out.println(appName);
        LibraryControl libControl = new LibraryControl();
        libControl.controlLoop();
    }
}