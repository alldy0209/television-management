package utils;

public class StringUtils {
	private StringUtils() {
		throw new IllegalStateException("Utility class");
	}
	/*
	 * Kiểm tra chuỗi ký tự có phải là null hoặc rỗng  
	 */
	public static boolean isNullOrEmpty(String text) {
		return text == null || text.length() == 0;
	}
}
