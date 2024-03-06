package Week_1_Basics;

import java.util.Scanner;

public class FCFS_Scheduling {

    private static double calculateAverage(int[] array) {
        double sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of processes: ");
        int n = scanner.nextInt();

        int[] burstTime = new int[n];
        int[] waitingTime = new int[n];
        int[] turnaroundTime = new int[n];

        System.out.println("Enter the burst time for each process:");
        for (int i = 0; i < n; i++) {
            System.out.print("Process " + (i + 1) + ": ");
            burstTime[i] = scanner.nextInt();
        }

        // Calculate waiting time and turnaround time
        waitingTime[0] = 0;
        turnaroundTime[0] = burstTime[0];
        for (int i = 1; i < n; i++) {
            waitingTime[i] = waitingTime[i - 1] + burstTime[i - 1];
            turnaroundTime[i] = waitingTime[i] + burstTime[i];
        }

        // Calculate average waiting time and average turnaround time
        double avgWaitingTime = calculateAverage(waitingTime);
        double avgTurnaroundTime = calculateAverage(turnaroundTime);

        // Display the results
        System.out.println("\nProcess\tBurstTime\tWaitingTime\tTurnaroundTime");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "\t\t\t" + burstTime[i] + "\t\t\t\t" + waitingTime[i] + "\t\t\t" + turnaroundTime[i]);
        }

        System.out.println("\nAverage Waiting Time: " + avgWaitingTime);
        System.out.println("Average Turnaround Time: " + avgTurnaroundTime);
    }
}

