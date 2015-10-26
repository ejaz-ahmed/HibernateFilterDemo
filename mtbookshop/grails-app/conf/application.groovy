

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'demo.auth.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'demo.auth.UserRole'
grails.plugin.springsecurity.authority.className = 'demo.auth.Role'
grails.plugin.springsecurity.logout.postOnly = true 
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
	'/':                ['permitAll'],
	'/error':           ['permitAll'],
	'/index':           ['permitAll'],
	'/index.gsp':       ['permitAll'],
	'/shutdown':        ['permitAll'],
	'/assets/**':       ['permitAll'],
	'/**/js/**':        ['permitAll'],
	'/**/css/**':       ['permitAll'],
	'/**/images/**':    ['permitAll'],
	'/**/favicon.ico':  ['permitAll']
]

hibernate.cache.use_second_level_cache = false
//dataSource.configClass = org.grails.plugin.hibernate.filter.HibernateFilterDomainConfiguration.class