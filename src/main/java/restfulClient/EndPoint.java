package restfulClient;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

/** Client */
@ManagedBean
public class EndPoint {
	private List<User> users = new ArrayList<>();
	 
	@PostConstruct
	public void create() {
		/** Gson is a Java library that can be used to convert Java Objects 
		 * into their JSON representation. It can also be used to convert 
		 * a JSON string to an equivalent Java object.
		 */
		Gson gson = new Gson();
		
		/**
		 * Create a default client.
		 */
		Client c = Client.create();
		
		/**
		 * A WebResource instance is obtained from the Client.
		 */
		WebResource wr;
		
		/**
		 * Create a Web resource from the client. 
		 */
		wr = c.resource("http://localhost:8000/");

		/**
		 * Invoke the GET method.
		 */
		String json = wr.get(String.class);

		/**
		 * Represents a generic type T. You can use
		 * this class to get the generic type for a class. 
		 * getType -Gets underlying Type instance.
		 */
		Type typeOfCollectionOfUser = new TypeToken<Collection<User>>(){}.getType();
		
		/**
		 * fromJson() methods to convert JSON to Java objects
		 */
		users = gson.fromJson(json, typeOfCollectionOfUser); 		
	}

	/** M�TODO GET */
	public List<User> getUsers() {
		return users;
	}
}