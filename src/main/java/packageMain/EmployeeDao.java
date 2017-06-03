package packageMain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="officer")
public interface EmployeeDao extends PagingAndSortingRepository<Employees,String>{

	public Employees findByName(@Param("call") String vertical);
	
}
