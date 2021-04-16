package eci.ieti;

import eci.ieti.data.CustomerRepository;
import eci.ieti.data.ProductRepository;
import eci.ieti.data.TodoRepository;
import eci.ieti.data.UserRepository;
import eci.ieti.data.model.Customer;
import eci.ieti.data.model.Product;

import eci.ieti.data.model.Todo;
import eci.ieti.data.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {


    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;
    
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TodoRepository todoRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userRepository.deleteAll();
        todoRepository.deleteAll();
        /*
        customerRepository.deleteAll();

        customerRepository.save(new Customer("Alice", "Smith"));
        customerRepository.save(new Customer("Bob", "Marley"));
        customerRepository.save(new Customer("Jimmy", "Page"));
        customerRepository.save(new Customer("Freddy", "Mercury"));
        customerRepository.save(new Customer("Michael", "Jackson"));

        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        
        customerRepository.findAll().stream().forEach(System.out::println);
        System.out.println();
        
        productRepository.deleteAll();

        productRepository.save(new Product(1L, "Samsung S8", "All new mobile phone Samsung S8"));
        productRepository.save(new Product(2L, "Samsung S8 plus", "All new mobile phone Samsung S8 plus"));
        productRepository.save(new Product(3L, "Samsung S9", "All new mobile phone Samsung S9"));
        productRepository.save(new Product(4L, "Samsung S9 plus", "All new mobile phone Samsung S9 plus"));
        productRepository.save(new Product(5L, "Samsung S10", "All new mobile phone Samsung S10"));
        productRepository.save(new Product(6L, "Samsung S10 plus", "All new mobile phone Samsung S10 plus"));
        productRepository.save(new Product(7L, "Samsung S20", "All new mobile phone Samsung S20"));
        productRepository.save(new Product(8L, "Samsung S20 plus", "All new mobile phone Samsung S20 plus"));
        productRepository.save(new Product(9L, "Samsung S20 ultra", "All new mobile phone Samsung S20 ultra"));
        
        System.out.println("Paginated search of products by criteria:");
        System.out.println("-------------------------------");
        
        productRepository.findByDescriptionContaining("plus", PageRequest.of(0, 2)).stream()
        	.forEach(System.out::println);
   
        System.out.println();
         */
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
        MongoOperations mongoOperation = (MongoOperations) applicationContext.getBean("mongoTemplate");

        User user1 = new User("Edwin Paez", "edwin@mail.com");
        User user2 = new User("Johann Rodriguez", "johann@mail.com");
        User user3 = new User("Jose Gomez", "jose@mail.com");
        User user4 = new User("Daniel Rincon", "daniel@mail.com");
        User user5 = new User("Agustin Perez", "agustin@mail.com");
        User user6 = new User("Diego Forlan", "diego@mail.com");
        User user7 = new User("Tony Stark", "tony@mail.com");
        User user8 = new User("Chayanne", "chayanne@mail.com");
        User user9 = new User("Rose Elvira", "rosa@mail.com");
        User user10 = new User("Armando Mendoza", "armando@mail.com");
        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
        userRepository.save(user4);
        userRepository.save(user5);
        userRepository.save(user6);
        userRepository.save(user7);
        userRepository.save(user8);
        userRepository.save(user9);
        userRepository.save(user10);

        Todo todo1 = new Todo("description1description1description1description1description1description1", 1, new Date(121,3,6), user1, "Ready");
        Todo todo2 = new Todo("description2", 2, new Date(121,3,7), user3, "In progress");
        Todo todo3 = new Todo("description3", 3, new Date(121,3,8), user3, "Ready");
        Todo todo4 = new Todo("description4", 4, new Date(121,3,9), user3, "Done");
        Todo todo5 = new Todo("description5", 5, new Date(121,3,10), user3, "In progress");
        Todo todo6 = new Todo("description6description1description1description1description1description1description1", 6, new Date(121,3,11), user7, "Done");
        Todo todo7 = new Todo("description7", 7, new Date(121,3,12), user8, "Ready");
        Todo todo8 = new Todo("description8", 8, new Date(121,3,13), user9, "In progress");
        Todo todo9 = new Todo("description9", 9, new Date(121,3,14), user10, "Ready");
        Todo todo10 = new Todo("description10", 7, new Date(121,3,15), user1, "Ready");
        Todo todo11 = new Todo("description11", 4, new Date(121,3,16), user2, "Ready");
        Todo todo12 = new Todo("description12", 5, new Date(121,3,17), user3, "In progress");
        Todo todo13 = new Todo("description13", 6, new Date(121,3,18), user4, "Ready");
        Todo todo14 = new Todo("description14", 7, new Date(121,3,19), user5, "Done");
        Todo todo15 = new Todo("description15", 1, new Date(121,3,20), user6, "In progress");
        Todo todo16 = new Todo("description16", 2, new Date(121,3,21), user7, "Ready");
        Todo todo17 = new Todo("description17", 3, new Date(121,3,22), user8, "Done");
        Todo todo18 = new Todo("description18", 9, new Date(121,3,23), user9, "In progress");
        Todo todo19 = new Todo("description19", 6, new Date(121,3,24), user10, "Done");
        Todo todo20 = new Todo("description20", 3, new Date(121,3,25), user1, "Ready");
        todoRepository.save(todo1);
        todoRepository.save(todo2);
        todoRepository.save(todo3);
        todoRepository.save(todo4);
        todoRepository.save(todo5);
        todoRepository.save(todo6);
        todoRepository.save(todo7);
        todoRepository.save(todo8);
        todoRepository.save(todo9);
        todoRepository.save(todo10);
        todoRepository.save(todo11);
        todoRepository.save(todo12);
        todoRepository.save(todo13);
        todoRepository.save(todo14);
        todoRepository.save(todo15);
        todoRepository.save(todo16);
        todoRepository.save(todo17);
        todoRepository.save(todo18);
        todoRepository.save(todo19);
        todoRepository.save(todo20);


        System.out.println("--------Query1--------");
        Query query1 = new Query();
        query1.addCriteria(Criteria.where("dueDate").lt(new Date()));
        List<Todo> queryTodo = mongoOperation.find(query1, Todo.class);
        for (Todo todo: queryTodo) {
            System.out.println(todo.getTodo());
        }


        System.out.println("--------Query2--------");
        Query query2 = new Query();
        query2.addCriteria(Criteria.where("priority").gte(5).andOperator(Criteria.where("responsible").is(user1)));
        List<Todo> querytodo2 = mongoOperation.find(query2, Todo.class);
        for (Todo todo: querytodo2) {
            System.out.println(todo.getTodo());
        }

        System.out.println("--------Query3--------");
        BasicQuery query3 = new BasicQuery("{$nor: [{todos: {$exists: false}}, {todos: {$size: 0}}, {todos: {$size: 1}}, {todos: {$size: 2}}]}");
        List<User> queryUser = mongoOperation.find(query3, User.class);
        for (User user: queryUser) {
            System.out.println(user.getName());
        }

        System.out.println("--------Query4--------");
        Query query4 = new Query();
        query4.addCriteria(Criteria.where("description").regex("[a-z, A-Z, 0-9, ' ']{30,}"));
        List<Todo> queryTodo3 = mongoOperation.find(query4, Todo.class);
        for (Todo todo: queryTodo3) {
            System.out.println(todo.getTodo());
        }
    }

}