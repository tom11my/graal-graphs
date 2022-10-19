import java.util.List;
import java.util.Arrays;

public class Count {
	public static void main(String[] args) {
		List l = Arrays.asList(1, 2, 3);
		while (true) {
			for (String arg : args) {
				countList(l);
			}
		}
	}

	public static int countList(List<Integer> data) {
		int count = 0;
		for (int i = 0; i < data.size(); i++) {
			int y = data.get(i);
			count++;
		}
		return count;
	}
}
