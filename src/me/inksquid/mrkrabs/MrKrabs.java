package me.inksquid.mrkrabs;

public class MrKrabs {

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        while (true) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        MrKrabs.run();
                    }
                }
            }).start();
        }
    }
}
