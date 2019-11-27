package practice1;

		import java.util.Scanner;

		/**
		 * switch实现石头/剪子/布并判断胜负
		 */
		public class SecondSwitch {

			public static void main(String[] args) {
				System.out.println("please choice:");
				System.out.println(" 1: Rock");//石头
				System.out.println(" 2: Scissors");//剪刀
				System.out.println(" 3: Paper");//布
				// 用户输入:
				/*Scanner scanner=new Scanner(System.in);
				
				int choice = 0;
				System.out.println("欢迎来到猜拳游戏，请输入选择：");
				choice =scanner.nextInt();*/
				// 计算机随机数 1, 2, 3:
				int n=1;
				int win=0;
				int lose=0;
				while (n<=10) {
					int choice = 1 + (int) (Math.random() * 3);
				int random = 1 + (int) (Math.random() * 3);
				System.out.println(random);
				int cha=choice-random;
				System.out.println(cha);
				
				
				//比赛的实现
				switch (choice-random) {
				// TODO:
				case 0:
					System.out.println("平局");
					break;
				case 1:
				case-2:
					System.out.println("你输了");
					lose++;
					break;
				case 2:
				case -1:
					System.out.println("你赢了");
					win++;
					break;
				default:
					System.out.print("好像出现了意料外的值呢");
					break;
				
				}
				
				
				n++;
				}
				
				
				System.out.println("你赢的次数："+win+"\n"+"你输的次数"+lose);
				
				
			}

		}

	

