package demo

class Book {
    String title
    Double price
    Integer tenantId

    static constraints = {
        price nullable: true
        tenantId nullable: false
    }

    Book(String title, Double price, Integer tenantId) {
        this.title = title
        this.price = price
        this.tenantId = tenantId
    }

    static hibernateFilters = {
        tenantFilter(condition: tenantId=getAuthenticatedUser().userTenantId)
    }
}
