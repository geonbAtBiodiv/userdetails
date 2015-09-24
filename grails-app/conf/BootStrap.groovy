import au.org.ala.userdetails.Role
import org.codehaus.groovy.grails.commons.ApplicationAttributes

class BootStrap {

    javax.sql.DataSource dataSource

    def grailsApplication

    def init = { servletContext ->
      log.info("Running bootstrap queries")

        def ctx = servletContext.getAttribute(ApplicationAttributes.APPLICATION_CONTEXT)
        ctx.getBean( "customObjectMarshallers" ).register()

      addRoles()
      log.info("Done bootstrap queries.")

    }

    def addRoles(){
        if(Role.findAll().size()==0){
            (new Role([role:'ROLE_ABRS_ADMIN', description:''])).save()
            (new Role([role:'ROLE_ADMIN', description:''])).save()
            (new Role([role:'ROLE_COLLECTION_ADMIN', description:''])).save()
            (new Role([role:'ROLE_COLLECTION_EDITOR', description:''])).save()
            (new Role([role:'ROLE_COLLECTORS_ADMIN', description:''])).save()
            (new Role([role:'ROLE_SYSTEM_ADMIN', description:''])).save()
            (new Role([role:'ROLE_USER', description:''])).save()
            (new Role([role:'ROLE_AVH_CLUB', description:''])).save()
            (new Role([role:'ROLE_VP_ADMIN', description:''])).save()
            (new Role([role:'ROLE_ABRS_INSTITUTION', description:''])).save()
            (new Role([role:'ROLE_SPATIAL_ADMIN', description:''])).save()
            (new Role([role:'ROLE_VP_VALIDATOR', description:''])).save()
            (new Role([role:'ROLE_IMAGE_ADMIN', description:''])).save()
            (new Role([role:'ROLE_AVH_ADMIN', description:''])).save()
        }
    }
}
