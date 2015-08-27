package com.dslplatform.ocd.test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Ping {
    private long timeoutMs;
    private long intervalMs;
    private URL url;

    private Ping(
            final long timeoutMs,
            final long intervalMs,
            final URL url) {
        this.timeoutMs = timeoutMs;
        this.intervalMs = intervalMs;
        this.url = url;
    }

    private static void sleep(final long lengthMs) {
        try {
            Thread.sleep(lengthMs);
        } catch (final InterruptedException e) {}
    }

    public void start() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                sleep(timeoutMs);
                System.out.println("Timed out!");
                System.exit(3);
            }
        }).start();

        final AtomicInteger counter = new AtomicInteger();
        final AtomicBoolean success = new AtomicBoolean();
        final Random random = new Random();

        while (true) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        final StringBuilder sb = new StringBuilder();
                        final int cases = random.nextInt(0xf);
                        sb.append((cases & 1) == 1 ? 'P' : 'p');
                        sb.append((cases & 2) == 2 ? 'I' : 'i');
                        sb.append((cases & 4) == 4 ? 'N' : 'n');
                        sb.append((cases & 8) == 8 ? 'G' : 'g');
                        sb.append("? ");

                        if (counter.addAndGet(1) % 10 == 0) {
                            System.out.println(sb);
                        } else {
                            System.out.print(sb);
                        }

                        final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                        try {
                            final int response = connection.getResponseCode();
                            if (response == 404 || response == 200) {
                                if (success.compareAndSet(false, true)) {
                                    System.out.println("PONG!");
                                }
                                System.exit(0);
                            }
                        }
                        finally {
                            connection.disconnect();
                        }
                    }
                    catch (final IOException e) {}
                }
            }).start();
            sleep(intervalMs);
        }
    }

    private static Ping parse(final String[] args) {
        if (!(args.length == 5 &&
                args[0].equals("-t") &&
                args[1].matches("\\d{1,18}ms") &&
                args[2].equals("-i") &&
                args[3].matches("\\d{1,18}ms"))) {
            throw new IllegalArgumentException("Usage: java -jar ping.jar -t 10000ms -i 100ms http://localhost:8080/path");
        }

        final long timeoutMs = Long.valueOf(args[1].substring(0, args[1].length() - 2));
        final long intervalMs = Long.valueOf(args[3].substring(0, args[3].length() - 2));
        if (intervalMs < 50) {
            throw new IllegalArgumentException("Interval too short (" + args[5] + "), must be >= 50ms!");
        }

        try {
            final URL url = new URL(args[4]);
            return new Ping(timeoutMs, intervalMs, url);
        }
        catch (final MalformedURLException e) {
            throw new IllegalArgumentException("Invalid URL provided: " + args[4]);
        }
    }

    public static void main(final String[] args) {
        try {
            parse(args).start();
        }
        catch (final IllegalArgumentException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }
}
