package chap02;

public class Practice_2_14 {
    static final int VMAX = 21;

    static class PhysicalData {
        String name;
        int height;
        double vision;

        PhysicalData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    public static void main(String[] args) {
        PhysicalData[] dataArray = {
                new PhysicalData("박현규", 162, 0.3),
                new PhysicalData("함진아", 173, 0.7),
                new PhysicalData("최윤미", 175, 2.0),
                new PhysicalData("홍연의", 171, 1.5),
                new PhysicalData("이수진", 168, 0.4),
                new PhysicalData("김영준", 174, 1.2),
                new PhysicalData("박용규", 169, 0.8),
        };
        int[] vdist = new int[VMAX];

        for (int i = 0; i < dataArray.length; i++) {
            System.out.printf("%-8s%3d%5.1f\n", dataArray[i].name, dataArray[i].height, dataArray[i].vision);
        }
        System.out.println("average height : " + String.format("%.1f", averageHeight(dataArray)));

        distributeVision(dataArray, vdist);

        System.out.println("시력 분포");
        for (int i = 0; i < VMAX; i++) {
            System.out.println(i/10.0+"~:"+vdist[i]+"명");
        }
    }


    static double averageHeight(PhysicalData[] data) {
        double sum = 0;

        for (int i = 0; i < data.length; i++) {
            sum += data[i].height;
        }
        return sum / data.length;
    }

    static void distributeVision(PhysicalData[] data, int[] distribution) {
        int i = 0;

        distribution[i] = 0;
        for (i = 0; i < data.length; i++) {
            if (data[i].vision >= 0.0 && data[i].vision <= VMAX / 10.0) {
                distribution[(int) (data[i].vision * 10)]++;
            }
        }
    }
}
