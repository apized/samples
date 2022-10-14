package org.apized.samples.ansi.integration.apized


import io.micronaut.http.annotation.Controller
import org.apized.micronaut.test.integration.MicronautTestController

import javax.transaction.Transactional
import java.sql.Connection
import java.sql.ResultSet

@Controller('/integration')
@Transactional
class TestController extends MicronautTestController {
  @Override
  void clearDB() {
    clearPostgresDB()
  }
}
