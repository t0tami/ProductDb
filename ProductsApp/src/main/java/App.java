public class App {
    public static void main(String[] args){
        dbConnectionImpl connection = new dbConnectionImpl() ;

        connection.insert(new Product("Nothing Phone 2",500));
        }
    }

