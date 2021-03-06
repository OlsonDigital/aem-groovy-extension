package com.icfolson.aem.groovy.extension.services.impl

import com.google.common.base.Optional
import com.icfolson.aem.groovy.extension.GroovyExtensionSpec

class OptionalMetaClassSpec extends GroovyExtensionSpec {

    def "return true if optional is present"() {
        setup:
        def optional = Optional.fromNullable("hello")

        expect:
        optional
    }

    def "return false if optional is absent"() {
        setup:
        def optional = Optional.absent()

        expect:
        !optional
    }

    def "return false if optional is null"() {
        setup:
        Optional<String> optional = null

        expect:
        !optional
    }
}
