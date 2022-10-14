package org.apized.samples.ansi

import org.apized.sample.ansi.api.employee.Employee
import org.apized.sample.ansi.api.employee.EmployeeRepository
import org.apized.sample.ansi.api.employee.EmployeeService
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
