import demo.*
import demo.auth.*

class BootStrap {

    def init = { servletContext ->
        def adminRole = new Role('ROLE_ADMIN').save()
        def userRole = new Role('ROLE_USER').save()

        def testUser1 = new User('his', 'password', 1).save()
        def testUser2 = new User('her', 'password', 2).save()

        UserRole.create testUser1, adminRole, true
        UserRole.create testUser2, adminRole, true
        new Book("Groovy in  Action", 63.30, 1).save(failOnError: true)
        new Book("Groovy in  Action", 53.30, 1).save(failOnError: true)

        new Book("Grails in  Action", 43.30, 2).save(failOnError: true)
        new Book("Grails quickstart guide", 33.30, 2).save(failOnError: true)
    }
    def destroy = {
    }
}
