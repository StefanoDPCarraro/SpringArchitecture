package io.github.stefanodpc.springarch;

public class ControlInversionExample {
    // To instantiate a controller all the following code and more is necessary.
    // That's the main reason to why let Spring handle the dependancy control.


    /*
     *
     * public static void main(String[] args) {
     *  DriverManagerDataSource dataSource = new DriverManagerDataSource();
     *  dataSource.setUrl("url");
     *  dataSource.setUsername("user");
     *  dataSource.setPassword("password");
     * 
     *  Connection conn = dataSource.getConnection();
     * 
     *  EntityManager entityManager = null ----- Needs em factory and continues
     * 
     *  TodoRepository repository = new SimpleJpaRepository<TodoEntity, Integer>(entityManager, ...);
     * 
     *  TodoValidator validator = new TodoValidator(repository);
     *  MailSender sender = new MailSender();
     * 
     *  TodoService service = new TodoService(repository, validator, sender);
     * 
     *  TodoController controller = new TodoController(service);
     * 
     *  }
     */
    
}
