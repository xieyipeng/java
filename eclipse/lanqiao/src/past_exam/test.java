package past_exam;


//标题：猜字母
//
//    把abcd...s共19个字母组成的序列重复拼接106次，得到长度为2014的串。
//
//    接下来删除第1个字母（即开头的字母a），以及第3个，第5个等所有奇数位置的字母。
//
//    得到的新串再进行删除奇数位置字母的动作。如此下去，最后只剩下一个字母，请写出该字母。
//
//答案是一个小写字母，请通过浏览器提交答案。不要填写任何多余的内容。
public class test {

	public static void main(String args[]) {
		double x = 111; 
		for(int n = 10000; n>=0; n--){
			int i = 2 * n + 1;
			x = 2 + (i*i / x);
		}
		
		System.out.println(String.format("%.4f", 4 / (x - 1)  ));
	}
}
