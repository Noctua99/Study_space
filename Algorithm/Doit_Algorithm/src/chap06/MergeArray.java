package chap06;

public class MergeArray {
    public static void main(String[] args) {
        MergeArray sample = new MergeArray();
        int[] a = new int[]{2, 4, 6, 8, 11, 13};
        int[] b = new int[]{1, 2, 3, 4, 9, 16, 21};
        int[] c = new int[13];

//        sample.merge(a, a.length, b, b.length, c);
        sample.merge2(a, a.length, b, b.length, c);
        for (int data : c) {
            System.out.print(data + " ");
        }
    }

    public void merge(int[] a, int na, int[] b, int nb, int[] c) {
        int pa = 0;
        int pb = 0;
        int pc = 0;

        while (pa < na && pb < nb) {
            c[pc++] = (a[pa] <= b[pb]) ? a[pa++] : b[pb++];
        }
        while (pa < na)
            c[pc++] = a[pa++];
        while (pb < nb)
            c[pc++] = b[pb++];
    }

    public void merge2(int[] a, int na, int[] b, int nb, int[] c) {
        int pa = 0;
        int pb = 0;
        int pc = 0;

        while (pa < na && pb < nb) {
            if (a[pa] >= b[pb]) {
                c[pc] = b[pb];
                pc++;
                pb++;
            } else {
                c[pc] = a[pa];
                pc++;
                pa++;
            }
        }
        while (pa < na) {
            c[pc]=a[pa];
            pc++;
            pa++;
        }
        while (pb < nb) {
            c[pc]=b[pb];
            pc++;
            pb++;
        }
    }
}
