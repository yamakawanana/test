
public class Test {
	public static void main(String[] args){
		Person taro = new Person();
		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNumber="07064661563";
		taro.address="Tokyo";
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();
		}
}
