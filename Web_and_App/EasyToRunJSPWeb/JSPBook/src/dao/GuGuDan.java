package dao;

public class GuGuDan {
	public StringBuilder process(int num) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < 10; i++) {
			sb.append(num).append(" * ").append(i).append(" = ").append(num * i).append("<br>");
		}
		return sb;
	}
}
