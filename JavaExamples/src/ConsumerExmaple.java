import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExmaple {
	
	public static void main(String[] args) {
		
		
		List<String> cities = Arrays.asList("delhi","chandigarh","mumbai");
		nested2(cities);
		Consumer<List<String>> upperCase = (cityList) ->{ 
			
      //  cityList.forEach(city -> city.toUpperCase());		
			 for(int i=0; i< cityList.size(); i++){
				 cityList.set(i, cityList.get(i).toUpperCase());
		        }
		
		};
		
		Consumer<List<String>> printCity= (cityList) ->{ 
			
			cityList.forEach(city -> System.out.println(city));			
		};
		
	//	upperCase.andThen(printCity).accept(cities);
	}

	private static void nested1(List<String> cities) {
		List<List<String>> nestedCities = new ArrayList<>();
		nestedCities.add(cities);
		nestedCities.forEach(cityList -> {
			
			cityList.forEach(city -> System.out.println(city));
		});
	}
	
	private static void nested2(List<String> cities) {
		 List<List<String>> nestedCollection = new ArrayList<>();

	        List<String> strList1 = Arrays.asList("List 1 Str 1", "List 1 Str 2", "List 1 Str 3");

	        List<String> strList2 = Arrays.asList("List 2 Str 4", "List 2 Str 5");

	        List<String> strList3 = Arrays.asList("List 3 Str 6", "List 3 Str 7", "List 3 Str 8", "List 3 Str 9");

	        nestedCollection.add(strList1);
	        nestedCollection.add(strList2);
	        nestedCollection.add(strList3);

	        List<String> flattenList = new ArrayList<>();

	        nestedCollection.forEach(flattenList::addAll);

	        System.out.println("Flatten List with forEach() : "+flattenList);
	}

}
