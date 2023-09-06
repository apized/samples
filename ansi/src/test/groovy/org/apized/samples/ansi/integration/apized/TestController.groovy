package org.apized.samples.ansi.integration.apized

import io.micronaut.http.annotation.Controller
import jakarta.transaction.Transactional
import org.apized.micronaut.test.integration.MicronautTestController

@Controller('/integration')
@Transactional
class TestController extends MicronautTestController {
  @Override
  void clearDB() {
    clearPostgresDB()
  }
}
