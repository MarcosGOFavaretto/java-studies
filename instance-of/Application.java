class Application {

	public static void main(String[] args) {

		Object obj = new String("Hello");

		if (obj instanceof String str && "Hello".equals(str))
			System.out.println(str);
		
	}
}
