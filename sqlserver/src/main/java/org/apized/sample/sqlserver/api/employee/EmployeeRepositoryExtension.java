package org.apized.sample.sqlserver.api.employee;

import org.apized.core.model.Apized;
import org.apized.core.model.Layer;
import org.apized.sample.sqlserver.api.organization.Organization;

import java.util.List;

@Apized.Extension(layer = Layer.REPOSITORY)
public interface EmployeeRepositoryExtension {
  List<Employee> findByOrganization(Organization organization);
}
