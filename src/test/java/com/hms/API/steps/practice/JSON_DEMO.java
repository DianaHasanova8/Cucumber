//package com.hms.API.steps.practice;
//
//import java.awt.print.Book;
//import java.util.List;
//import java.util.Map;
//
//import org.json.JSONArray;
//import org.json.JSONObject;
//
//import io.restassured.path.json.JsonPath;
//
//public class JSON_DEMO {
//	public static void main(String[] args) {
//		//String storeText = readJson(STORE_JSON);
//
//		// 1st way, using JsonPath
//		//JsonPath j = new JsonPath(storeText);
////		j.prettify(); //will not print
////		j.prettyPrint(); //will print
//
//		// This is sooo beautiful :)
//		// This will get the second book from the list
//		// and will deserialize into Book object
//
//		// For this we added GSON dependency into pom.xml file
//		// Have a quick look at this link:
//		// https://howtodoinjava.com/gson/gson-serialize-deserialize-json/
//
//		// This link helps you Create the Book class and other classes
//		// http://www.jsonschema2pojo.org/
//
//		Book bookType = j.getObject("store.book[1]", Book.class);
//		System.out.println(bookType.bookInfo());
//		System.out.println("=========================================================");
//
//		// Get the expensive value as an integer, using get()
//		int expensive1 = j.get("expensive");
//		System.out.println("expensive value as an integer: " + expensive1);
//
//		// Get the expensive value as a String, using getString()
//		String expensive2 = j.getString("expensive");
//		System.out.println("expensive value as an String: " + expensive2);
//
//		// Get the list of Books as a String
//		String books = j.getString("store.book");
//		System.out.println(books);
//
//		// Get the second book as a String
//		String secondBook = j.getString("store.book[1]");
//		System.out.println("secondBook as String: " + secondBook);
//
//		// 1.a Get the second book as an Object
//		Object secondBookObject = j.get("store.book[1]");
//		System.out.println("secondBook as Object: " + secondBookObject);
//
//		// Cast the Object into Map
//		Map<String, Object> castedMap = (Map<String, Object>) secondBookObject;
//		System.out.println("castedMap: " + castedMap);
//
//		// 1.b Get the second book as an Map
//		Map<String, Object> secondBookMap = j.get("store.book[1]");
//		System.out.println("secondBook as Map: " + secondBookMap);
//
//		// Get the title of the second book
//		String title = j.getString("store.book[1].title");
//		System.out.println("Second book title: " + title);
//
//		// Get the price of the second book. It is a float, not String
//		float secondBookPrice = j.get("store.book[1].price");
//		System.out.println("Second book price: " + secondBookPrice);
//
//		// Get the titles of ALL books. You don use [] after book
//		List<String> titleList = j.get("store.book.title");
//		System.out.println("All titles: " + titleList);
//
//		// Get the size of book Array/List
//		int size = j.get("store.book.size()");
//		System.out.println("How many books? " + size);
//
//		// That's how we set the root path
//		j.setRootPath("store.book[3]");
//		// Now we only need to give the path after "store.book[3]".
//		// Kind of relative path
//		String fourthBookTitle = j.get("title");
//		System.out.println("Forth book title: " + fourthBookTitle);
//
//		System.out.println("=========================================================");
//
//		JSONObject jObject = new JSONObject(storeText);
//
//		// Two different ways to get expensive value, using getInt() and get()
//		int expensive101 = jObject.getInt("expensive");
//		System.out.println("expensive using getInt() is: " + expensive101);
//		int expensive102 = (int) jObject.get("expensive");
//		System.out.println("expensive using get() is: " + expensive102);
//
//		// We are getting the store object inside the whole object
//		JSONObject store = jObject.getJSONObject("store");
//
//		// We are getting the bicycle object inside the store object
//		JSONObject bicycle = store.getJSONObject("bicycle");
//		System.out.println("bicycle ->" + bicycle);
//
//		// We are getting the book List/Array from the store object
//		JSONArray bookList = store.getJSONArray("book");
//		System.out.println("bookList -> " + bookList);
//
//		// 2.a Getting third book from list using get and casting into JSONObject
//		JSONObject book1 = (JSONObject) bookList.get(2);
//		System.out.println("book -> " + book1);
//
//		// 2.b Getting third book from list using getJSONObject
//		JSONObject book2 = bookList.getJSONObject(2);
//		System.out.println("book -> " + book2);
//
//		// Two different ways to get price value, using getDouble() and get()
//		double price1 = book2.getDouble("price");
//		System.out.println("price using getDouble() is: " + price1);
//		double price2 = (double) book2.get("price");
//		System.out.println("expensive using get() is: " + price2);
//	}
//}
