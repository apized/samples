package org.apized.samples.oracle

import org.apized.sample.oracle.api.employee.Employee
import org.apized.sample.oracle.api.employee.EmployeeRepository
import org.apized.sample.oracle.api.employee.EmployeeService
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
