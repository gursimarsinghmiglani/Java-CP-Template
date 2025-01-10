import java.io.*;
import java.util.*;

public class {ClassName} {
    static class FastIO {
        BufferedReader reader;
        BufferedWriter writer;
        StringTokenizer tokenizer;

        FastIO() {
            reader = new BufferedReader(new InputStreamReader(System.in));
            writer = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    String line = reader.readLine();
                    if (line == null) return null;
                    tokenizer = new StringTokenizer(line);
                }
                return tokenizer.nextToken();
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }

        int nextInt() {
            try {
                return Integer.parseInt(next());
            } catch (NumberFormatException e) {
                e.printStackTrace();
                return 0;
            }
        }

        long nextLong() {
            try {
                return Long.parseLong(next());
            } catch (NumberFormatException e) {
                e.printStackTrace();
                return 0L;
            }
        }

        double nextDouble() {
            try {
                return Double.parseDouble(next());
            } catch (NumberFormatException e) {
                e.printStackTrace();
                return 0.0;
            }
        }

        String nextLine() {
            try {
                tokenizer = null; // Clear tokenizer
                return reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }

        void print(Object obj) {
            try {
                writer.write(obj.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        void println(Object obj) {
            try {
                writer.write(obj.toString());
                writer.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        void flush() {
            try {
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        void close() {
            try {
                reader.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static FastIO fio = new FastIO();

    public static void main(String[] args) {

        fio.flush();
        fio.close();
    }
}
