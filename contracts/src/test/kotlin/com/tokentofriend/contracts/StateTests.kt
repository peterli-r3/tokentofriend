package com.tokentofriend.contracts

import com.tokentofriend.states.CustomTokenState
import groovy.util.GroovyTestCase.assertEquals
import net.corda.testing.node.MockServices
import org.junit.Test

class StateTests {
    private val ledgerServices = MockServices()

    @Test
    fun hasMessageFieldOfCorrectType() {
        // Does the amount field exist?
        CustomTokenState::class.java.getDeclaredField("message")
        // Is the amount field of the correct type?
        assertEquals(CustomTokenState::class.java.getDeclaredField("message").type, String::class.java)
    }
}