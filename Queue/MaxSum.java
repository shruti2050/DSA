import java.util.*;

public class MaxSum {
    static Long[][][] memo; // Using Long object to store null for "unvisited"
    static int n;

    public static long solve(int i, int x, int y, int z, int[] A, int[] B) {
        // Base Case: No more operations left
        if (i == n) return 0;

        // Check if we already calculated this (using i, x, z as state)
        // We don't need 'y' in the memo because it's dependent on x and z
        if (memo[i][x][z] != null) return memo[i][x][z];

        // Current Y can be derived from starting X,Y,Z and current X,Z
        // But for simplicity in your first fix, let's just use the state directly
        
        // Option 1: Subtract B[i] (X, Y, Z stay the same)
        long res = solve(i + 1, x, y, z, A, B) - B[i];

        // Option 2: Decrease X and Y, then add A[i]*(X-1)*(Y-1)*Z
        if (x > 0 && y > 0) {
            long gain = (long) A[i] * (x - 1) * (y - 1) * z;
            res = Math.max(res, gain + solve(i + 1, x - 1, y - 1, z, A, B));
        }

        // Option 3: Decrease Y and Z, then add A[i]*X*(Y-1)*(Z-1)
        if (y > 0 && z > 0) {
            long gain = (long) A[i] * x * (y - 1) * (z - 1);
            res = Math.max(res, gain + solve(i + 1, x, y - 1, z - 1, A, B));
        }

        return memo[i][x][z] = res;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt()) return;
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();

        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < N; i++) A[i] = sc.nextInt();
        for (int i = 0; i < N; i++) B[i] = sc.nextInt();

        n = N;
        // Memory can be tight, so we use N+1, X+1, Z+1
        memo = new Long[N + 1][X + 1][Z + 1];

        long finalResult = solve(0, X, Y, Z, A, B);
        long MOD = 1000000007L;
        
        // Handle negative modulo correctly
        System.out.println((finalResult % MOD + MOD) % MOD);
    }
}