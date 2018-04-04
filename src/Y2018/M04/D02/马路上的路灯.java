package Y2018.M04.D02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 城市E的马路上有很多路灯，每两个相邻路灯之间的间隔都是1公里。小赛是城市E的领导，为了使E城市更快更好的发展，
 * 需要在城市E的一段长度为M的主干道上的一些区域建地铁。这些区域要是建了地铁，就需要挪走相应的路灯。可以把长度为M的主干道看成一个数轴，一端在数轴0的位置，
 * 另一端在M的位置；数轴上的每个整数点都有一个路灯。要建地铁的这些区域可以用它们在数轴上的起始点和终止点表示，已知任一区域的起始点和终止点的坐标都是整数，
 * 区域之间可能有重合的部分。现在要把这些区域中的路灯（包括区域端点处的两个路灯）移走。你能帮助小赛计算一下，将这些路灯移走后，马路上还有多少路灯？
 * Input:
 *      输入文件的第一行有两个整数M（1 <= M <= 10000）和 N（1 <= N <= 100），M代表马路的长度，N代表区域的数目，M和N之间用一个空格隔开。
 *      接下来的N行每行包含两个不同的整数，用一个空格隔开，表示一个区域的起始点和终止点的坐标。所有输入都为整数。且M和N的范围为上面提示范围。
 * output:
 *      输出文件包括一行，这一行只包含一个整数，表示马路上剩余路灯的数目。
 * Sample input :
 *
 * 500 3
 * 100 200
 * 150 300
 * 360 361
 *
 * Sample output:
 *
 * 298
 *
 */
public class 马路上的路灯 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m, n;
        m = scanner.nextInt();
        n = scanner.nextInt();
        Area areas[] = new Area[n];
        for (int i = 0; i < n; i++) {
            areas[i] = new Area(scanner.nextInt(), scanner.nextInt());
        }
        Arrays.sort(areas, new Comparator<Area>() { //ascending sort by areas' start
            @Override
            public int compare(Area o1, Area o2) {
                return o1.getStart() - o2.getStart();
            }
        });
        int all = m + 1;
        int remove = areas[0].getDistance()+1;
        for (int i = 1; i < n; i++) {
            remove += (areas[i].getDistance()+1);
            if (areas[i].getStart() < areas[i - 1].getEnd() ) {
                remove -= (areas[i-1].getEnd() - areas[i].getStart()+1);
            }
        }
        System.out.println(all - remove);
    }
}

class Area {
    private int start;
    private int end;

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public Area(int start, int end) {
        this.start = start;
        this.end = end;
    }
    public int getDistance(){
        return this.end - this.start;
    }
}