class Application {

	public static void main(String[] args) {

		boolean textValue = myFunction(1);

		System.out.println(textValue);

	}

	public static boolean myFunction(int value){
	
		boolean textValue = switch (value) {
			case 1 -> {
				System.out.println("Um");
				yield true;
			}
			default -> false;
	        };

		return false;
	}
}
