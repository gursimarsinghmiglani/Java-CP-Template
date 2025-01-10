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

        String next() throws IOException {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                String line = reader.readLine();
                if (line == null) return null;
                tokenizer = new StringTokenizer(line);
            }
            return tokenizer.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        String nextLine() throws IOException {
            tokenizer = null; // Clear tokenizer
            return reader.readLine();
        }

        void print(Object obj) throws IOException {
            writer.write(obj.toString());
        }

        void println(Object obj) throws IOException {
            writer.write(obj.toString());
            writer.newLine();
        }

        void flush() throws IOException {
            writer.flush();
        }

        void close() throws IOException {
            reader.close();
            writer.close();
        }
    }

    public static void main(String[] args) throws IOException {
        FastIO fio = new FastIO();
        fio.flush();
        fio.close();
    }
}
