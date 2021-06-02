package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concrete.SystemPersonnel;

public interface SystemPersonnelService {
	Result add(SystemPersonnel systemPersonnel);
	DataResult<List<SystemPersonnel>> getAll();
}
