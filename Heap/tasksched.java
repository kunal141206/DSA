import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class  tasksched{
    
class Task implements Comparable<Task> {
    int frequency;
    int executiontime;

    Task(int f, int t) {
        frequency = f;
        executiontime = t;
    }

    public int compareTo(Task that) {
        return that.frequency - this.frequency; // Max-Heap based on frequency
    }
}
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character, Integer> freq = new HashMap<>();

        // Step 1: Calculate frequency of each task
        for (char ch : tasks) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Create a priority queue based on task frequency
        PriorityQueue<Task> pq = new PriorityQueue<>();
        for (Character ch : freq.keySet()) {
            int frequ = freq.get(ch);
            pq.offer(new Task(frequ, 0));
        }

        Queue<Task> queue = new LinkedList<>();
        int time = 0;

        // Step 3: Process tasks until both priority queue and cooldown queue are empty
        while (!pq.isEmpty() || !queue.isEmpty()) {
            time++;

            // If there are available tasks in the priority queue
            if (!pq.isEmpty()) {
                Task task = pq.poll();
                task.frequency--;

                // If the task still needs to be executed, put it in the cooldown queue
                if (task.frequency > 0) {
                    task.executiontime = time + n;
                    queue.offer(task);
                }
            }

            // Check if any task in the cooldown queue is ready to be re-inserted
            if (!queue.isEmpty() && queue.peek().executiontime == time) {
                pq.offer(queue.poll());
            }
        }

        return time;
    }
}
