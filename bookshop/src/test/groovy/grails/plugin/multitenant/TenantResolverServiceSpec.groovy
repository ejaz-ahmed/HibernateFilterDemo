package grails.plugin.multitenant

import grails.test.mixin.TestFor
import com.troutbird.TenantResolverService
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(TenantResolverService)
class TenantResolverServiceSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
