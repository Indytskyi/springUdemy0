package com.indytskyi.springcource.dao;

import com.indytskyi.springcource.models.Person;
import org.springframework.jdbc.core.RowMapper;

import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements RowMapper<Person> {

    // Так как у нас поля имеют такие же названия как и сетеры, есть встроенный RowMappe,
    // который авто
    @Override
    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
        Person person = new Person();

        person.setId(rs.getInt("id"));
        person.setName(rs.getString("name"));
        person.setAge(rs.getInt("age"));
        person.setEmail(rs. getString("email"));

        return person;
    }
}
