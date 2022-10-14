package org.apized.samples.postgres

import org.apized.sample.postgres.api.employee.Employee
import org.apized.sample.postgres.api.employee.EmployeeRepository
import org.apized.sample.postgres.api.employee.EmployeeService
import spock.lang.Specification

class ServiceSpec extends Specification {

  EmployeeService service

  void setup() {
    service = new EmployeeService()
    service.repository = Mock(EmployeeRepository) {
      get(_ as UUID) >> Optional.ofNullable(new Employee())
    }
  }

  void "serv"() {
    when:
    Employee employee = service.get(UUID.randomUUID())

    then:
    employee != null
  }
}
