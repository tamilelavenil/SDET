package classRoomWeek3_Hash_Map_Set_ASCII;

public class Hashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sizeOfArray =16;
		
		int hashValue = "SizeOfTheArray".hashCode();
		
		int boxedValue = hashValue>>>16;
		
		System.out.println((sizeOfArray-1)& boxedValue);

	}

}
