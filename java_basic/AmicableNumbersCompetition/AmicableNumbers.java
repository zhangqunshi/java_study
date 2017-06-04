import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Intel的多线程比赛-相亲数的计算
 * http://softwarecontests-zho.intel.com/threadingchallenge
 * 
 * @author kris
 */
public class AmicableNumbers {

	static int startNum;
	static int endNum;

	/**
	 * 相亲数线程
	 */
	static class AmicableNumber extends Thread {
		public void run() {
			HashMap<Integer, Integer> numSum = new HashMap<Integer, Integer>();

			// 计算出所有数的正约数(proper divisors)之和
			for (int i = startNum; i <= endNum; i++) {
				int sum = 0;
				for (int k = 1; k <= i / 2; k++) {
					if ((i % k) == 0) {
						sum += k;
					}
				}
				numSum.put(i, sum);
			}

			// 得到所有相亲数
			ArrayList<Integer> list = new ArrayList<Integer>();
			Iterator<Integer> it = numSum.keySet().iterator();
			while (it.hasNext()) {
				Integer key1 = it.next();
				Integer value1 = numSum.get(key1);
				Integer value2 = numSum.get(value1);

				if ((value2 != null) && (key1.intValue() == value2.intValue())
						&& (key1.intValue() != value1.intValue())
						&& !list.contains(key1)) {
					list.add(value1);
					System.out.println(key1 + "和" + value1 + "是相亲数");
				}
			}
			
			System.out.println("===Finish to populate Amicable Number===");
		}
	}

	/**
	 * 亲和数线程
	 */
	static class FriendlyNumber extends Thread {
		public void run() {
			int len = endNum - startNum + 1;

			int[] num = new int[len];
			int[] sums = new int[len];
			int[] oldNum = new int[len]; // 保存最开始的数

			// 计算公约数之和
			for (int i = startNum, j = 0; i <= endNum; i++) {
				int sum = 0;
				for (int k = 1; k <= i / 2; k++) {
					if ((i % k) == 0) {
						sum += k;
					}
				}
				num[j] = i; // 把被计算的数保存在a数组中
				oldNum[j] = i;
				sums[j] = sum + i; // 把公约数的和保存在b数据中
				j++;
			}

			for (int i = 0; i < num.length; i++) {

				// 计算约分结果
				for (int k = 2; k <= num[i];) {
					if (num[i] == 1 || sums[i] == 1) {
						break;
					}
					if ((num[i] % k == 0) && (sums[i] % k == 0)) {
						num[i] = num[i] / k;
						sums[i] = sums[i] / k;
						continue;
					}
					k++;
				}

				for (int j = 0; j < sums.length; j++) {
					if (num[j] == num[i] && sums[j] == sums[i] && i != j) {
						System.out.println(oldNum[j] + " 和 " + oldNum[i]
								+ " 是亲和数");
					}
				}
			}
			
			System.out.println("===Finish to populate Friendly Number===");

		}
	}

	/**
	 * 主函数
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("===Program START===");

		if (args == null || args.length != 2) {
			System.out.println("Usage: java AmicableNumbers <num1> <num2>");
			return;
		}

		startNum = Integer.parseInt(args[0]);
		endNum = Integer.parseInt(args[1]);

		if (startNum > endNum) {
			System.out.println("Error: the <num1> should less than <num2>");
			return;
		}

		new AmicableNumber().start();
		new FriendlyNumber().start();
		
	}

}
