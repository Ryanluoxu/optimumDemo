package Day09;

public class StringEx01 {

	public static void main(String[] args) {
		
		String str1 = "java";	// Memory location:	3254818 (SCP)
		String str2 = "java";	// Memory location:	3254818 (SCP)
		String str3 = "java1";	// Memory location:	100899407 (SCP)
		
		System.out.println(str1 == str2);
		// True. Because both point to '3254818'.
		
		System.out.println(str1 == str3);
		// False. Because they point to different location.
		
		String str11 = new String("java");	// hashCode: 3254818. Memory location in Heap.	
		String str12 = new String("java");	// hashCode: 3254818. Memory location in Heap.
		// But the memory locations of them are different In Heap.
		
		System.out.println(str11 == str12);
		// False. Because they point to different location.
		
		System.out.println(str11.equals(str12));
		// True. Because '.equal' will check hashCode.
		
		
		// But for other class, hashCode will be different.
		// String has some default method to automatically adjust hashCode.
		
	}

}
