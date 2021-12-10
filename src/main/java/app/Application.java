package app;

import app.config.AppConfig;
import app.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Configuration
public class Application {
    public static void main(String[] args) throws SQLException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriver(new com.mysql.cj.jdbc.Driver());
        dataSource.setUrl("jdbc:mysql://localhost:3306/team4soft");
        dataSource.setUsername("root");
        dataSource.setPassword("root");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        //insert
        String sqlInsert = "INSERT INTO user (id,first_name, last_name)"
                + " VALUES (1,'david','krupka')";


        jdbcTemplate.update(sqlInsert);


        //get
        String sqlSelect = "SELECT * FROM user";
        List<User> listContact = jdbcTemplate.query(sqlSelect, new RowMapper<User>() {

            public User mapRow(ResultSet result, int rowNum) throws SQLException {
                User user = new User();
                user.setId(result.getLong("id"));
                user.setFirstName(result.getString("first_name"));
                user.setLastName(result.getString("last_name"));


                return user;
            }

        });

        for (User user : listContact) {
            System.out.println(user);
        }

        //delete
      /*  String sqlDelete = "DELETE FROM user where first_name=?";
        jdbcTemplate.update(sqlDelete, "david");*/

    }
}
