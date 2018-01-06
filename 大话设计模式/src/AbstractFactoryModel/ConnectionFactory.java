package AbstractFactoryModel;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 通过反射与配置文件实现抽象工厂方法模式
 */
public class ConnectionFactory {
    private static String driver;
    private static String dburl;
    private static String user;
    private static String password;

    private static final ConnectionFactory FACTORY = new ConnectionFactory();
    private Connection connection;

    static{
        Properties properties = new Properties();
        InputStream in = ConnectionFactory.class.getClassLoader().getResourceAsStream("dbconfig.properties");
        try {
            properties.load(in);
        } catch (IOException e) {
            System.out.println("=======配置文件读取错误=======");
        }
        driver = properties.getProperty("driver");
        dburl = properties.getProperty("dburl");
        user = properties.getProperty("user");
        password = properties.getProperty("password");
    }

    private ConnectionFactory(){}

    public static ConnectionFactory getInstance(){
        return FACTORY;
    }

    /**
     * 通过反射执行连接
     * @return
     */
    public Connection makeConnection() {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(dburl, user, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
