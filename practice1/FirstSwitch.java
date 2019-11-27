package practice1;
//不要忘记break 不要忘记default
//不要忘记break 不要忘记default
//不要忘记break 不要忘记default


public class FirstSwitch {
	public static void main(String[] args) {
		int option=3;
		switch(option){
		case 1:
			System.out.println("Slescted 1");
			break;
		case 2:
			/*System.out.println("Slescted 2");
			break;*/
		//case语句具有穿透性，当没有break时会执行所有后续语句
		case 3:
			System.out.println("Slescted 3");
			break;
		default:
			//当值不为任何选项时，则输出default选项
			System.out.print("No Selected");
			break;
		}
		
		//还可以判定字符串
        String fruit = "apple";
        switch (fruit) {
        case "apple":
            System.out.println("Selected apple");
            break;
        case "pear":
            System.out.println("Selected pear");
            break;
        case "mango":
            System.out.println("Selected mango");
            break;
        default:
            System.out.println("No fruit selected");
            break;
        }
	}
}
