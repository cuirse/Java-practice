package practice1;

public class ThreeArray {//三维数组，就是二维数组的数组
	public static void main(String[] args) {
		int[][][] ns= {{
			{12,34,23,43},
			{22,34,45,66},
			{12,11}
		},{
			{11,12},
			{12},
			{22,23,22,34},
			{34,54,33,23}
		}};
		
		
		//二维数组表示一组学生的各科成绩，计算平均分
		
		int[][] scores = {
                { 82, 90, 91 },
                { 68, 72, 64 },
                { 95, 91, 89 },
                { 67, 52, 60 },
                { 79, 81, 85 },
        };
        // TODO:
		int sum=0;
		int con=0;
		for (int[] is : scores) {//for each
			for (int n : is) {
				sum+=n;
				con++;
			}
		}
        double average = 0;
        average=(double)sum/con;
        System.out.println(average);
        if (Math.abs(average - 77.733333) < 0.000001) {
            System.out.println("测试成功");
        } else {
            System.out.println("测试失败");
        }
	}
}
