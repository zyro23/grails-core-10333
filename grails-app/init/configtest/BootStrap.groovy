package configtest

import grails.core.GrailsApplication

class BootStrap {

    GrailsApplication grailsApplication

    def init = { servletContext ->
        assert System.getProperty("commonSetting") == "commonSettingFromSysProp"
        assert System.getProperty("envSpecificSetting") == "envSpecificSettingFromSysProp"
        
        assert grailsApplication.config.getProperty("commonSetting") == "commonSettingFromSysProp"
        assert grailsApplication.mainContext.environment.getProperty("commonSetting") == "commonSettingFromSysProp"
        
        assert grailsApplication.config.getProperty("envSpecificSetting") == "envSpecificSettingFromSysProp"
        assert grailsApplication.mainContext.environment.getProperty("envSpecificSetting") == "envSpecificSettingFromSysProp"
    }
    def destroy = {
    }
}
