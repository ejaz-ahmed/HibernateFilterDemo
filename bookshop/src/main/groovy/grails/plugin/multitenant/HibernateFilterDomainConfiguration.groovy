package grails.plugin.multitenant

import org.grails.orm.hibernate.cfg.GrailsAnnotationConfiguration
import grails.core.GrailsApplication
import org.hibernate.MappingException
import org.hibernate.engine.spi.FilterDefinition
import org.slf4j.Logger
import org.slf4j.LoggerFactory


class HibernateFilterDomainConfiguration {
//    private Logger log = LoggerFactory.getLogger(getClass())
//    private GrailsApplication grailsApplication
//    private boolean configLocked
//
//    @Override
//    void setGrailsApplication(GrailsApplication grailsApplication) {
//        super.setGrailsApplication grailsApplication
//        this.grailsApplication = grailsApplication
//    }
//
//    @Override
//    protected void secondPassCompile() throws MappingException {
//        if (configLocked) {
//            return
//        }
//
//        super.secondPassCompile()
//
//        this.addFilterDefinition new FilterDefinition("tenant", "tenant_id = :tenant", [tenant: this.typeResolver.basic('long')])
//
//        for (domainClass in grailsApplication.domainClasses) {
//            if (domainClass.clazz in Tenantable) {
//                log.debug "Enricht ${domainClass} with tenant filter"
//                def entity = this.getClassMapping(domainClass.fullName)
//                entity.addFilter("tenant", "tenant_id = :tenant", false, null, null)
//            }
//        }
//        configLocked = true
//    }

}
