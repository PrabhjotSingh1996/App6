package packageMain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CMDRunner implements CommandLineRunner{
	
	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public void run(String... arg0) throws Exception {
		employeeDao.save(new Employees("1","a","dept w"));
		employeeDao.save(new Employees("2","b","dept w"));
		employeeDao.save(new Employees("3","c","dept e"));
		employeeDao.save(new Employees("4","d","dept e"));
		employeeDao.save(new Employees("5","e","dept r"));
		employeeDao.findAll().forEach(t->System.out.println(t.getId()+"  "+t.getName()+"  "+t.getDepartment()));
	}

}
