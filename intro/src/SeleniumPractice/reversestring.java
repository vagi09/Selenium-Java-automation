package SeleniumPractice;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String life = "lifeisconfusingenoughtogetdistracted";
		 
        // getBytes() method to convert string
        // into bytes[].
        byte[] strAsByteArray = life.getBytes();
 
        byte[] result = new byte[strAsByteArray.length];
 
        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
 
        System.out.println(new String(result));
	}

}
