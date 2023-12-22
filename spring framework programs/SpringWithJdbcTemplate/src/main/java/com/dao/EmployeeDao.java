package com.dao;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.bean.Employee;
@Repository					// @Repository is dao layer specific annotation  
public class EmployeeDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	public int storeEmployee(Employee emp) {
		try {	
		return jdbcTemplate.update("insert into employee values(?,?,?)", emp.getId(),emp.getName(),emp.getSalary());
		} catch (Exception e) {
		System.err.println(e);
		return 0;
		}
	}
	public int deleteEmployee(int id) {
		try {
	return jdbcTemplate.update("delete from employee where id =?", id);
		} catch (Exception e) {
		System.err.println(e);
		return 0;
		}
	}
	public int updateEmployee(Employee emp) {
		try {
	return jdbcTemplate.update("update employee set salary = ? where id =?",emp.getSalary(),emp.getId());
		} catch (Exception e) {
		System.err.println(e);
		return 0;
		}
	}	
	public List<Map<String, Object>> findEmployee() {
		try {
			return jdbcTemplate.queryForList("select * from employee");
		} catch (Exception e) {
			System.err.println(e);
		}
		return null;
	}
}
