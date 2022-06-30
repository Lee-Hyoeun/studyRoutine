package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class no10845 {
    static ArrayList<Integer> queue = new ArrayList<>();

    static void push(int x) {
        queue.add(x);
    }

    static int pop() {

        int last = -1;

        if (queue.size() == 0) {
            return last;
        } else {
            last = queue.get(0);
            queue.remove(0);
        }
        return last;
    }

    static int size() {

        return queue.size();
    }

    static int empty() {

        if (queue.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

    static int top() {
        if (queue.isEmpty()) {
            return -1;
        } else {
            return queue.get(queue.size() - 1);
        }
    }

    static int front() {
        if (queue.isEmpty()) {
            return -1;
        }
        return queue.get(0);
    }

    static int back() {

        if (queue.isEmpty()) {
            return -1;
        }
        return queue.get(queue.size() - 1);
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] current = br.readLine().split(" ");

            if (current[0].equals("push")) {
                push(Integer.parseInt(current[1]));
            }

            if (current[0].equals("pop")) {
                System.out.println(pop());
            }

            if (current[0].equals("size")) {
                System.out.println(size());
            }

            if (current[0].equals("empty")) {
                System.out.println(empty());
            }

            if (current[0].equals("top")) {
                System.out.println(top());
            }

            if (current[0].equals("front")) {
                System.out.println(front());
            }

            if (current[0].equals("back")) {
                System.out.println(back());
            }

        }

    }
}
