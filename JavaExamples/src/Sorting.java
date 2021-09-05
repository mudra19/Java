import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



class User{
	
	private String name;
	private int age;
	
	
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	
}
public class Sorting {

	public static void main(String[] args) {
		
  List<String>	names = new LinkedList<String>(Arrays.asList("mudra","jammy","brandon","lucas"));

	names.stream().sorted().collect(Collectors.toList());
		
	
	List<User> userList = new ArrayList<>(Arrays.asList(
	        new User("John", 33), 
	        new User("Robert", 26), 
	        new User("Mark", 26), 
	        new User("Brandon", 42)));
	List<User> sortedList = userList.stream().sorted(Comparator.comparingInt(User::getAge)).collect(Collectors.toList());
	//sortedList.forEach(System.out::println);
	
	Map<String, User> map = new HashMap<>();

	User employee1 = new User( "Mher",23);
	map.put(employee1.getName(), employee1);
	User employee2 = new User( "Annie",22);
	map.put(employee2.getName(), employee2);
	User employee3 = new User( "John",34);
	map.put(employee3.getName(), employee3);
	User employee4 = new User( "George",43);
	map.put(employee4.getName(), employee4);
	
	Map<String, User> sortedMap	= map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldValue, newValue) -> oldValue,LinkedHashMap::new));
	
	System.out.println(sortedMap);
}
}
