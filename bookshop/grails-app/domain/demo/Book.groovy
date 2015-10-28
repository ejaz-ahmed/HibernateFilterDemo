package demo

class Book {
    def tenantResolverService
    String title
    Double price
    Integer tenantId

    static constraints = {
        price   nullable: true
    }

     Book(String title, Double price, Integer tenantId) {
        this.title = title
        this.price = price
        this.tenantId = tenantId
    }

    def beforeInsert(){
        if(tenantId == null){
            tenantId = tenantResolverService.resolveTenant()
        }

    }

    def beforeValidate(){
        if(tenantId == null){
            tenantId = tenantResolverService.resolveTenant()
        }
    }
//    static hibernateFilters = {
//        tenantFilter(condition: "tenant_Id= :tenant", default:true, tenant: springSecurityService.getCurrentUser.userTenantId)
//    }
}
